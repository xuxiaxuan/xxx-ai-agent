package com.xxx.xxximagesearchmcpserver.tools;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: ImageSearchToolTest    // 类名，会自动填充
 * @Author: 许夏轩          // 创建者
 * @Date: 22/05/2025 11:20 下午   // 时间
 * @Version: 1.0     // 版本
 */
@SpringBootTest
class ImageSearchToolTest {

    @Resource
    private ImageSearchTool imageSearchTool;

    @Test
    void searchImage() {
        String result = imageSearchTool.searchImage("computer");
        Assertions.assertNotNull(result);
    }
}
