package com.hashedin.migration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AcmeProjectSpringbootApplicationTest {

	@MockBean
	private SpringApplication springApplication;

	@Test
	public void contextLoads() {
		AcmeProjectSpringbootApplication.main(new String[] {});
		assertTrue(true);
	}
}