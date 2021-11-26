package com.example.zendeskticketviewer;

import com.example.zendeskticketviewer.Model.Meta;
import com.example.zendeskticketviewer.Model.Reponse;
import com.example.zendeskticketviewer.Model.Ticket;
import com.example.zendeskticketviewer.Model.Tuple;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;


@Controller
public class TicketController {
    @Autowired
    TicketService ticketService;

    @GetMapping(value={"","/{pageNum}"})
    public String getTicket(Model model, @PathVariable(required = false) Integer pageNum){
                Ticket[] tickets = null;
                Integer pages = ticketService.getPages();
                if (pageNum==null) {
                    tickets = ticketService.getTicketByPage(1);
                }else{
                    tickets = ticketService.getTicketByPage(pageNum);
                }
                model.addAttribute("title", "Ticket List");
                model.addAttribute("tickets", tickets);
                model.addAttribute("pages", pages - 1);
                return "ticket";
    }


}
