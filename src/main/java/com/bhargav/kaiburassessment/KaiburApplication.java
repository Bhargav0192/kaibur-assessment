package com.bhargav.kaiburassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableWebMvc
@SpringBootApplication
public class KaiburApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaiburApplication.class, args);
	}

}
