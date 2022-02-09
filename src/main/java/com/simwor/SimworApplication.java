package com.simwor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.simwor.mapper")
public class SimworApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimworApplication.class, args);
	}

}
