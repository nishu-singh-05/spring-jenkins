package com.example.jenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsApplication {
	//public static Logger Logger= LoggerFactory.getLogger(JenkinsApplication.class);

/*	@PostConstruct
	public void init(){
		Logger.info("Application Started");
	}*/

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
