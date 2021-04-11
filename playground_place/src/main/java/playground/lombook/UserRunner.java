package playground.lombook;

public class UserRunner {
    public static void run() {
        DummyUser dummyUser = new DummyUser("Moon1", 42);
        System.out.println(dummyUser.getName() + " " + dummyUser.getAge());

        ValueUser valueUser = new ValueUser("Moon2", 43);
        System.out.println(valueUser.getName() + " " + valueUser.getAge());

//        BuildUser buildUser = new BuildUser("Moon3", 44);
        BuildUser buildUser = BuildUser.builder()
                .name("Moon3")
                .age(44)
                .build();
        System.out.println(buildUser.getName() + " " + buildUser.getAge());
    }
}
