package com.work.weixin.wechat.dispatcher;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.work.weixin.util.MessageUtil;
import com.work.weixin.wechat.message.resp.Article;
import com.work.weixin.wechat.message.resp.NewsMessage;
import com.work.weixin.wechat.message.resp.TextMessage;



/**接收的是消息类型
 * ClassName: MsgDispatcher
 * @Description: 消息业务处理分发器
 * @author dapengniao
 * @date 2016 年 3 月 7 日 下午 4:04:21
 */
public class MsgDispatcher {
	
	//六种消息类型
    public static String processMessage(Map<String, String> map) {
        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) { // 文本消息
            System.out.println("==============这是文本消息！");
            return text(map);
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) { // 图片消息
            System.out.println("==============这是图片消息！");
            return  image(map);
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) { // 链接消息
            System.out.println("==============这是链接消息！");
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) { // 位置消息
            System.out.println("==============这是位置消息！");
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) { // 视频消息
            System.out.println("==============这是视频消息！");
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) { // 语音消息
            System.out.println("==============这是语音消息！");
        }

        return null;
    }
    
    //文本类型的回复
    public static String text(Map<String, String> map){
    	String openid=map.get("FromUserName"); //用户 openid
    	String mpid=map.get("ToUserName");   //公众号原始 ID

    	//普通文本消息

    	TextMessage txtmsg=new TextMessage();
    	txtmsg.setToUserName(openid);
    	txtmsg.setFromUserName(mpid);
    	txtmsg.setCreateTime(new Date().getTime());
    	txtmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

    	if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) { // 文本消息
    	    txtmsg.setContent("你好，测试数据");
    	    //将类转换成xml
    	    return MessageUtil.textMessageToXml(txtmsg);
    	}
    	return null;
    }
    
    
    //图片
    public static String image(Map<String, String> map){
    	 //对图文消息
    	String openid=map.get("FromUserName"); //用户 openid
    	String mpid=map.get("ToUserName");   //公众号原始 ID
    	NewsMessage newmsg=new NewsMessage();
    	newmsg.setToUserName(openid);
    	newmsg.setFromUserName(mpid);
    	newmsg.setCreateTime(new Date().getTime());
    	newmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);

    	if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) { // 图片消息
    	    System.out.println("==============这是图片消息！");
    	    Article article=new Article();
    	    article.setDescription("这是图文消息 1"); //图文消息的描述
    	    article.setPicUrl("http://res.cuiyongzhi.com/2016/03/201603086749_6850.png"); //图文消息图片地址
    	    article.setTitle("图文消息 1");  //图文消息标题
    	    article.setUrl("http://www.cuiyongzhi.com");  //图文 url 链接
    	    List<Article> list=new ArrayList<Article>();
    	    list.add(article);     //这里发送的是单图文，如果需要发送多图文则在这里 list 中加入多个 Article 即可！
    	    newmsg.setArticleCount(list.size());
    	    newmsg.setArticles(list);
    	    return MessageUtil.newsMessageToXml(newmsg);
    	}    
    	return null;
    }
}