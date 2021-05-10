package com.github.dhirabayashi.myecho;

public class Main {
    public static void main(String[] args) {
        System.out.println(join(args));
    }

    static String join(String... args) {
        return String.join(" ", args);
    }
}
