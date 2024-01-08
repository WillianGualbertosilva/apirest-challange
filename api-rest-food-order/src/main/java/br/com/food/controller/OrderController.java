package br.com.food.controller;

import br.com.food.model.dto.OrderDTO;
import br.com.food.model.enums.StatusEnum;
import br.com.food.producer.ProducerRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/pedido")
public class OrderController {

    @Autowired
    private ProducerRabbitMQ producerRabbitMQ;

    @PostMapping
    public ResponseEntity<?> saveOrderRestaurant(@RequestBody OrderDTO orderDTO) {
        System.out.println(orderDTO.toString());
        producerRabbitMQ.convertAndSend(
                orderDTO.builder().id(UUID.randomUUID()).status(StatusEnum.PROCESS).productList(orderDTO.getProductList()).totalValue(orderDTO.getTotalValue()).build()
        );
        return ResponseEntity.ok("message send to queue with success");
    }
}
