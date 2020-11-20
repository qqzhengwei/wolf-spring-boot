package com.wolf.sty.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * redis nodes
 */
@Component
@ConfigurationProperties(prefix = "my.redis")
public class RedisProperties {
    /**
     * 最大连接数
     */
    @Value("${my.redis.jedis.pool.max-active}")
    private int maxActive;
    /**
     * 最大阻塞等待时间(负数表示没限制)
     */
    @Value("${my.redis.jedis.pool.max-wait}")
    private long maxWaitMillis;
    /**
     * 最大空闲
     */
    @Value("${my.redis.jedis.pool.max-idle}")
    private int maxIdle;
    /**
     * 最小空闲
     */
    @Value("${my.redis.jedis.pool.min-idle}")
    private int minIdle;
    /**
     *
     */
    @Value("${my.redis.jedis.pool.testOnBorrow}")
    private boolean testOnBorrow;
    /**
     *
     */
    @Value("${my.redis.jedis.pool.testOnReturn}")
    private boolean testOnReturn;
    /**
     * 节点信息
     */
    private List<Map<String, String>> nodes;

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public long getMaxWaitMillis() {
        return maxWaitMillis;
    }

    public void setMaxWaitMillis(long maxWaitMillis) {
        this.maxWaitMillis = maxWaitMillis;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public boolean getTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean getTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public List<Map<String, String>> getNodes() {
        return nodes;
    }

    public void setNodes(List<Map<String, String>> nodes) {
        this.nodes = nodes;
    }
}
