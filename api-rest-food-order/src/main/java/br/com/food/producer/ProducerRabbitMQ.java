package br.com.food.producer;

import br.com.food.config.MessagingConfig;
import br.com.food.model.dto.OrderDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProducerRabbitMQ {

    @Autowired
    private RabbitTemplate template;

    public ResponseEntity<?> convertAndSend(OrderDTO orderDTO) {
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, orderDTO);
        return ResponseEntity.ok().build();
    }
}
