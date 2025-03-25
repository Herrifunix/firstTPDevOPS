package com.example.TpDevOPS;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Devsecops2ApplicationTests {

	@Test
	void contextLoads() {

		Car car = new Car("BB22CC", "Beef", 2000);

		String plateNumber = car.getPlateNumber();
		assertEquals(plateNumber, "BB22CC");
	}

}