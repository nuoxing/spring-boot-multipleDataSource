package com.work.petring;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.work.petring.service.TbPublishDynamicInfoDataService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TbPublishDynamicInfoDataServiceTest {

	@Autowired
	private TbPublishDynamicInfoDataService tbPublishDynamicInfoDataService;
	
	@Test
	public void testgetPetRingListData(){
		tbPublishDynamicInfoDataService.getDynamicPageData(1, "2018-12-31 11:00:00");
	}
	
	//@Test
	public void testInsert(){
		//tbPublishDynamicInfoDataService.insert("47602C2-D16F-B690-B254-C66D0C5840D4", "测试内容","11");
	}
	
	@Test
	public void testgetDynamicPageDataInLogin(){
		tbPublishDynamicInfoDataService.getDynamicPageDataInLogin(1,"4B7602C2-D16F-B690-B254-C66D0C5840D4", "2018-12-31 11:00:00","self");
	}
	
	@Test
	public void testgetDynamicPageDataInNotLogin(){
		BigDecimal longitude, latitude;
		longitude = new BigDecimal(23);
		latitude = new BigDecimal(147);
		tbPublishDynamicInfoDataService.getDynamicPageDataInNotLogin(longitude,latitude);
	}
	
	@Test
	public void delete(){
		tbPublishDynamicInfoDataService.delete("feff4ad0-56da-4416-a415-9895fcf756ac");
	}
	
}
