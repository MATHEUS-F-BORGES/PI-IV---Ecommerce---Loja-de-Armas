package br.senac.tads.airsoftware.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan (basePackages = "br.senac.tads.airsoftware.model")
@ComponentScan({"br"})
public class ExemplosSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemplosSpringApplication.class, args);
    }

}
