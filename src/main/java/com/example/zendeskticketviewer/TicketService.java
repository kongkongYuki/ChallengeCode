package com.example.zendeskticketviewer;

import com.example.zendeskticketviewer.Model.Meta;
import com.example.zendeskticketviewer.Model.Reponse;
import com.example.zendeskticketviewer.Model.Ticket;
import com.example.zendeskticketviewer.Model.Tuple;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService implements InitializingBean{
    @Autowired
    private RestTemplate restTemplate;

    private Integer pages;
    private List<String> after_cursor_list;
    private List<String> before_cursor_list;
    private List<Ticket[]> ticket_list;
    private final Integer size = 25;

    public TicketService() {
        pages = 1;
        after_cursor_list = new ArrayList<>();
        before_cursor_list = new ArrayList<>();
        ticket_list = new ArrayList<Ticket[]>();
    }

    public Tuple<HttpStatus, Reponse> sentRequest(String url) throws RuntimeException {
        String plainCreds = "kongkong107522620@gmail.com:13802870556";
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + base64Creds);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<Reponse> response = restTemplate.exchange(url, HttpMethod.GET, request, Reponse.class);
        return new Tuple(response.getStatusCode(), response.getBody());
    }

    public List<Ticket[]> getAllTicket() throws RuntimeException {
            String url = "https://zccyxin.zendesk.com/api/v2/tickets.json?page[size]=" + size;

            Tuple<HttpStatus, Reponse> res = sentRequest(url);
            HttpStatus status = res.getA();
            if (status.is2xxSuccessful()) {
                Meta meta = res.getB().getMeta();
                while (meta.has_more) {
                    String after_cursor = meta.getAfter_cursor();
                    String before_cursor = meta.getBefore_cursor();
                    Ticket[] tickets = res.getB().getTickets();
                    after_cursor_list.add(after_cursor);
                    before_cursor_list.add(before_cursor);
                    ticket_list.add(tickets);

                    pages++;
                    url = "https://zccyxin.zendesk.com/api/v2/tickets.json?page[size]=" + size + "&page[after]=" + after_cursor;
                    res = sentRequest(url);
                    meta = res.getB().getMeta();
                }
            }else if(status.is4xxClientError()){
                throw new HttpClientErrorException(status);
            }else if(status.is5xxServerError()){
                throw new HttpServerErrorException(status);
            }
            return ticket_list;
    }

    public Ticket[] getTicketByPage(int page) throws RuntimeException{
        return ticket_list.get(page-1);
    }

    public List<Ticket[]> getTicket_list() {
        return ticket_list;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void afterPropertiesSet(){
        getAllTicket();
    }
}
