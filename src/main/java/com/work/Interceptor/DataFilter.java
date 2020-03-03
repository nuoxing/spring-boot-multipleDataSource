/*
 * 文件名：DataFilter.java
 * 版权：Copyright by www.chinauip.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年3月22日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.work.Interceptor;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class DataFilter implements Filter 
{

    // XSS处理Map
    private static Map<String,String> xssMap = new LinkedHashMap<String,String>();
    
    static{
        // 含有脚本： script
       // xssMap.put("[s|S][c|C][r|R][i|C][p|P][t|T]", "");
        // 含有脚本 javascript
       // xssMap.put("[\\\"\\\'][\\s]*[j|J][a|A][v|V][a|A][s|S][c|C][r|R][i|I][p|P][t|T]:(.*)[\\\"\\\']", "\"\"");
        // 含有函数： eval
       // xssMap.put("[e|E][v|V][a|A][l|L]\\((.*)\\)", "");
        // 含有符号 <
        xssMap.put("<", "&lt;");
        // 含有符号 >
        xssMap.put(">", "&gt;");
        // 含有符号 (
       // xssMap.put("\\(", "&#40");
        // 含有符号 )
        //xssMap.put("\\)", "&#41");
        // 含有符号 '
        //xssMap.put("'", "&#39");
        // 含有符号 "
        //xssMap.put("\"", "&quot");
        // 含有符号 "
        //xssMap.put("%", "&#37");
        // 含有符号 "
        //xssMap.put(";", "&#59");
        // 含有符号 "
        //xssMap.put("&", "&amp");
        // 含有符号 "
       // xssMap.put("\\+", "&#43");
    }
    
    @Override
    public void destroy()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
        throws IOException, ServletException
    {
        // TODO Auto-generated method stub
        // 强制类型转换 HttpServletRequest
        HttpServletRequest httpReq = (HttpServletRequest)arg0;
        // 构造HttpRequestWrapper对象处理XSS
        HttpRequestWrapper httpReqWarp = new HttpRequestWrapper(httpReq,xssMap);
        System.out.println("filter");
        arg2.doFilter(httpReqWarp, arg1);
    }

    @Override
    public void init(FilterConfig arg0)
        throws ServletException
    {
        // TODO Auto-generated method stub
        
    }

}
