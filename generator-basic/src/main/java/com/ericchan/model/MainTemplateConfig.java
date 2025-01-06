package com.ericchan.model;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@Data
public class MainTemplateConfig {

    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author;

    /**
     * 输出信息
     */
    private String outputText = "sum = ";

//    public static void doGenerate(String inputPath, String outputPath, Object model) throws IOException, TemplateException {
//        // new 出 Configuration 对象，参数为 FreeMarker 版本号
//        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
//
//        // 指定模板文件所在路径
//        File templateDir = new File(inputPath).getParentFile();
//        configuration.setDirectoryForTemplateLoading(templateDir);
//
//        // 设置模板文件使用的字符集
//        configuration.setDefaultEncoding("UTF-8");
//
//        // 创建模板对象，加载指定模块
//        String templateName = new File(inputPath).getName();
//        Template template = configuration.getTemplate(templateName);
//
//        // 创建数据模型
//        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
//        mainTemplateConfig.setAuthor("Eric");
//        mainTemplateConfig.setLoop(false);
//        mainTemplateConfig.setOutputText("求和结果：");
//
//        // 生成
//        Writer out = new FileWriter(outputPath);
//        template.process(model, out);
//
//        // 生成后别忘了关闭文件哦
//        out.close();
//    }
}
