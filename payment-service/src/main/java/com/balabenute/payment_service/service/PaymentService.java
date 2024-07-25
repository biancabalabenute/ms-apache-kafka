package com.balabenute.payment_service.service;

import com.balabenute.payment_service.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
