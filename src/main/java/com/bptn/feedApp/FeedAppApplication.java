package com.bptn.feedApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FeedAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedAppApplication.class, args);
	}

}
