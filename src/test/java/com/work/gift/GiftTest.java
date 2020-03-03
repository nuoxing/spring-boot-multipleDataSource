package com.work.gift;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GiftTest {

	

	private MockMvc mockMvc; // 模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化。  
	  
    @Autowired  
    private WebApplicationContext wac; // 注入WebApplicationContext  

    
    
    @Before // 在   测试开始前初始化工作  
    public void setup() {  
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();  
    }  
  
    @Test  
    public void test1() throws Exception {  
        mockMvc.perform(post("/gift/getGiftPageList")
        		.param("pageNum", "1").param("giftType", "001"))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
    
    
    @Test  
    public void testgiveGift() throws Exception {  
        mockMvc.perform(post("/gift/giveGift")
        		.param("giveuserId", "1").param("begiveuserId", "11").param("giftId", "948dff23-bc2e-4877-8b11-f2a96ae700b7,7fe92d56-09c9-4a4a-9ceb-da49627d8375"))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
    
    
    @Test  
    public void testgetGiveGift() throws Exception {  
        mockMvc.perform(post("/gift/getGiveGift")
                .param("userId", "oNAFo5HkyEwpEy-QFiHqsLgMeSiI").param("type", "self").param("pageNum", "1"))
                .andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
    
    @Test  
    public void testgetGiveGift2() throws Exception {  
        mockMvc.perform(post("/gift/getGiveGift")
                .param("userId", "oNAFo5HkyEwpEy-QFiHqsLgMeSiI").param("type", "other").param("pageNum", "1"))
                .andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
	
    
    /**
     * 保存礼物基本信息
     */
    //@Test
    public void testsaveGiftInfo() {
      try {
       String result =  mockMvc.perform(
            MockMvcRequestBuilders
                .fileUpload("/gift/saveGiftInfo")
                .file(
                    new MockMultipartFile("file", "C:/Users/suwenyu/Deskto/gift1.png", ",multipart/form-data", "hello upload".getBytes("UTF-8"))
                ).param("giftdesc", "上传的图片").param("gifttype", "001")
        ).andExpect(MockMvcResultMatchers.status().isOk())
        .andReturn().getResponse().getContentAsString();
        System.out.println(result);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    /**
     * 保存礼物基本信息
     */
    @Test
    public void testsaveGiftInfo2() {
      try {
       String result =  mockMvc.perform(
            MockMvcRequestBuilders
                .fileUpload("/gift/saveGiftInfo2")
                .param("giftdesc", "上传的图片").param("gifttype", "001").param("filepath", "group1/M00/00/01/rBD8aVsMAaOAaMc1AACzV8EbCuo752_big.png")
        ).andExpect(MockMvcResultMatchers.status().isOk())
        .andReturn().getResponse().getContentAsString();
        System.out.println(result);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    
    /**
     * 保存礼物基本信息
     */
    @Test
    public void testcancelGiveGift() {
      try {
       String result =  mockMvc.perform(
            MockMvcRequestBuilders
                .fileUpload("/gift/cancelGiveGift")
                .param("id", "32d60690-fc27-4e22-8090-57c357eba293")
        ).andExpect(MockMvcResultMatchers.status().isOk())
        .andReturn().getResponse().getContentAsString();
        System.out.println(result);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    /**
     * 保存礼物基本信息
     */
    @Test
    public void testgetDicGiftType() throws Exception{
        mockMvc.perform(post("/gift/getDicGiftType")
            .param("giveuserId", "1").param("begiveuserId", "11").param("giftId", "948dff23-bc2e-4877-8b11-f2a96ae700b7,7fe92d56-09c9-4a4a-9ceb-da49627d8375"))
            .andExpect(status().isOk())// 模拟向testRest发送get请求  
            .andDo(print());// 返回执行请求的结果  
    
    }
    
   
}
