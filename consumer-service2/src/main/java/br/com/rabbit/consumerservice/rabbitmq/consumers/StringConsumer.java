package br.com.rabbit.consumerservice.rabbitmq.consumers;

import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StringConsumer {

    @RabbitListener(queues = {"product.log"})
    public void consumer(String message){
        log.info("Consumer recived a message " + message);
    }

    @RabbitListener(queues = {"product.pdf"})
    public void consumerPdf(String message){
        log.info("Consumer recived a message " + message);
    }
}
