package br.com.food.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class OrderDTO {

    private UUID id;
    private List<ProductDTO> productList;
    private BigDecimal totalValue;
    private String status;
}
