package com.vvs.springwebfluxrestapiguide.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.vvs.springwebfluxrestapiguide.handle.GreetingHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class GreetingRouter {
  @Bean
  public RouterFunction<ServerResponse> route(GreetingHandler handler) {
    return RouterFunctions
      .route(GET("/hello").and(accept(MediaType.APPLICATION_JSON)), handler::greeting);
  }
}
