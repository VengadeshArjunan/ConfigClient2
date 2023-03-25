package com.example.client.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
		@Value("${greeting:Hello World!}")
		private String greeting;
		
		@Value("${message:Hello World!client2}")
		private String message;
		
		@GetMapping("/greeting")
		public String greetingMessage() {
			return this.greeting;
		}
		
		@GetMapping("/message")
		public String getMessage() {
			return this.message;
		}
}
