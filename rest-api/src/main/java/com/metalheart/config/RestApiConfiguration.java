package com.metalheart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SwaggerContext.class)
@ComponentScan("com.metalheart.rest")
public class RestApiConfiguration {
}
