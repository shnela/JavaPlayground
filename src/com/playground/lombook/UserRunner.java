package com.playground.lombook;

public class UserRunner {
    public static void run() {
        DummyUser dummyUser = new DummyUser("Moon", 42);
        System.out.println(dummyUser.getName() + " " + dummyUser.getAge());

        ValueUser valueUser = new ValueUser("Moon", 43);
        System.out.println(valueUser.getName() + " " + valueUser.getAge());
    }
}
