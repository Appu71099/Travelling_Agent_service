package com.travelling.travel_planner.congif;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
@Configuration
public class GroqWebClientConfig {

	@Value("${groq.api.key}")
	private String groqApiKey;

	@Bean
	public WebClient groqWebClient() {
	    return WebClient.builder()
	        .baseUrl("https://api.groq.com/openai/v1")
	        .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + groqApiKey)
	        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
	        .build();
	}
}
