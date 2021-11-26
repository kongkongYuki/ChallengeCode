package com.example.zendeskticketviewer.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reponse implements Serializable {
    @JsonProperty("tickets")
    private Ticket[] tickets;

    @JsonProperty("meta")
    private Meta meta;

    @JsonProperty("links")
    private Map<String, String> links;

    public Ticket[] getTickets() {
        return this.tickets;
    }

    public Meta getMeta() {
        return meta;
    }

    public Map<String, String> getLinks() {
        return links;
    }
}
