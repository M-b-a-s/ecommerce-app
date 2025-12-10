package com.mbas.ecommerce.app.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mbas.ecommerce.app.entities.Payment;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequest {
    private BigDecimal totalPrice;
    private List<OrderItemRequest> items;
    private Payment paymentInfo;
}
