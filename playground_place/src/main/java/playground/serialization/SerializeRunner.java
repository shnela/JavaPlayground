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
                {
                    "name": "Jason",
                    "age": 42,
                    "grades": [1, 2, 3],
                    "tags": ["foo", "bar"],
                    "moods": ["happy", "sad", "confused"]
                }
                """;

        DummyUser dummyUser = null;
        ValueUser valueUser = null;
        BuildUserNoArgsConstructor buildUser1 = null;
        BuildUserDeserialize buildUser2 = null;
        try {
            dummyUser = mapper.readValue(userJson, DummyUser.class);
            valueUser = mapper.readValue(userJson, ValueUser.class);
            buildUser1 = mapper.readValue(userJson, BuildUserNoArgsConstructor.class);
            buildUser2 = mapper.readValue(userJson, BuildUserDeserialize.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("<<<<<<<<<<>>>>>>>>>>");
        System.out.println(dummyUser);
        System.out.println(valueUser);
        System.out.println(buildUser1);
        System.out.println(buildUser2);
        System.out.println(buildUser2.getMoods().get(0).getClass());
    }
}
