package com.ericchan.generator;

import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {

    public static void doGenerate(Object model) throws IOException, TemplateException {
        String projectPath = System.getProperty("user.dir");
        // 整个项目的根路径
        File parentFile = new File(projectPath).getParentFile();
        // 输入路径
        String inputPath = new File(parentFile, "demo/acm-template").getAbsolutePath();
        String outPath = projectPath;
        // 生成静态文件
        StaticGenerator.copyFilesByHutool(inputPath, outPath);
        // 生成动态文件
        String inputDynamicFilePath = projectPath + "/generator-basic/src/main/resources/templates";
        String outDynamicFilePath = projectPath + "/acm-template/src/com/yupi/com/MainTemplate.java";
        DynamicGenerator.deGenerate(inputDynamicFilePath, outDynamicFilePath, null);
    }
}