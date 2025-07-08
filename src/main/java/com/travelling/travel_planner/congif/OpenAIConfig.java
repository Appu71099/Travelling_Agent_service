package com.travelling.travel_planner.congif;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class OpenAIConfig {

	@Value("${openai.api.key}")
	private String openAiApiKey;

	@Value("${openai.api.url}")
	private String openAiUrl;

	@Bean
	public WebClient openAIWebClient() {
		return WebClient.builder().baseUrl(openAiUrl).defaultHeader("Authorization", "Bearer " + openAiApiKey).build();
	}
}
