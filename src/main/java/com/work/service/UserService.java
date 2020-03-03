package com.work.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.csource.common.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.work.dao.DicSearchMapper;
import com.work.dao.ExtendTBPetUserpetMapper;
import com.work.dao.ExtendTbPetUserMapper;
import com.work.domain.TbPetUser;
import com.work.domain.TbPetUserpet;
import com.work.domain.TbPetUserpetExample;
import com.work.domain.TbPictureInfoData;
import com.work.util.FastDfsUtil;
import com.work.util.LogUtils;
import com.work.util.R;

@Service("UserService")
public class UserService {

	@Autowired
	private  ExtendTbPetUserMapper tbPetUserMapper;
	@Autowired
	private ExtendTBPetUserpetMapper tBPetUserpetMapper;
	@Autowired
	private DicSearchMapper didSearchMapper;
	@Autowired
	private TbPictureInfoDataService tbPictureInfoDataService;
	
	@Value("${downurlconfig}")
	private String downurlconfig;
	
	/**
	 * 保存用户信息
	 * @param userInfo
	 * @return
	 */
	public R saveUser(String userInfo) {
		try {
			JSONArray array = JSONObject.parseArray(userInfo);
			JSONObject json = array.getJSONObject(0);
			String userId = "";
			if(json!=null) {
				userId = json.getString("userId");
			}
			TbPetUser user = tbPetUserMapper.selectByPrimaryKey(userId);
			if(user==null) {
				//新增用户信息
				user = new TbPetUser();
				user.setOPENID(userId);
				user.setCITY(json.getString("city"));
				user.setCOUNTRY(json.getString("country"));
				user.setPICTURE(json.getString("avatar"));
				user.setNICKNAME(json.getString("userName"));
				user.setSEX(json.getString("sex"));
				user.setPOVINCES(json.getString("province"));
				user.setPERSONALPROFILE(json.getString("remark"));
				user.setBIRTHDAY(null);
				user.setCREATETIME(new Date());
				user.setLASTRIGESTTIME(new Date());
				
				tbPetUserMapper.insert(user);
			}else {
				user.setLASTRIGESTTIME(new Date());
				tbPetUserMapper.updateByPrimaryKeySelective(user);
			}
			return R.ok("用户登录成功！");
		}catch (Exception e) {
			e.printStackTrace();
			return R.error("用户登录失败！");
		}
	}


	/**
	 * 完善用户信息
	 * @param userId
	 * @param userInfo
	 * @return
	 */
	public R updateUser(String userInfo) {
		try {
			JSONArray array = JSONObject.parseArray(userInfo);
			JSONObject json = array.getJSONObject(0);
			String userId = "";
			if(json!=null) {
				userId = json.getString("userId");
			}
			TbPetUser user = tbPetUserMapper.selectByPrimaryKey(userId);
			if(user!=null) {
				//新增用户信息
				user.setCITY(json.getString("city"));
				user.setCOUNTRY(json.getString("country"));
				user.setPICTURE(json.getString("avatar"));
				user.setNICKNAME(json.getString("userName"));
				user.setSEX(json.getString("sex"));
				user.setPOVINCES(json.getString("province"));
				user.setCREATETIME(new Date());
				user.setLASTRIGESTTIME(new Date());
				//user.setBIRTHDAY(DateConvertor.String2Date(json.getString("birthday"), "yyyy-MM-dd HH:mm:ss"));
				user.setTEL(json.getString("tel"));
				user.setAGE(json.getString("age"));
				user.setPERSONALPROFILE(json.getString("remark"));
				
				tbPetUserMapper.updateByPrimaryKeySelective(user);
				return R.ok("修改用户信息成功！");
			}else {
				//新增用户信息
				user = new TbPetUser();
				user.setOPENID(userId);
				user.setCITY(json.getString("city"));
				user.setCOUNTRY(json.getString("country"));
				user.setPICTURE(json.getString("avatar"));
				user.setNICKNAME(json.getString("userName"));
				user.setSEX(json.getString("sex"));
				user.setPOVINCES(json.getString("province"));
				//user.setPERSONALPROFILE(json.getString("remark"));
				user.setBIRTHDAY(null);
				user.setCREATETIME(new Date());
				user.setLASTRIGESTTIME(new Date());
				
				tbPetUserMapper.insert(user);
				return R.ok("用户登录成功！");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			return R.error("用户信息保存失败！");
		}
	}


	/**
	 * 获取用户信息
	 * @param userid
	 * @return
	 */
	public TbPetUser getUser(String userid) {
		TbPetUser user = tbPetUserMapper.selectByPrimaryKey(userid);
		return user;
	}

	/**
	 * 删除宠物
	 * @param userid
	 * @param ipetid
	 * @return
	 */
	public R deleteIpet(String ipetid) {
		try {
			TbPetUserpetExample  example = new TbPetUserpetExample();
			example.createCriteria().andIDEqualTo(ipetid);
			tBPetUserpetMapper.deleteByExample(example);
			return R.error("删除成功！");
		}catch (Exception e) {
			e.printStackTrace();
			return R.error("删除失败！");
		}
		
	}


	/**
	 * 获取宠物信息列表
	 * @param userid
	 * @return
	 */
	public Map<String, Object> getIpetList(String userid) {
		try {
			Map<String, Object> map = new HashMap<>();
			TbPetUserpetExample  example = new TbPetUserpetExample();
			example.createCriteria().andUSERIDEqualTo(userid);
			List<TbPetUserpet> list =  tBPetUserpetMapper.selectByExample(example);
			/*List<Map<String, String>> typeList = didSearchMapper.findIpetType();
			map.put("typeList", typeList);*/
			for(TbPetUserpet pet :list) {
				List<Map<String,String>>  imageList = new ArrayList<>();
				List<TbPictureInfoData> piclist = tbPictureInfoDataService.getPicByRelativeId(pet.getID());
				for(TbPictureInfoData pic : piclist) {
					Map<String,String> imageMap = new HashMap<>();
					imageMap.put("id",pic.getId());
					imageMap.put("url",pic.getCompletepath());
					imageList.add(imageMap);
				}
				pet.setPictureUrl(imageList);
			}
			
			map.put("ipets", list);
			return map;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * 保存修改宠物信息
	 * @param userid
	 * @param ipetInfo
	 * @return
	 */
	public R saveIpet(String userid, String ipetInfo) {
		try {
			JSONObject json = JSONObject.parseObject(ipetInfo);
			String id = "";
			if(json!=null) {
				id = json.getString("id");
			}
			String uuid=id;
			TbPetUserpet pet = tBPetUserpetMapper.selectByPrimaryKey(id);
			if(id!=null&&!"".equals(id)&&pet!=null) {
				//修改
				pet.setAge(json.getString("age"));
				pet.setCreatetime(new Date());
				pet.setDistance(json.getString("distance"));
				pet.setHeight(json.getString("height"));
				pet.setIPTNAME(json.getString("iptname"));
				pet.setIPTTYPE(json.getString("ipttype"));
				pet.setRemark(json.getString("remark"));
				pet.setSex(json.getString("sex"));
				pet.setUSERID(userid);
				pet.setWeight(json.getString("weight"));
				pet.setIPTTYPENAME(json.getString("ipttypename"));
				tBPetUserpetMapper.updateByPrimaryKey(pet);
			}else {
				//新增
				pet = new TbPetUserpet();
				uuid = UUID.randomUUID().toString();
				pet.setID(uuid);
				pet.setAge(json.getString("age"));
				pet.setCreatetime(new Date());
				pet.setDistance(json.getString("distance"));
				pet.setHeight(json.getString("height"));
				pet.setIPTNAME(json.getString("iptname"));
				pet.setIPTTYPE(json.getString("ipttype"));
				pet.setRemark(json.getString("remark"));
				pet.setSex(json.getString("sex"));
				pet.setUSERID(userid);
				pet.setWeight(json.getString("weight"));
				pet.setIPTTYPENAME(json.getString("ipttypename"));
				tBPetUserpetMapper.insert(pet);
			}
			return R.ok("保存成功").put(uuid);
		}catch (Exception e) {
			e.printStackTrace();
			return R.error("保存失败");
		}
	}


	/**
	 * 获取宠物信息
	 * @param ipetId
	 * @return
	 */
	public Map<String, Object> getIpet(String ipetId) {
		try {
			Map<String, Object> map = new HashMap<>();
			TbPetUserpet pet = tBPetUserpetMapper.selectByPrimaryKey(ipetId);
			List<Map<String, String>> typeList = didSearchMapper.findIpetType();
			map.put("typeList", typeList);
			if(pet!=null) {
				List<Map<String,String>>  imageList = new ArrayList<>();
				List<TbPictureInfoData> piclist = tbPictureInfoDataService.getPicByRelativeId(pet.getID());
				for(TbPictureInfoData pic : piclist) {
					Map<String,String> imageMap = new HashMap<>();
					imageMap.put("id",pic.getId());
					imageMap.put("url",pic.getCompletepath());
					imageList.add(imageMap);
				}
				pet.setPictureUrl(imageList);
				map.put("ipet", pet);
			}
			return map;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * 上传用户头像
	 * @param file
	 * @param userId
	 * @param suffixName
	 * @return
	 */
	public String updateUserHead(MultipartFile file, String userId, String suffixName) {
		try {
			TbPetUser user = tbPetUserMapper.selectByPrimaryKey(userId);
	    	LogUtils.debug(getClass(), "文件上传");
	    	String filePath = FastDfsUtil.uploadFile(file.getBytes(), suffixName, null);
			LogUtils.debug(getClass(), filePath);
			user.setPICTURE(downurlconfig+filePath);
			tbPetUserMapper.updateByPrimaryKeySelective(user);
			return filePath;
		} catch (IOException | MyException e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw,true));
			LogUtils.error(getClass(), "上传文件异常，错误信息="+sw.toString());
			e.printStackTrace();
			return "";
		}
	}


	/**
	 * 
	 * 描述:删除宠物图片
	 * 
	 * @return 
	 * @see
	 */
	public R delIpetPic(String picId) {
		try {
			TbPictureInfoData pic = tbPictureInfoDataService.getInfoByid(picId);
			FastDfsUtil.deleteFile(pic.getPath());
			int num = tbPictureInfoDataService.delete(picId);
			if(num>0) {
				return R.ok("删除成功！");
			}else {
				return R.error("删除失败！");
			}
		}catch (Exception e) {
			e.printStackTrace();
			return R.error("删除失败！");
		}
	}

	
}
