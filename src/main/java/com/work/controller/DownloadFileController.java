package com.work.controller;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.work.util.FastDfsUtil;

/**
 * 下载文件的controller
 * @author suwenyu
 *
 */
@Controller
public class DownloadFileController {

	
	
	//group1/M00/00/00/rBD8aVrbNrGAPc_GAAAFrIbv1XQ54_big.conf
    @RequestMapping("/downfile")
    public void downFile(String  filepath, HttpServletResponse resp){
    	long start = System.currentTimeMillis();
        resp.setContentType("application/octet-stream; charset=utf-8");
        int i = filepath.lastIndexOf("/");
        String filename = null;
        filename = filepath.substring(i+1);
        try {
			filename = new String(filename.getBytes("utf-8"),"ISO-8859-1");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
        resp.setHeader("Content-Disposition", "inline; filename=" + filename);//浏览器直接打开
        try {
        	byte[] bs = FastDfsUtil.downLoadFile(filepath);
        	System.out.println("文件大小="+bs.length);
        	resp.addHeader("Content-Length",String.valueOf(bs.length));
            IOUtils.copy(new ByteArrayInputStream(bs), resp.getOutputStream());
            System.out.println("文件名="+filepath + "  耗时="+(System.currentTimeMillis()-start) + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
}
