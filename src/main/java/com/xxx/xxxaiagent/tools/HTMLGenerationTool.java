package com.xxx.xxxaiagent.tools;

import cn.hutool.core.io.FileUtil;
import com.xxx.xxxaiagent.constant.FileConstant;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

import java.nio.charset.StandardCharsets;

/**
 * HTML 文件生成工具
 */
public class HTMLGenerationTool {

    @Tool(description = "Generate an HTML file with given content", returnDirect = false)
    public String generateHTML(
            @ToolParam(description = "Name of the file to save the generated HTML") String fileName,
            @ToolParam(description = "Content to be included in the HTML file") String content,
            @ToolParam(description = "Title of the HTML document", required = false) String title) {
        String fileDir = FileConstant.FILE_SAVE_DIR + "/html";
        String filePath = fileDir + "/" + fileName;
        try {
            FileUtil.mkdir(fileDir);
            // 构建完整的HTML文档
            String htmlContent = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<title>" + (title != null ? title : "Generated Document") + "</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    content + "\n" +
                    "</body>\n" +
                    "</html>";
            FileUtil.writeString(htmlContent, filePath, StandardCharsets.UTF_8);
            return "HTML file generated successfully to: " + filePath;
        } catch (Exception e) {
            return "Error generating HTML file: " + e.getMessage();
        }
    }
}