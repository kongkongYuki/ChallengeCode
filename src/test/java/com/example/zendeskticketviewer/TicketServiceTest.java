package com.example.zendeskticketviewer;

import com.example.zendeskticketviewer.Model.Reponse;
import com.example.zendeskticketviewer.Model.Ticket;
import com.example.zendeskticketviewer.Model.Tuple;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class TicketServiceTest {
    @Test
    void sentRequest() {
        TestRestTemplate testRestTemplate = new TestRestTemplate();
        final String URL = "https://zccyxin.zendesk.com/api/v2/tickets.json?page[size]=25";
        ResponseEntity<String> response = testRestTemplate.withBasicAuth(
                "kongkong107522620@gmail.com", "13802870556").getForEntity(URL,
                String.class);
        assertEquals(200, response.getStatusCodeValue());
        assertTrue(response.getBody().contains("tickets"));
    }
}