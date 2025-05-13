package com.xxx.xxxaiagent.rag;

import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.rag.generation.augmentation.ContextualQueryAugmenter;

/**
 * 创建上下文查询增强器的工厂
 */
public class LoveAppContextualQueryAugmenterFactory {

    public static ContextualQueryAugmenter createInstance() {
        PromptTemplate emptyContextPromptTemplate = new PromptTemplate("""
                你应该输出下面的内容：
                抱歉，我只能回答恋爱相关的问题，别的没办法帮到您哦，
                有问题可以联系专家哦
                """);
        return ContextualQueryAugmenter.builder()
                .allowEmptyContext(false)//允许空上下文
                .emptyContextPromptTemplate(emptyContextPromptTemplate)//空提示词模板
                .build();
    }
}
