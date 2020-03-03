package com.work.config;


import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.work.util.R;
import com.work.util.result.HttpResult;


/**
 * 1、新建一个Class,这里取名为GlobalDefaultExceptionHandler
 * 2、在class上添加注解，@ControllerAdvice;主要是用来Controller
 * 的一些公共的需求的低侵入性增强提供辅助，作用于@RequestMapping标注的方法上。
 * 3、在class中添加一个方法
 * 4、在方法上添加@ExcetionHandler拦截相应的异常信息；
 * 自定义错误处理器，可自己组装json字符串，并返回到页面。
 * 5、如果返回的是View -- 方法的返回值是ModelAndView;
 * 6、如果返回的是String或者是Json数据，那么需要在方法上添加@ResponseBody注解.
 * 
 * 
 * @author ljj
 */
/**
 * 该注解是spring2.3以后新增的一个注解，
 * @author ljj
 *
 */
@ControllerAdvice
@ResponseBody
public class GlobalDefaultExceptionHandler {
	
	private static Logger LOGGER = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);  
	
	@ExceptionHandler(Exception.class)
	public R defaultExceptionHandler(HttpServletRequest req,HttpServletResponse response,Exception ex){
		StringWriter sw = new StringWriter();
        ex.printStackTrace(new PrintWriter(sw, true));
		/**
		 * 可以自定义截获异常，并进行处理
		 */
		if (ex instanceof MissingServletRequestParameterException) {
			//写入日志
			LOGGER.error("系统错误，错误信息=" + sw.toString());
			return R.error("对不起，服务器异常，请稍后处理！");
        }  
		
		/** 
         * 未知异常 
         */  
		
        LOGGER.error("系统错误，错误信息=" + sw.toString());
        return R.error("对不起，服务器异常，请稍后处理！");
	}
	
}
