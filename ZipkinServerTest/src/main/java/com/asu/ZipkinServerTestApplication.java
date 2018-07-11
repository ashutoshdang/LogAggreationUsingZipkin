package com.asu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
//@EnableZipkinStreamServer
//@EnableBinding
public class ZipkinServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerTestApplication.class, args);
	}
}
