package com.xxx.xxxaiagent.tools;

import cn.hutool.core.io.FileUtil;
import com.xxx.xxxaiagent.constant.FileConstant;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

import java.nio.charset.StandardCharsets;

/**
 * Markdown 文件生成工具
 */
public class MarkdownGenerationTool {

    @Tool(description = "Generate a Markdown file with given content", returnDirect = false)
    public String generateMarkdown(
            @ToolParam(description = "Name of the file to save the generated Markdown") String fileName,
            @ToolParam(description = "Content to be included in the Markdown file") String content,
            @ToolParam(description = "Title of the Markdown document", required = false) String title) {

        // 确保文件名以.md结尾
        if (!fileName.toLowerCase().endsWith(".md")) {
            fileName = fileName + ".md";
        }

        String fileDir = FileConstant.FILE_SAVE_DIR + "/markdown";
        String filePath = fileDir + "/" + fileName;

        try {
            FileUtil.mkdir(fileDir);

            // 构建标准Markdown内容
            String markdownContent = buildMarkdownContent(title, content);

            FileUtil.writeString(markdownContent, filePath, StandardCharsets.UTF_8);
            return "Markdown file generated successfully to: " + filePath;
        } catch (Exception e) {
            return "Error generating Markdown file: " + e.getMessage();
        }
    }

    private String buildMarkdownContent(String title, String content) {
        StringBuilder sb = new StringBuilder();

        // 添加标题（如果提供）
        if (title != null && !title.trim().isEmpty()) {
            sb.append("# ").append(title.trim()).append("\n\n");
        }

        // 添加内容
        sb.append(content);

        // 确保最后有换行
        if (!content.endsWith("\n")) {
            sb.append("\n");
        }

        return sb.toString();
    }
}