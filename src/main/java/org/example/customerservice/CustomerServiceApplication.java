package org.example.customerservice;

import org.example.customerservice.dao.entity.Customer;
import org.example.customerservice.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerService customerService) {
        return args -> {

            Stream.iterate(1, n -> n + 1)
                    .limit(5)
                    .map(x -> new Customer(null, "name" + x, "customer" + x + "@gmail.com"))
                    .forEach(customerService::addCustomer);


        };
    }

}
