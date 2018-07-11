package com.asu;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringSleuthClientApplication {

	private static final Logger LOG = Logger.getLogger(SpringSleuthClientApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(SpringSleuthClientApplication.class, args);
	}
	
	@RequestMapping("/")
	public String rest1(){
		return "I'm SleuthClient";
	}
	@RequestMapping("/test1")
	public String test1(){
		return "Returning from test1 rest endpoint";
	}
	@RequestMapping("/hello")
	public String hello(){
		LOG.log(Level.INFO, "you called home");
		/*return restTemplate.getForObject("http://localhost:8080", String.class);*/
		return "hello there";
	}
	
}
