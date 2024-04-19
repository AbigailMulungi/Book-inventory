package com.abigail.examcs.configurations;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    private final String[] allowedOrigins = {"*"};

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        long MAX_AGE_SECS = 3600;
        registry.addMapping("/**")
                .allowedOrigins(allowedOrigins)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "PATCH")
                .maxAge(MAX_AGE_SECS);
    }
}
