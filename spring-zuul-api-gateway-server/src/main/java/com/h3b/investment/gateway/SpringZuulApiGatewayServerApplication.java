package com.h3b.investment.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SpringZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulApiGatewayServerApplication.class, args);
	}
	
	// Instanciate the Bean bellow to trace all the requests (sleuth)
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
