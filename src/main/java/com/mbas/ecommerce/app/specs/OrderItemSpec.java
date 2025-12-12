package com.mbas.ecommerce.app.specs;

import com.mbas.ecommerce.app.entities.OrderItem;
import com.mbas.ecommerce.app.enums.OrderStatus;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;

public class OrderItemSpec {
    /** Specification to filter orderitems by status */
    public static Specification<OrderItem> hasStatus(OrderStatus status) {
        return ((root, query, criteriaBuilder) -> status != null ? criteriaBuilder.equal(root.get("status"), status) : null);
    }

    /** Specification to filter order items by date range */
    public static Specification<OrderItem> createdBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return ((root, query, criteriaBuilder) -> {
            if (startDate != null && endDate != null) {
                return criteriaBuilder.between(root.get("createAt"), startDate, endDate);
            } else if (startDate != null) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get("createdAt"), startDate);
            } else if (endDate != null) {
                return criteriaBuilder.lessThanOrEqualTo(root.get("createAt"), endDate);
            } else {
                return null;
            }
        });
    }

    /** Generate specification to filter orderItems by item id */
    public static Specification<OrderItem> hasItemId(Long itemId) {
        return ((root, query, criteriaBuilder) ->
                itemId != null ? criteriaBuilder.equal(root.get("id"), itemId) : null);
    }
}
