package com.work.petring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

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
public class PetRingControllerTest {

	private MockMvc mockMvc; // 模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化。  
	  
    @Autowired  
    private WebApplicationContext wac; // 注入WebApplicationContext  

    
    
    @Before // 在   测试开始前初始化工作  
    public void setup() {  
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();  
    }  
  
    //@Test  
    public void test1() throws Exception {  
        mockMvc.perform(post("/petring/getpagelist")
        		.param("pageNum", "1"))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  

    
    @Test  
    public void test2() throws Exception {  
        mockMvc.perform(post("/petring/getDynamicPageDataInLogin")
        		.param("pageNum", "1").param("dynamicTime", "").param("userId", "oNAFo5KIOgBqnjCuC-zTLeCPHNxo"))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
   // @Test  
    public void test3() throws Exception {  
        mockMvc.perform(post("/petring/getPublishPageDataInNotLogin")
        		.param("longitude", "23").param("latitude", "140"))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
   // @Test
    public void testSave() throws Exception {  
        mockMvc.perform(post("/petring/savePetRing")
        		.param("longitude", "23").param("latitude", "140").param("userId", "1")
        		.param("content", "测试").param("dom", "测试地址"))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    } 
    
    
   // @Test
    public void testsaveFocusUser() throws Exception {  
        mockMvc.perform(post("/petring/saveFocusUser")
        		.param("focusId", "12").param("userId", "12")
        		)
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    } 
    
    @Test
    public void testdelFocusUser() throws Exception {  
        mockMvc.perform(post("/petring/deleteFocusUser")
        		.param("focusId", "12").param("userId", "12")
        		)
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    } 
    
    
   

}
