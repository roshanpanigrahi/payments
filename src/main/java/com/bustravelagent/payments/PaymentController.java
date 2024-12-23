package com.bustravelagent.payments;

import com.bustravelagent.payments.model.Payment;
import com.bustravelagent.payments.repository.PaymentRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @PostMapping("/add/payment/{busNo}")
    public ResponseEntity<String> addPayment(@PathVariable Integer busNo) {
        Payment payment = new Payment();
        payment.setBookingNo(busNo);
        payment.setDateOfPayment(Instant.now());
        paymentRepository.save(payment);

        return ResponseEntity.ok().body("Payment Updated Successfully");

    }
}
