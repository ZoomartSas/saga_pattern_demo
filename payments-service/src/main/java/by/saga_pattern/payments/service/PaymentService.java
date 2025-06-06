package by.saga_pattern.payments.service;

import by.javaguru.core.dto.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> findAll();

    Payment process(Payment payment);
}
