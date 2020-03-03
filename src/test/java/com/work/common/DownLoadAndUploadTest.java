package com.work.common;

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
public class DownLoadAndUploadTest {

	private MockMvc mockMvc; // 模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化。  
	  
    @Autowired  
    private WebApplicationContext wac; // 注入WebApplicationContext  

    
    
    @Before // 在测试开始前初始化工作  
    public void setup() {  
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();  
    } 
    
    /**
     * 测试上传文件
     */
    @Test
    public void testupload() {
      try {
       String result =  mockMvc.perform(
            MockMvcRequestBuilders
                .fileUpload("/upload")
                .file(
                    new MockMultipartFile("file", "test.txt", ",multipart/form-data", "hello upload".getBytes("UTF-8"))
                ).param("relativeId", "11")
        ).andExpect(MockMvcResultMatchers.status().isOk())
        .andReturn().getResponse().getContentAsString();
        System.out.println(result);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  
}
