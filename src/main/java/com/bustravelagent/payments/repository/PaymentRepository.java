package com.bustravelagent.payments.repository;

import com.bustravelagent.payments.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer>  {
}
