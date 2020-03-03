package com.work.common;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.work.service.TbPictureInfoDataService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TbPictureInfoDataServiceTest {

	
	@Autowired
	private TbPictureInfoDataService tbPictureInfoDataService;
	
	@Test
	public void test1(){
		List<String> list = tbPictureInfoDataService.getPicPathByRelativeId("11");
		System.out.println(list.toString());
	}
}
