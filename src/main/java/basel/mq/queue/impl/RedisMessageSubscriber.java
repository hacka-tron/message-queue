package basel.mq.queue.impl;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RedisMessageSubscriber implements MessageListener {

    public void onMessage(final Message message, final byte[] pattern) {
        System.out.println("Message received: " + new String(message.getBody()));
    }
}