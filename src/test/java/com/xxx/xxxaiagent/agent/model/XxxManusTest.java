package com.xxx.xxxaiagent.agent.model;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: XxxManusTest    // 类名，会自动填充
 * @Author: 许夏轩          // 创建者
 * @Date: 23/05/2025 6:18 下午   // 时间
 * @Version: 1.0     // 版本
 */
@SpringBootTest
class XxxManusTest {

    @Resource
    private XxxManus XxxManus;

    @Test
    void run() {
        String userPrompt = """  
                我的另一半居住在吉首大学张家界校区，请帮我找到 5 公里内合适的约会地点，搜索相关图片,  
                生成一份‘周末约会计划’PDF，包含餐厅预订、活动流程和礼物清单等""";
        String answer = XxxManus.run(userPrompt);
        Assertions.assertNotNull(answer);
    }

}
