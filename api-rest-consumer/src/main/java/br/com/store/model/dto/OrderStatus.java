package br.com.store.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class OrderStatus {

    private Order order;
    private String status;//progress,completed
    private String message;

    public OrderStatus(Order order, String status, String message) {
        this.order = order;
        this.status = status;
        this.message = message;
    }
}
