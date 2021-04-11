package playground.serialization;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import playground.lombook.DummyUser;
import playground.lombook.ValueUser;

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
        String userJson = """
                {"name": "Jason", "age": 42}
                """;

        DummyUser dummyUser = null;
        ValueUser valueUser = null;
        try {
            dummyUser = mapper.readValue(userJson, DummyUser.class);
            valueUser = mapper.readValue(userJson, ValueUser.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("<<<<<<<<<<>>>>>>>>>>");
        System.out.println(dummyUser);
        System.out.println(valueUser);
    }
}
