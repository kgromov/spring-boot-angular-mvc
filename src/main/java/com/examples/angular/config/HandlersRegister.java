package com.examples.angular.config;

import com.examples.angular.handlers.UserEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlersRegister {

    @Bean
    public UserEventHandler userEventHandler() {
        return new UserEventHandler();
    }
}
