package br.com.food.infra.repository;

import br.com.food.infra.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {


}
