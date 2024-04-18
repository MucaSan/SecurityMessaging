package com.example.demo.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contact(){
        return new Contact(
          "Demo Doc API",
          "localhost:8080",
          "demo@email.com"
        );
    }
    private ApiInfoBuilder apiBuilder(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("Test Demo API");
        apiInfoBuilder.description("Swagger API Demo docs, just to showcase my skillset on SpringBoot and Java");
        apiInfoBuilder.license("Open Source license! 2024");
        apiInfoBuilder.version("beta 1.0.0");
        apiInfoBuilder.licenseUrl("localhost:8080");
        apiInfoBuilder.contact(this.contact());
        return apiInfoBuilder;
    }
    @Bean
    public Docket apiDetails(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.repository"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiBuilder().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));
    return docket;
    }
}
