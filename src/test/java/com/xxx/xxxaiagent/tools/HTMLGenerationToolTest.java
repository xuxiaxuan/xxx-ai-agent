package com.xxx.xxxaiagent.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: HTMLGenerationToolTest    // 类名，会自动填充
 * @Author: 许夏轩          // 创建者
 * @Date: 14/05/2025 8:44 PM   // 时间
 * @Version: 1.0     // 版本
 */
class HTMLGenerationToolTest {

    @Test
    void generateHTML() {
        String fileName="test";
        String content="html";
        String title="测试";
        HTMLGenerationTool htmlGenerationTool=new HTMLGenerationTool();
        htmlGenerationTool.generateHTML(fileName,content,title);
    }
}