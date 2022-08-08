package com.galvanize;

public class Application {
    public static void main(String[] args) {
        if (args.length != 2) {
            if (args.length == 0) {
                System.out.println("Please specify a name and email");
            } else if (args.length == 1) {
                System.out.println("Please specify an email for " + args[0]);
            }
            System.exit(1);
        }

        System.out.println(String.format("%s <%s>", args[0], args[1]));
    }
}
