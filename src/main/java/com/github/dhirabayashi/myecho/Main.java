package com.github.dhirabayashi.myecho;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.print(join(args));
    }

    static String join(String... args) {
        String newLine = "\n";
        if(args.length != 0 && args[0].equals("-n")) {
            newLine = "";
            args = Arrays.stream(args).skip(1).toArray(String[]::new);
        }
        return String.join(" ", args) + newLine;
    }
}
