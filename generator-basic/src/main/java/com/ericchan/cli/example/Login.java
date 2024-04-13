package com.ericchan.cli.example;

import picocli.CommandLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

@CommandLine.Command
public class Login implements Callable<Integer> {
    @CommandLine.Option(names = {"-u", "--user"}, description = "User name")
    String user;

    @CommandLine.Option(names = {"-p", "--password"}, description = "Passphrase", arity = "0..1", interactive = true)
    String password;

    @CommandLine.Option(names = {"-cp", "--checkPassword"}, description = "Check Password", arity = "0..1", interactive = true)
    String checkPassword;

    @CommandLine.Option(names = "--interactive", interactive = true)
    String value;

    public Integer call() throws Exception {
        System.out.println("user = " + user);
        System.out.println("password = " + password);
        System.out.println("checkPassword = " + checkPassword);
        System.out.println("value = " + value);
        return 0;
    }

    public static void main(String[] args) {
        // Arrays.copyOfRange(args, 1, args.length);
        List<String> arrArgs = new ArrayList<String>();
        arrArgs.add("-u");
        arrArgs.add("Eric");
        arrArgs.add("-p");
        arrArgs.add("666");
        arrArgs.add("-cp");
        if (!Arrays.asList(args).contains("--interactive")) {
            arrArgs.add("--interactive");
        }

        String[] newArgs = new String[arrArgs.size()];
        for (int i = 0; i < arrArgs.size(); i++) {
            newArgs[i] = arrArgs.get(i);
        }
        new CommandLine(new Login()).execute(newArgs);
    }
}
