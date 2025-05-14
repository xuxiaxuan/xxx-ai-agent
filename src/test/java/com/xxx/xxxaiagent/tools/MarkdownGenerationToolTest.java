package com.xxx.xxxaiagent.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: MarkdownGenerationToolTest    // 类名，会自动填充
 * @Author: 许夏轩          // 创建者
 * @Date: 14/05/2025 8:39 PM   // 时间
 * @Version: 1.0     // 版本
 */
class MarkdownGenerationToolTest {

    @Test
    void generateMarkdown() {
        String fileName="test";
        String content="markdown";
        String title="测试";
        MarkdownGenerationTool markdownGenerationTool=new MarkdownGenerationTool();
        markdownGenerationTool.generateMarkdown(fileName,content,title);
    }
}