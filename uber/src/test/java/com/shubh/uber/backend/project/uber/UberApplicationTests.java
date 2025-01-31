package com.shubh.uber.backend.project.uber;

import com.shubh.uber.backend.project.uber.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberApplicationTests {

	@Autowired
	private EmailSenderService emailSenderService;

	@Test
	void contextLoads() {

		emailSenderService.sendEmail(
				"shubhamrane018@gmail.com",
				"Hello,This is testing email service !",
				"Body of my email"
		);

	}

}
