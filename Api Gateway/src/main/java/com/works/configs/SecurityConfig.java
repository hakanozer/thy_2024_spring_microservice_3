package com.works.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return
                http
                        .csrf( csrf -> csrf.disable() )
                        .formLogin( formLogin -> formLogin.disable() )
                        .build();
    }

}

/*
ali01 -> product,
veli01 -> customer,
zehra01 -> product, customer
 */