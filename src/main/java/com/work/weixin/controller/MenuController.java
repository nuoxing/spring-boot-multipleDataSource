
package com.work.weixin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.work.weixin.service.MenuService;


/**
 * 自定义菜单
 * @author suwenyu
 *
 */
@Controller
@RequestMapping("/menu")
public class MenuController
{
    
    @Autowired
    private MenuService menuService;
    
    

}
