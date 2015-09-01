package org.andy.work.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.sr.work.entity.AcctUser;
import org.sr.work.service.UserService;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
public class TestUserService {

	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);

	@Autowired
	private UserService userService;

	@Test
	public void save() {
		AcctUser acctUser = new AcctUser();
		acctUser.setId(1);
		acctUser.setName("sirui");
		acctUser.setAge(26);
		acctUser.setSex("男");
		Integer id = userService.save(acctUser);
		LOGGER.info(JSON.toJSONString(id));
	}

}
