package com.playground.serialization;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import com.playground.lombook.DummyUser;
import com.playground.lombook.ValueUser;

public class SerializeRunner {

    private final static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    public static void run() {
        String userJson = "{\"name\": \"Jason\", \"age\": 42}";

        DummyUser dummyUser = new DummyUser("Moon", 42);
        ValueUser valueUser = new ValueUser("Moon", 43);
    }
}
