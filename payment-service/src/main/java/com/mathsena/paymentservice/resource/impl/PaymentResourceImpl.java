package com.mathsena.paymentservice.resource.impl;

import com.mathsena.paymentservice.model.Payment;
import com.mathsena.paymentservice.resource.PaymentResource;
import com.mathsena.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements PaymentResource {

    private final PaymentService paymentService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {

        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
