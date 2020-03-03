package com.work.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 将springboot中 的jackjson换成更好用的fastjson
 * 并处理中文乱码问题
 * fastjson的应用可以查看 https://www.w3cschool.cn/fastjson/
 * 
 * 通过注解可以完成一些功能
 * 例如 @JSONField(format="yyyyMMdd") 日期格式化
 * 		@JSONField(serialize=false) 字段不显示
 * @author ljj
 *
 */
@Configuration
public class JsonConfig {
    
  
	/**
	 * 在这里我们使用 @Bean注入 fastJsonHttpMessageConvert
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		// 1、需要先定义一个 convert 转换消息的对象;
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		
		//2、添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat,
            SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty,
            SerializerFeature.DisableCircularReferenceDetect,
            SerializerFeature.WriteNullListAsEmpty);
		  
		//自定义 过滤器 解决map中的value为null时 转""
	     ValueFilter filter = new ValueFilter() {
	        @Override
	        public Object process(Object obj, String s, Object v) {
	        
	        if(v==null)
	            return "";
	        return v;
	        }
	    };
		
		fastJsonConfig.setSerializeFilters(filter);
		// 处理中文乱码问题
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);
		
		//3、在convert中添加配置信息.
		fastConverter.setFastJsonConfig(fastJsonConfig);
		
		
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}
}
