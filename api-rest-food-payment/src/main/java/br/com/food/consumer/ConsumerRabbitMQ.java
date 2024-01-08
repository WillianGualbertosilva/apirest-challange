package br.com.food.consumer;

import br.com.food.config.MessagingConfig;
import br.com.food.model.dto.OrderDTO;
import br.com.food.model.service.PaymentService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsumerRabbitMQ {

    @Autowired
    PaymentService paymentService;




    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderDTO orderDTO) {
        System.out.println("Message recieved from queue : " + orderDTO);
        paymentService.save(orderDTO);




    }
}
