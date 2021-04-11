package playground.serialization;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;
import playground.lombook.Mood;

import java.util.List;

@JsonDeserialize(builder = BuildUserDeserialize.BuildUserDeserializeBuilder.class)
@Builder
//@AllArgsConstructor
@Value
public class BuildUserDeserialize {
    String name;
    int age;
    List<Integer> grades;
    List<String> tags;
    List<Mood> moods;

    @JsonPOJOBuilder(withPrefix = "")
    public static class BuildUserDeserializeBuilder {
    }
}
