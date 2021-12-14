
package com.example.springproj3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Springproj3ApplicationTests {

	@Test
	void testFireStore() throws ExecutionException, InterruptedException {

		User temp = new User("Zeyneb Nagiyeva", 20);

		UserService.saveUser(temp);

		User getTemp = UserService.getUserDetails("Zeyneb Nagiyeva");

		assertEquals(temp.getName(), getTemp.getName());
		assertEquals(temp.getAge(), getTemp.getAge());
	}

}
