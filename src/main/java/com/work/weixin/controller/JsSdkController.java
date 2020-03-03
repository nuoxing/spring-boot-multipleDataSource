package com.work.weixin.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.work.util.R;
import com.work.weixin.service.JsSdkService;

/**
 * 使用jssdk功能
 * @author suwenyu
 *
 */
@Controller
@RequestMapping("/jsSdk")
public class JsSdkController
{

    @Autowired
    private JsSdkService jsSdkService;
    
    
    @RequestMapping("/getData")
    @ResponseBody
    public R getJsSdkData(String url){
        System.out.println("url="+url);
        Map<String, String> map = jsSdkService.getJsSdkData(url);
        System.out.println(map.get("signature"));
        return R.ok().put(map);
    }
    
    
}