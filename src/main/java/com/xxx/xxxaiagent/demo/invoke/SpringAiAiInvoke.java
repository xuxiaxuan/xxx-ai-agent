package com.xxx.xxxaiagent.demo.invoke;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: SpringAiAiInvoke    // 类名，会自动填充
 * @Author: 许夏轩          // 创建者
 * @Date: 2025/4/28 22:13   // 时间
 * @Version: 1.0     // 版本
 */

import jakarta.annotation.Resource;
import org.springframework.ai.chat.client.advisor.api.Advisor;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * springai框架方式调用ai
 */
//@Component
public class SpringAiAiInvoke implements CommandLineRunner {

    @Resource
    private ChatModel dashscopeChatModel;

    @Override
    public void run(String... args) throws Exception {
        AssistantMessage hello = dashscopeChatModel.call(new Prompt("hello"))
                .getResult()
                .getOutput();
        System.out.println(hello.getText());
    }

}
