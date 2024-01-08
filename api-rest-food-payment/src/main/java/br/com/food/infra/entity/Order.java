package br.com.food.infra.entity;

import br.com.food.model.enums.StatusEnum;
import br.com.food.model.dto.OrderDTO;
import br.com.food.model.dto.ProductDTO;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    private UUID id;
    private List<ProductDTO> productList;
    private BigDecimal totalValue;

    private StatusEnum statusEnum;

    public Order converterToEntity(OrderDTO orderDTO) {

        return Order.builder()
                .id(orderDTO.getId())
                .totalValue(orderDTO.getTotalValue())
                .productList(orderDTO.getProductList())
                .statusEnum(StatusEnum.CONCLUDED)
                .build();
    }
}
