package com.work.common;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

	private MockMvc mockMvc; // 模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化。  
	  
    @Autowired  
    private WebApplicationContext wac; // 注入WebApplicationContext  

    
    
    @Before // 在   测试开始前初始化工作  
    public void setup() {  
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();  
    }  
    
    
    @Test  
    public void test1() throws Exception {  
        mockMvc.perform(post("/user/saveUser")
        		.param("userInfo", "[{\"userId\":\"oNAFo5A4yJTBEra013bJwFidOyo4\",\"avatar\":\"https://wx.qlogo.cn/mmopen/vi_32/zBZticicTY3TPjSt1HnQcRnKQJ0VSWtNG98C4rpDeEcicNkGLzMmWb6vA9giaTic956tXJBbflYUicruRxN0ArYgMW0Q/132\",\"userName\":\"李厚桦\",\"sex\":\"男\",\"city\":\"Guangzhou\"}]\r\n" + 
        				""))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
    @Test  
    public void test2() throws Exception {  
        mockMvc.perform(post("/user/updateUser")
        		.param("userInfo", "[{\"userId\":\"47602C2-D16F-B690-B254-C66D0C5840D4\",\"avatar\":\"https://wx.qlogo.cn/mmopen/vi_32/zBZticicTY3TPjSt1HnQcRnKQJ0VSWtNG98C4rpDeEcicNkGLzMmWb6vA9giaTic956tXJBbflYUicruRxN0ArYgMW0Q/132\",\"userName\":\"李桦\",\"city\":\"Guangzhou\"}]\r\n" + 
        				"" ))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
    @Test  
    public void test3() throws Exception {  
        mockMvc.perform(post("/user/showUser")
        		.param("userId", "oNAFo5A4yJTBEra013bJwFidOyo4"))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
    @Test  
    public void test4() throws Exception {  
        mockMvc.perform(post("/user/getIpetList")
        		.param("userId", "oNAFo5A4yJTBEra013bJwFidOyo4"))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
    @Test  
    public void test6() throws Exception {  
        mockMvc.perform(post("/user/getIpet")
        		.param("ipetId", "81e2dff8-e89c-4374-b322-fb969b345bdb"))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
    
    @Test  
    public void test5() throws Exception {  
        mockMvc.perform(post("/user/saveIpet")
        		.param("userId", "oNAFo5A4yJTBEra013bJwFidOyo4")
        		.param("ipetInfo", " [{ \"id\":\"1\",\"name\": \"皮皮\", \"type\": \"拉布拉多\", \"age\": \"1岁\", \"sex\": \"公\", \"weight\": \"30kg\", \"petLength\": \"90cm\", \"remark\": \"魔鬼中的天使\", \"distance\": \"2.1km\"}]\r\n" + 
        				""))
        		.andExpect(status().isOk())// 模拟向testRest发送get请求  
                .andDo(print());// 返回执行请求的结果  
          
    }  
}
