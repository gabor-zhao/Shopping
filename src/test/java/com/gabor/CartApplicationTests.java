package com.gabor;

import com.gabor.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartApplicationTests {
	@Autowired
	UserService userService;
	@Test
	public void contextLoads() {
		Assert.assertFalse(userService.validateName("123"));
		Assert.assertTrue(userService.validateName("gabor123"));
	}

}
