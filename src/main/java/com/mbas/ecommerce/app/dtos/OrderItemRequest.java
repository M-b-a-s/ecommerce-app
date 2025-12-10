package com.mbas.ecommerce.app.dtos;

import lombok.Data;

@Data
public class OrderItemRequest {
    private int productId;
    private int quantity;
}
