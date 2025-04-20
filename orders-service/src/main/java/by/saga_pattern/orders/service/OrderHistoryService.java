package by.saga_pattern.orders.service;

import by.javaguru.core.types.OrderStatus;
import by.saga_pattern.orders.dto.OrderHistory;

import java.util.List;
import java.util.UUID;

public interface OrderHistoryService {
    void add(UUID orderId, OrderStatus orderStatus);

    List<OrderHistory> findByOrderId(UUID orderId);
}
