package com.work.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.work.domain.TbPetUser;
import com.work.service.UserService;
import com.work.util.R;

/**
 * 用户相关信息
 * @author ljj
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * 描述:保存用户信息
	 * 
	 * @return 
	 * @see
	 */
	@RequestMapping("/saveUser")
	public R saveUser(String userInfo){
		if (userInfo == null) {
			return R.error("参数异常，获取不到用户信息");
		}
		R r = userService.saveUser(userInfo);
		return r;
	}
	
	/**
	 * 
	 * 描述:用户信息完善
	 * 
	 * @return 
	 * @see
	 */
	@RequestMapping("/updateUser")
	public R updateUser(String userInfo){
		if (userInfo == null) {
			return R.error("参数异常，获取不到用户信息");
		}
		R r = userService.updateUser(userInfo);
		return r;
	}
	
	/**
	 * 
	 * 描述:用户头像上传
	 * 
	 * @return 
	 * @see
	 */
	@RequestMapping("/updateUserHead")
	public R updateUserHead(@RequestParam("file") MultipartFile file,String userId,String suffixName){
		if (userId == null) {
			return R.error("参数异常，获取不到用户信息");
		}
		if (file.isEmpty()){
		    return R.error("文件为空");
		}
		String filePath = userService.updateUserHead(file,userId,suffixName);
		return R.ok().put(filePath);
	}
	
	/**
	 * 
	 * 描述:用户信息展示
	 * 
	 * @return 
	 * @see
	 */
	@RequestMapping("/showUser")
	public R showUser(String userId){
		if (userId == null) {
			return R.error("参数异常，获取不到用户信息");
		}
		TbPetUser user = userService.getUser(userId);
		return R.ok().put(user);
	}
	
	/**
	 * 
	 * 描述:添加宠物，修改宠物
	 * 
	 * @return 
	 * @see
	 */
	@RequestMapping("/saveIpet")
	public R saveIpet(String userId,String ipetInfo){
		if (userId == null) {
			return R.error("参数异常，获取不到用户信息");
		}
		if (ipetInfo == null) {
			return R.error("参数异常，获取不到宠物信息");
		}
		R r = userService.saveIpet(userId,ipetInfo);
		return r;
	}
	
	/**
	 * 
	 * 描述:删除宠物
	 * 
	 * @return 
	 * @see
	 */
	@RequestMapping("/deleteIpet")
	public R deleteIpet(String ipetId){
		if (ipetId == null) {
			return R.error("参数异常，获取不到宠物信息");
		}
		R r = userService.deleteIpet(ipetId);
		return r;
	}
	
	/**
	 * 
	 * 描述:宠物列表
	 * 
	 * @return 
	 * @see
	 */
	@RequestMapping("/getIpetList")
	public R getIpetList(String userId){
		if (userId == null) {
			return R.error("参数异常，获取不到用户信息");
		}
		Map<String, Object> map = userService.getIpetList(userId);
		return  R.ok().put(map);
	}
	
	/**
	 * 
	 * 描述:宠物单个
	 * 
	 * @return 
	 * @see
	 */
	@RequestMapping("/getIpet")
	public R getIpet(String ipetId){
		if (ipetId == null) {
			return R.error("参数异常，获取不到宠物信息");
		}
		Map<String, Object> map = userService.getIpet(ipetId);
		return  R.ok().put(map);
	}
	
	/**
	 * 
	 * 描述:删除宠物图片
	 * 
	 * @return 
	 * @see
	 */
	@RequestMapping("/delIpetPic")
	public R delIpetPic(String picId){
		if (picId == null) {
			return R.error("参数异常，获取不到宠物信息");
		}
		R r = userService.delIpetPic(picId);
		return  r;
	}
}
