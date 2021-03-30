package com.example.demo.boot;

import org.springframework.core.annotation.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class DemoCommandLineSecondRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner is Executed as order of 2");
    }

}
