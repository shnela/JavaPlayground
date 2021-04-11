package playground.lombook;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Value
public class ValueUser {
    String name;
    int age;

//    public ValueUser() {
//        name = null;
//        age = 0;
//    }
}
