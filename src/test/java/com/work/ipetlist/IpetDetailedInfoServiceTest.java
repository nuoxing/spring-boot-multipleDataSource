package com.work.ipetlist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.work.ipetlist.service.IpetDetailedInfoService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IpetDetailedInfoServiceTest {

	
	@Autowired
	private IpetDetailedInfoService ipetDetailedInfoService;
	
	@Test
	public void testInsert(){
		ipetDetailedInfoService.insert();
	}
	
}
