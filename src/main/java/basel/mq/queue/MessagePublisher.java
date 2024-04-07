package basel.mq.queue;

public interface MessagePublisher {

    void publish(final String message);
}