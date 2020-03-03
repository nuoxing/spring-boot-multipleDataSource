package com.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 项目启动类
 * @author ljj
 * @SpringBootApplication springboot应用注解
 *
 */
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@EnableCaching
public class Application extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    
    
    /**
     * 将项目达成war包的配置
     * 进入项目的src目录下面 运行mvn package 生成war包
     * 或者在eclipse run as maven build  
     * 输入命令 clean package 进行打包
     * 添加-Dmaven.test.skip=true 不执行测试用例，也不编译测试用例类
     * 或者-DskipTests 不执行测试用例，但编译测试用例类生成相应的class文件至target/test-classes下。
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO Auto-generated method stub
        // return super.configure(builder);
        return builder.sources(Application.class);
    }
}

