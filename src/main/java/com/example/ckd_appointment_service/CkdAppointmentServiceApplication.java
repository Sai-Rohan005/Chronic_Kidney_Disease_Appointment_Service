package com.example.ckd_appointment_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.example.ckd_appointment_service",
        "Controllers",
        "Database",
        "services"
})
public class CkdAppointmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CkdAppointmentServiceApplication.class, args);
    }

}
