package com.h3b.investment.preload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringPreloadDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPreloadDataServiceApplication.class, args);
	}

	// Instanciate the Bean bellow to trace all the requests (sleuth)
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
