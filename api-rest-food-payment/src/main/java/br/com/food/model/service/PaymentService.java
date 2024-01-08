package br.com.food.model.service;

import br.com.food.infra.entity.Order;
import br.com.food.infra.repository.OrderRepository;
import br.com.food.model.dto.OrderDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    private static final Logger log = LoggerFactory.getLogger(PaymentService.class);
    @Autowired
    OrderRepository orderRepository;

    public void save(OrderDTO orderDTO) {
        log.info(orderDTO.toString());
        Order save = orderRepository.save(new Order().converterToEntity(orderDTO));
    }
}
