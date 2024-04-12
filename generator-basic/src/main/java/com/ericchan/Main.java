package com.ericchan;

import com.ericchan.generator.StaticGenerator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        File projectFile = new File(projectPath);
        String inputPath = new File(projectFile, "demo/acm-template").getAbsolutePath();
        String outPath = projectPath + "\\recursive";
        StaticGenerator.copyFilesByRecursive(inputPath, outPath);
    }
}