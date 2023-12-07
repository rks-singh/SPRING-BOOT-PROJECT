package com.ravi;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxPublisherTest {

	@Test
	public void testMono() {
		
		Mono<String> mono = Mono.just("Hello Ravi").log();
		mono.subscribe(System.out::println);
	}
	
	@Test
	public void fluxTest(){
		Flux<String> flux = Flux.just("Java","Python","C++").log();
		flux.subscribe(System.out::println);
	}
}
