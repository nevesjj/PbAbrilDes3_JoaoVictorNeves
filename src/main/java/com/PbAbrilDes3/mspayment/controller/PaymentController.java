package com.PbAbrilDes3.mspayment.controller;

import com.PbAbrilDes3.mspayment.dto.CustomerPointsDto;
import com.PbAbrilDes3.mspayment.dto.PaymentRequest;
import com.PbAbrilDes3.mspayment.entity.Payment;
import com.PbAbrilDes3.mspayment.service.PaymentRbMqService;
import com.PbAbrilDes3.mspayment.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private PaymentRbMqService paymentRbMqService;

    @PostMapping
    public ResponseEntity<Payment> createPayment(@Valid @RequestBody PaymentRequest paymentRequest) {
        //TODO validar se o customerId existe dentro do mscustomer se nao existir devolver um erro
        Payment savedPayment = paymentService.createPayment(paymentRequest);
        //TODO fazer a chamada do calculate e buscar o total
        paymentRbMqService.updatePoints(new CustomerPointsDto(paymentRequest.getCustomerId(), 10));
        return ResponseEntity.status(201).body(savedPayment);
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable UUID paymentId) {
        Payment payment = paymentService.getPaymentById(paymentId);
        return ResponseEntity.ok(payment);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Payment>> getPaymentsByCustomerId(@PathVariable Long customerId) {
        List<Payment> payments = paymentService.getPaymentsByCustomerId(customerId);
        return ResponseEntity.ok(payments);
    }
}
