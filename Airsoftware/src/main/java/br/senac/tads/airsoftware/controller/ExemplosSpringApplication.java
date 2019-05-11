package br.senac.tads.airsoftware.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan (basePackages = "br.senac.tads.airsoftware.model")
public class ExemplosSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemplosSpringApplication.class, args);
    }

}
