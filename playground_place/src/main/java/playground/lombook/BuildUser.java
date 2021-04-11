package playground.lombook;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BuildUser {
    String name;
    int age;
}
