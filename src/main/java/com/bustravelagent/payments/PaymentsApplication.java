package com.bustravelagent.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentsApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(PaymentsApplication.class);

        // Set the active profile programmatically
        application.setAdditionalProfiles("dev");

        application.run(args);
    }

}
