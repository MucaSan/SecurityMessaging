package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@BeforeAll
	static void contextLoads() {
		System.out.println("Test if test starts! ");
	}
	@AfterAll
	static void afterAllTests(){
		System.out.println("Test sessions have eneded!");
	}

}
