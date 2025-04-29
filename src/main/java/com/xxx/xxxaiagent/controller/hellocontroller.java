package com.xxx.xxxaiagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: hellocontroller    // 类名，会自动填充
 * @Author: 许夏轩          // 创建者
 * @Date: 2025/4/28 21:27   // 时间
 * @Version: 1.0     // 版本
 */
@RestController
@RequestMapping("/hello")
public class hellocontroller {

    @GetMapping
    public String gethello(){
        return "sss";
    }

}
