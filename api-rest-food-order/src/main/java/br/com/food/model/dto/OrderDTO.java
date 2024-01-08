package br.com.food.model.dto;

import br.com.food.model.enums.StatusEnum;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class OrderDTO {

    private UUID id;
    private List<ProductDTO> productList;
    private BigDecimal totalValue;
    private StatusEnum status;
}
