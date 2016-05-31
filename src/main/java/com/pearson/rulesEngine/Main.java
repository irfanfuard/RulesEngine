package com.pearson.rulesEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Main Method
 * @author UFUARIR
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.pearson.rulesEngine"})   // we can rplace all thses annotations with @SpringBootApplication.but it is good to add them all(can configure more easily)

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
