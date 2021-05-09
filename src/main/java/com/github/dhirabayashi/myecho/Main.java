package com.github.dhirabayashi.myecho;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(join(args));
    }

    static String join(String... args) {
        return Arrays.stream(args)
                .map(arg -> {
                    if(arg.startsWith("$")) {
                        return System.getenv(arg.substring(1));
                    } else if(arg.startsWith("\\$")) {
                        return arg.substring(1);
                    } else {
                        return arg;
                    }
                })
                .collect(Collectors.joining(" "));
    }
}
