package com.work.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.csource.common.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.work.domain.TbDicGiftType;
import com.work.service.GiftService;
import com.work.util.R;

/**
 * 礼物controller
 * @author suwenyu
 *
 */
@RestController
@RequestMapping("/gift")
public class GiftController {

	
	@Autowired
	private GiftService giftService;
	
	
	

	/**
	 * 分页获取礼物数据
	 * @param pageNum
	 * @param giftType
	 * @return
	 */
	@RequestMapping("/getGiftPageList")
	public R getGiftPageData(Integer pageNum,String giftType){
		if (pageNum == null) {
			return R.error("参数异常，获取不到页码");
		}
		if (StringUtils.isEmpty(giftType)){
			return R.error("操作失败，giftType参数为空");
		}
		List<Map<String, Object>> lists = giftService.getGiftPageData(pageNum, giftType);
		return R.ok().put(lists);
	}
	
	
	
	/**
	 * 保存赠送礼物情况
	 * @param giveuserId 赠送人id
	 * @param begiveuserId 被赠送人id
	 * @param giftId 礼物id
	 * @return
	 */
	@RequestMapping("/giveGift")
	public R giveGift(String giveuserId,String begiveuserId,String giftId){
		if (StringUtils.isEmpty(giveuserId)){
			return R.error("操作失败，giveuserId参数为空");
		}
		if (StringUtils.isEmpty(begiveuserId)){
			return R.error("操作失败，begiveuserId参数为空");
		}
		if (StringUtils.isEmpty(giftId)){
			return R.error("操作失败，giftId参数为空");
		}
		int num = giftService.saveGiveGift(giveuserId, begiveuserId, giftId);
		if (num==0){
			return R.error("操作失败");
		}
		return R.ok("操作成功");
	}
	
	
	/**
	 * 取消赠送礼物情况
	 * @param id
	 * @return
	 */
	@RequestMapping("/cancelGiveGift")
	public R cancelGiveGift(String id){
		if (StringUtils.isEmpty(id)){
			return R.error("操作失败，id参数为空");
		}
		int num = giftService.cancelGiveGift(id);
		if (num==0){
			return R.error("删除失败");
		}
		return R.ok("删除成功");
	}
	
	
	/**
	 * 获取赠送情况
	 * @param userId
	 * @param type self表示获取自己的赠送情况  other获取自己被赠送情况数据
	 * @return
	 */
	@RequestMapping("/getGiveGift")
	public R getGiveGift(String userId,String type,Integer pageNum,String endtime){
		if (StringUtils.isEmpty(userId)){
			return R.error("操作失败，userId参数为空");
		}
		if (StringUtils.isEmpty(type)){
			return R.error("操作失败，type参数为空");
		}
		if (pageNum == null){
			return R.error("操作失败，id参数为空");
		}
		List<Map<String, Object>> list = giftService.getGiveGift(userId, type, pageNum, endtime);
		return R.ok().put(list);
	}
	
	
	
	/**
	 * 保存礼物的基本信息
	 * @param file
	 * @param giftdesc
	 * @param gifttype
	 * @return
	 */
    @RequestMapping("/saveGiftInfo")
	public R saveGiftInfo(@RequestParam("file") MultipartFile file,String giftdesc,String gifttype){
    	if (file.isEmpty()){
 	    	return R.error("文件为空");
 	    }
    	try {
			int num = giftService.saveGiftInfo(file, giftdesc, gifttype);
			if (num == 0){
				return R.error("保存失败");
			}
		} catch (IOException | MyException e) {
			e.printStackTrace();
			return R.error("保存失败，系统异常");
		}
    	return R.ok("保存成功");
	}
	
	
    /**
	 * 保存礼物的基本信息
	 * @param file
	 * @param giftdesc
	 * @param gifttype
	 * @return
	 */
    @RequestMapping("/saveGiftInfo2")
	public R saveGiftInfo2(String filepath,String giftdesc,String gifttype){
    	try {
			int num = giftService.saveGiftInfo2(filepath, giftdesc, gifttype);
			if (num == 0){
				return R.error("保存失败");
			}
		} catch (IOException | MyException e) {
			e.printStackTrace();
			return R.error("保存失败，系统异常");
		}
    	return R.ok("保存成功");
	}
    
    
    
    @RequestMapping("/getDicGiftType")
    public R getDicGiftType(){
        List<TbDicGiftType> list = giftService.getDicGiftType();
        return R.ok().put(list);
    }
	
}
