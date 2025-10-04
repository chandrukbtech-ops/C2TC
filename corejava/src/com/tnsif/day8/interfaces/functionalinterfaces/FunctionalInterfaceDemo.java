package com.tnsif.day8.interfaces.functionalinterfaces;

@FunctionalInterface
interface GreetInterface {
    String greet();
}

class GreetClass implements GreetInterface {
    public String greet() {
        return "Good Morning";
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        GreetClass g = new GreetClass();
        System.out.println(g.greet());

        // Using Lambda Expression
        GreetInterface g1 = () -> {
            return "Good Afternoon";
        };

        System.out.println(g1.greet());
    }
}
