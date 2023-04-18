package com.vvs.springwebfluxrestapiguide.handle;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.vvs.springwebfluxrestapiguide.model.Greeting;

import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {
  public Mono<ServerResponse> greeting(ServerRequest request) {
    return ServerResponse
      .ok()
      .contentType(MediaType.APPLICATION_JSON)
      .body(BodyInserters.fromValue(new Greeting("Hello, Everybody!")));
  }
}
