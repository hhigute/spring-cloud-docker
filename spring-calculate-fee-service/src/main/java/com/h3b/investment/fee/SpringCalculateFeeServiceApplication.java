package com.h3b.investment.fee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com.h3b.investment.fee")
@EnableEurekaClient
public class SpringCalculateFeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCalculateFeeServiceApplication.class, args);
	}

	// Instanciate the Bean bellow to trace all the requests (sleuth)
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
