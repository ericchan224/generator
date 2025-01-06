package com.ericchan;

import com.ericchan.cli.command.CommandExecutor;
import com.ericchan.generator.StaticGenerator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}