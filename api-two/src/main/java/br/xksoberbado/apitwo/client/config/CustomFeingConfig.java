package br.xksoberbado.apitwo.client.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomFeingConfig {

    @Bean
    Logger.Level loggerLevel() {
        return Logger.Level.BASIC;
    }
}
