package com.work.Interceptor;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public final class HttpRequestWrapper extends HttpServletRequestWrapper {

	private Map<String, String> xssMap;
	
	public HttpRequestWrapper(HttpServletRequest request) {
		super(request);
	}

	public HttpRequestWrapper(HttpServletRequest request,
			Map<String, String> xssMap) {
		super(request);
		this.xssMap = xssMap;
	}

	@Override
	public String[] getParameterValues(String parameter) {
	    System.out.println("11111111111111");
		String[] values = super.getParameterValues(parameter);
		if (values == null) {
			return null;
		}
		int count = values.length;
		// 遍历每一个参数，检查是否含有
		String[] encodedValues = new String[count];
		for (int i = 0; i < count; i++) {
			encodedValues[i] = cleanXSS(values[i]);
		}
		return encodedValues;
	}

	@Override
	public String getParameter(String parameter) {
	    System.out.println("222222222");
		String value = super.getParameter(parameter);
		System.out.println("参数name="+parameter+"   参数值="+value);
		if (value == null) {
			return null;
		}
		if(!parameter.equals("dispatchUrl"))
			return cleanXSS(value);
		return value;
	}

	

	/**
	 * 清除恶意的XSS脚本
	 * 
	 * @param value
	 * @return
	 */
	private String cleanXSS(String value) {
	    System.out.println("数据清洗");
		Set<String> keySet = xssMap.keySet();
		for(String key : keySet){
			String v = xssMap.get(key);
			value = value.replaceAll(key,v);
		}
		return value;
	}
	
}