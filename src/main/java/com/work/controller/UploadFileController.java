package com.work.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.csource.common.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.work.service.TbPictureInfoDataService;
import com.work.util.FastDfsUtil;
import com.work.util.LogUtils;
import com.work.util.R;


@RestController
public class UploadFileController {


	
	@Autowired
	private TbPictureInfoDataService tbPictureInfoDataService;
	
	@RequestMapping("/upload")
	public R uploadFile(@RequestParam("file") MultipartFile file,String relativeId,String picType,String suffixName){
	    if (file.isEmpty()){
	    	return R.error("文件为空");
	    }
	    try {
	    	LogUtils.debug(getClass(), "文件上传");
	        LogUtils.debug(getClass(), suffixName);
			String filePath = FastDfsUtil.uploadFile(file.getBytes(), suffixName, null);
			LogUtils.debug(getClass(), filePath);
			if (StringUtils.isEmpty(relativeId)){
				relativeId = UUID.randomUUID().toString();
			}
			int size = file.getBytes().length;
			int num = tbPictureInfoDataService.save(relativeId, picType, filePath,size);
			if (num == 0){
				return R.error("文件上传失败");
			}
		} catch (IOException | MyException e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw,true));
			LogUtils.error(getClass(), "上传文件异常，错误信息="+sw.toString());
			e.printStackTrace();
			return R.error("上传失败");
		}
		return R.ok().put(relativeId);
		
	}
	
}
