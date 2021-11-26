package com.example.zendeskticketviewer.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {
    @JsonProperty("has_more")
    public boolean has_more;

    @JsonProperty("after_cursor")
    private String after_cursor;

    @JsonProperty("before_cursor")
    private String before_cursor;

    public boolean isHas_more() {
        return has_more;
    }

    public String getAfter_cursor() {
        return after_cursor;
    }

    public String getBefore_cursor() {
        return before_cursor;
    }

}
