package com.ericchan.generator;

import cn.hutool.core.io.FileUtil;

public class StaticGenerator {

    /**
     * 运用Hutool进行静态文件复制
     * @param inputPaht
     * @param outputPath
     */
    public static void copyFilesByHutool(String inputPaht, String outputPath) {
        FileUtil.copy(inputPaht, outputPath, false);
    }
}
