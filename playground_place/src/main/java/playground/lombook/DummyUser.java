package playground.lombook;

public class DummyUser {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DummyUser() {
        this.name = null;
        this.age = 0;
    }

    public DummyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
