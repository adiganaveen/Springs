package com.bridgelabz.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = { "com.bridgelabz.spring" })
public class DIConfiguration {

	@Bean
	public MessageService getMessageService() {
		return new EmailService();
	}
}