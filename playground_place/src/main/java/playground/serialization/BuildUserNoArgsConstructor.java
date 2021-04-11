package playground.serialization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;


@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Value
public class BuildUserNoArgsConstructor {
    String name;
    int age;
}
