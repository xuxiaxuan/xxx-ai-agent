package com.xxx.xxxaiagent.agent.model;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: AgentState    // 类名，会自动填充
 * @Author: 许夏轩          // 创建者
 * @Date: 23/05/2025 5:35 下午   // 时间
 * @Version: 1.0     // 版本
 */
/**
 * 代理执行状态的枚举类
 */
public enum AgentState {

    /**
     * 空闲状态
     */
    IDLE,

    /**
     * 运行中状态
     */
    RUNNING,

    /**
     * 已完成状态
     */
    FINISHED,

    /**
     * 错误状态
     */
    ERROR
}
