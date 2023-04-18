package com.vvs.springwebfluxrestapiguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vvs.springwebfluxrestapiguide.client.GreetingClient;

@SpringBootApplication
public class SpringWebfluxRestapiGuideApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringWebfluxRestapiGuideApplication.class, args);
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		System.out.println(">> message = ".concat(greetingClient.getMessage().block()));
	}
}
