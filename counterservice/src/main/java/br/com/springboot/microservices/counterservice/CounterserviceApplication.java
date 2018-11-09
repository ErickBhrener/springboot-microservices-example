package br.com.springboot.microservices.counterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="br.com.springboot.microservices")
@EnableDiscoveryClient
public class CounterserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterserviceApplication.class, args);
	}
}
