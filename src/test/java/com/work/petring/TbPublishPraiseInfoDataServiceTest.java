package com.work.petring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.work.petring.service.TbPublishPraiseInfoDataService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TbPublishPraiseInfoDataServiceTest {

	
	@Autowired
	private TbPublishPraiseInfoDataService tbPublishPraiseInfoDataService;
	
	@Test
	public void testgetPraisePageData(){
		tbPublishPraiseInfoDataService.getPraisePageData(1, "5f5cff5b-cfd1-45cb-9bd9-ac152a5e2efc", null);
	}
	
	@Test
	public void testInsert(){
		String id = "badc6916-4033-46e7-b11e-06720073526a";
		tbPublishPraiseInfoDataService.insert(id, "测试用户id");
	}
	@Test
	public void testdel(){
	   int num =  tbPublishPraiseInfoDataService.delete("8FD056C6-982F-CA32-1078-B7CADCA47C0B", "C30E6F6C-4F32-3D1E-FCE2-65AEB19F893E");
	   System.out.println(num);
	}
}
