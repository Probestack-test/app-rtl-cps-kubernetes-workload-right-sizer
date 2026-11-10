package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Kubernetes Workload Right-Sizer")
                                .description("Continuous resource optimization for Kubernetes workloads. Analyzes real  CPU and memory usage over time and generates right-sizing recommendations  for requests and limits. Prevents both over-provisioning (wasted money)  and under-provisioning (OOMKills, throttling). Understands workload  patterns (steady, periodic, spiky) and respects criticality tiers.  Optionally applies recommendations with automatic rollback on regression. ")
                                .contact(
                                        new Contact()
                                                .name("ForgeSphere Platform Engineering")
                                                .email("platform@forgesphere.example.com")
                                )
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                )
        ;
    }
}
