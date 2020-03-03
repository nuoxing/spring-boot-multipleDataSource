package com.work.weixin.controller;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.work.weixin.util.MessageUtil;
import com.work.weixin.util.SignUtil;
import com.work.weixin.wechat.dispatcher.EventDispatcher;
import com.work.weixin.wechat.dispatcher.MsgDispatcher;

@Controller
@RequestMapping("/weixin/wechat")
public class WechatSecurity {
	private static Logger logger = Logger.getLogger(WechatSecurity.class);

	/**
	 * 先是通过验证签名，微信服务器和自己的服务器之间建立链接,首次接入验证时才会收到echostr参数
	 * 
	 * @Description: 用于接收 get 参数，返回验证参数
	 * @param @param request
	 * @param @param response
	 * @param @param signature
	 * @param @param timestamp
	 * @param @param nonce
	 * @param @param echostr
	 * @author dapengniao
	 * @date 2016 年 3 月 4 日 下午 6:20:00
	 */
	@RequestMapping(value = "security", method = RequestMethod.GET)
	public void doGet(
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value = "signature", required = true) String signature,
			@RequestParam(value = "timestamp", required = true) String timestamp,
			@RequestParam(value = "nonce", required = true) String nonce,
			@RequestParam(value = "echostr", required = true) String echostr) {
		try {
			System.out.println("get");
			if (SignUtil.checkSignature(signature, timestamp, nonce)) {
				PrintWriter out = response.getWriter();
				out.print(echostr);//签名正确，成功接连
				System.out.println("签名功能");
				out.close();
			} else {
				logger.info("这里存在非法请求！");
			}
		} catch (Exception e) {
			logger.error(e, e);
		}
	}
    
	
	/**
	 * 	 post 方法用于接收微信服务端消息,文本，图片，url等
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "security", method = RequestMethod.POST)
	public void DoPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("这是 post 方法！");
		String result = "";
		try {
		    //getBodyMsg(request);
			//从 request 中取得输入流   
	        InputStream inputStream = request.getInputStream(); 
	        //把xml文档解释成map
			Map<String, String> map = MessageUtil.parseXml(inputStream);
			String msgtype = map.get("MsgType");
			if (MessageUtil.REQ_MESSAGE_TYPE_EVENT.equals(msgtype)) {
				result = EventDispatcher.processEvent(map); // 进入事件处理
			} else {
				result = MsgDispatcher.processMessage(map); // 进入消息处理
			}
			//结果回复
			PrintWriter out = response.getWriter();
			out.print(result);
			out.close();
			out = null;
		} catch (Exception e) {
			logger.error(e, e);
		}
	}
	
	private void getBodyMsg(HttpServletRequest request){
	    try
        {
            InputStream inputStream = request.getInputStream();
            StringBuilder sb = new StringBuilder();
            BufferedInputStream bf = new BufferedInputStream(inputStream);
            byte[] b = new byte[1024];
            int num = bf.read(b);
            while (num != -1){
                sb.append(new String(b,"utf-8"));
                num = bf.read(b);
            }
            System.out.println("接收的xml数据="+sb.toString());
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}