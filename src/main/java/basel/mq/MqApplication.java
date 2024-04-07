package basel.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import basel.mq.queue.MessagePublisher;

@SpringBootApplication
public class MqApplication {

	@Autowired
	private MessagePublisher messagePublisher;

	public static void main(String[] args) {
		SpringApplication.run(MqApplication.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void makeOneMessage() throws InterruptedException {
		messagePublisher.publish("hello");
	}
}
