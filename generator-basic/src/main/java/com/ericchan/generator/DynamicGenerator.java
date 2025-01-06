package com.ericchan.generator;

import com.ericchan.model.MainTemplateConfig;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicGenerator {

    public static void main(String[] args) throws IOException, TemplateException {
    }

    public static void deGenerate(String inputPath, String outputPath, Object model) throws IOException, TemplateException {
        // new 出 Configuration 对象，参数为 FeeMarker版本号
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);

        // 指定版本文件所在的路径
        configuration.setDirectoryForTemplateLoading(new File(inputPath));

        // 设置模板文件使用的字符集
        configuration.setDefaultEncoding("utf-8");

        //
        configuration.setNumberFormat("0.######");

        // 创建模板对象，加载指定模块
        String templateName = new File(inputPath, "MainTemplate.java.ftl").getName();
        Template template = configuration.getTemplate(templateName);

        // 创建数据模型
        if(model == null) {
            MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
            mainTemplateConfig.setAuthor("陈曦");
            // 不使用循环
            mainTemplateConfig.setLoop(false);
            mainTemplateConfig.setOutputText("就这？？？");

            model = mainTemplateConfig;
        }

        // 生成
        Writer out = new FileWriter(outputPath);
        template.process(model, out);

        // 生成后关闭文件
        out.close();
    }
}
