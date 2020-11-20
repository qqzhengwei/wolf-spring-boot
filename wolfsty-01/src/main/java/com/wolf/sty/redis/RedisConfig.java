package com.wolf.sty.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * redis配置
 *
 * @author Yong.Liang
 * @version 1.0
 * @date 2019年04月12日
 */
@Configuration
@EnableConfigurationProperties(RedisProperties.class)
public class RedisConfig {

    @Autowired
    private RedisProperties redisProperties;

    /**
     * 配置 redis
     *
     * @return
     */
    @Bean
    @Scope("singleton")
    public ShardedJedisPool shardedJedisPool() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(redisProperties.getMaxIdle());
        jedisPoolConfig.setMaxWaitMillis(redisProperties.getMaxWaitMillis());
        jedisPoolConfig.setMinIdle(redisProperties.getMinIdle());
        jedisPoolConfig.setMaxTotal(redisProperties.getMaxActive());
        jedisPoolConfig.setTestOnBorrow(redisProperties.getTestOnBorrow());
        jedisPoolConfig.setTestOnReturn(redisProperties.getTestOnReturn());

        List<JedisShardInfo> jedisShardInfoList = new ArrayList<>();
        for (Map<String, String> info : redisProperties.getNodes()) {
            JedisShardInfo jedisShardInfo = new JedisShardInfo(info.get("host"), Integer.valueOf(info.get("port")), Integer.valueOf(info.get("timeout")));
            jedisShardInfo.setPassword(info.get("password"));
            jedisShardInfoList.add(jedisShardInfo);
        }
        ShardedJedisPool shardedJedisPool = new ShardedJedisPool(jedisPoolConfig, jedisShardInfoList);
        return shardedJedisPool;
    }
}
