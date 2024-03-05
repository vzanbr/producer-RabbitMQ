package br.com.rabiit.producer.services;

import br.com.rabiit.producer.configs.RabbitMQConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class StringService {

    private final RabbitTemplate rabbitTemplate;

    public StringService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void produce(String message) {
        log.info("Recived message" + message);
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXG_NAME_MARKETPLACE,
                RabbitMQConfig.RK_PRODUCT_LOG, message);
    }
}
