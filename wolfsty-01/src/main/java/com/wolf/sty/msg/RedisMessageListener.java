package com.wolf.sty.msg;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.lang.Nullable;

/**
 * Created by user on 2020/9/23.
 */
public class RedisMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message, @Nullable byte[] bytes) {
        //消息体
        String body = new String(message.getBody());
        //渠道名称
        String topic = new String(bytes);
        System.out.println(body);
        System.out.println(topic);
    }
}
