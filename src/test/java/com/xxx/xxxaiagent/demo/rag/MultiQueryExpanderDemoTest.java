package com.xxx.xxxaiagent.demo.rag;

import com.xxx.xxxaiagent.app.LoveApp;
import com.xxx.xxxaiagent.demo.rag.MultiQueryExpanderDemo;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.ai.rag.Query;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MultiQueryExpanderDemoTest {

    @Resource
    private LoveApp loveApp;

    @Resource
    private MultiQueryExpanderDemo multiQueryExpanderDemo;

    @Test
    void expand() {
        List<Query> queries = multiQueryExpanderDemo.expand("啥是程恋爱大师啊啊啊啊啊啊？！请回答我哈哈哈哈");
        Assertions.assertNotNull(queries);
    }
}
