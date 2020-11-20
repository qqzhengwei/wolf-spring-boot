package com.wolf.sty.service.redis;

import redis.clients.jedis.ShardedJedis;

/**
 * ShardedJedis相关接口
 */
public interface IRedisDataSource {

    ShardedJedis getRedisClient();

    void returnResource(ShardedJedis shardedJedis);

    void returnResource(ShardedJedis shardedJedis, boolean broken);
}
