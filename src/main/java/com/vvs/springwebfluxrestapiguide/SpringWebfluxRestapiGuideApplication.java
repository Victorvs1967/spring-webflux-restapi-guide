package com.vvs.springwebfluxrestapiguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vvs.springwebfluxrestapiguide.client.GreetingClient;

@SpringBootApplication
public class SpringWebfluxRestapiGuideApplication {

	public static void main(String[] args) {
		// create app context
		ConfigurableApplicationContext context = SpringApplication.run(SpringWebfluxRestapiGuideApplication.class, args);
		// add webclient to context
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		// get result
		System.out.println(">> message = ".concat(greetingClient.getMessage().block()));
	}
}
