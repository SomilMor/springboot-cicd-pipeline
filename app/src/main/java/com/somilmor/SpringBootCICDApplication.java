package com.somilmor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringBootCICDApplication {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute(
                "title",
                "Spring Boot CI/CD Pipeline"
        );

        model.addAttribute(
                "msg",
                "Automated CI/CD pipeline built using Jenkins, Maven, Docker, SonarQube, Kubernetes, and Argo CD."
        );

        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCICDApplication.class, args);
    }
}