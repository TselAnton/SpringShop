package com.tsel.pet.project.spring.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class SpringShopApplication {

		public static void main(String[] args) {
			SpringApplication.run(SpringShopApplication.class, args);
		}

		@Bean
		@Description("Spring Message Resolver")
		public ResourceBundleMessageSource messageSource() {
			ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
			messageSource.setBasename("messages");
			return messageSource;
		}
}
