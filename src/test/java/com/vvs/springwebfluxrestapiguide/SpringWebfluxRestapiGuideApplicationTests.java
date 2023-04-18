package com.vvs.springwebfluxrestapiguide;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.vvs.springwebfluxrestapiguide.model.Greeting;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringWebfluxRestapiGuideApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testGreeting() {
		webTestClient
			.get()
			.uri("/hello")
			.accept(MediaType.APPLICATION_JSON)
			.exchange()
			.expectStatus()
			.isOk()
			.expectBody(Greeting.class)
			.value(greeting -> {
				assertThat(greeting.getMesssage()).isEqualTo("Hello, Everybody!");
			});
	}

}
