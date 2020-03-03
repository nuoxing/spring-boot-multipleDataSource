package com.work.petring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.work.petring.service.TbPublishCommentInfoDataService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TbPublishCommentInfoDataServiceTest {

	@Autowired
	private TbPublishCommentInfoDataService tbPublishCommentInfoDataService;
	
	
	@Test
	public void testgetCommentPageData(){
		tbPublishCommentInfoDataService.getCommentPageData(1, "B1BE34D4-329B-311D-240A-F7CAB4388CCB", null);
	}
	
	@Test
	public void testInsert(){
		String id = "badc6916-4033-46e7-b11e-06720073526a";
		tbPublishCommentInfoDataService.insert(id, "4B7602C2-D16F-B690-B254-C66D0C5840D4", "4B7602C2-D16F-B690-B254-C66D0C5840D4", "测试评论");
	}
}
