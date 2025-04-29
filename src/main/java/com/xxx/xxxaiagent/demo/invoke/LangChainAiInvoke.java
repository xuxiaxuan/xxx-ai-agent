package com.xxx.xxxaiagent.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: LangChainAiInvoke    // 类名，会自动填充
 * @Author: 许夏轩          // 创建者
 * @Date: 2025/4/28 22:26   // 时间
 * @Version: 1.0     // 版本
 */
/**
 * langchain4j方式调用ai
 */
public class LangChainAiInvoke {

    public static void main(String[] args) {
        ChatLanguageModel qwenChatModel = QwenChatModel.builder()
                .apiKey(TestApiKey.API_KEY)
                .modelName("qwen-max")
                .build();
        String hello = qwenChatModel.chat("hello");
        System.out.println(hello);
    }
}
