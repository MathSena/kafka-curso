package com.mathsena.paymentservice.service;

import com.mathsena.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
