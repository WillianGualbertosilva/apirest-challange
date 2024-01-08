package br.com.food.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Import(MessagingConfig.class)
public class MessagingConfigTest {

    @MockBean
    private ConnectionFactory connectionFactory;

    @Test
    public void testBeansCreation() {
        // Retrieve beans from the application context
//        Queue queue = MessagingConfig.queue();
//        TopicExchange exchange = MessagingConfig.exchange();
//        Binding binding = MessagingConfig.binding(queue, exchange);
//        RabbitTemplate rabbitTemplate = MessagingConfig.template(connectionFactory);

        // Assert that beans are not null
//        assertNotNull(queue);
//        assertNotNull(exchange);
//        assertNotNull(binding);
//        assertNotNull(rabbitTemplate);

        // Here, you can add more specific assertions for your configuration
        // For instance, you could verify the names or properties of the created beans.
    }
}