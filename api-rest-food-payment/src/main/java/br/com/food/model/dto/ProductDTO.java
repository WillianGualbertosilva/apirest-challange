package br.com.food.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ProductDTO {
    private String description;
    private BigDecimal value;
}
