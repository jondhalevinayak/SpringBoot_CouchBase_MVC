package com.ups.controller;

import com.couchbase.client.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.couchbase.client.deps.com.fasterxml.jackson.databind.ObjectWriter;

/**
 * Created by dbg1lnb on 10/15/2016.
 */
public class BaseController {

    private String createJsonString(final Object response){
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = "";
        try {
            json = ow.writeValueAsString(response);
        } catch ( JsonProcessingException e ) {
            System.out.println("Json Exception");
        }
        return json;
    }

    public String getResponse(Object data) {
        return createJsonString(data);
    }

}
