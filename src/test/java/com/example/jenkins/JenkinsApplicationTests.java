package com.example.jenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsApplicationTests {
	public static org.slf4j.Logger Logger= LoggerFactory.getLogger(JenkinsApplication.class);

	@Test
	public void contextLoads() {
		Logger.info("Test case 1");
		assertEquals(true,true);
	}

}
