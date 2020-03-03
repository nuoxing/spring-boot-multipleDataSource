package com.work.petring.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work.domain.TbFocusUserInfo;
import com.work.petring.service.PetringService;
import com.work.petring.service.TbFocusUserInfoService;
import com.work.petring.service.TbPublishCommentInfoDataService;
import com.work.petring.service.TbPublishDynamicInfoDataService;
import com.work.petring.service.TbPublishPraiseInfoDataService;
import com.work.util.R;

/**
 * 宠圈controller
 * 
 * @author suwenyu
 *
 */
@RestController
@RequestMapping("/petring")
public class PetRingController {

	@Autowired
	private PetringService petringService;

	@Autowired
	private TbPublishPraiseInfoDataService tbPublishPraiseInfoDataService;

	@Autowired
	private TbPublishCommentInfoDataService tbPublishCommentInfoDataService;
	@Autowired
	private TbPublishDynamicInfoDataService tbPublishDynamicInfoDataService;
	@Autowired
	private TbFocusUserInfoService TbFocusUserInfoService;

	@RequestMapping("/getpagelist")
	public R getPetRingListData(Integer pageNum, String dynamicTime, String userId) {
		List<Map<String, Object>> list = petringService.getPublishPageData(pageNum, dynamicTime, userId);
		return R.ok().put(list);
	}

	/**
	 * 
	 * 描述: 已经登录的用户 获取宠圈动态信息<br>
	 * 
	 * @param pageNum
	 *            获取第几页数据
	 * @param dynamicTime
	 *            上次获取的最后时间
	 * @param userId
	 *            登录的用户id
	 * @return
	 * @see
	 */
	@RequestMapping("/getDynamicPageDataInLogin")
	public R getDynamicPageDataInLogin(Integer pageNum, String dynamicTime, String userId ,String self) {
		if (pageNum == null) {
			return R.error("参数异常，获取不到页码");
		}
		if (StringUtils.isEmpty(userId)) {
			return R.error("参数异常，获取不到用户id");
		}
		List<Map<String, Object>> list = petringService.getPublishPageDataInLogin(pageNum, userId, dynamicTime ,self);
		return R.ok().put(list);
	}

	@RequestMapping("/getPublishPageDataInNotLogin")
	public R getPublishPageDataInNotLogin(BigDecimal longitude, BigDecimal latitude) {
		List<Map<String, Object>> list = petringService.getPublishPageDataInNotLogin(longitude, latitude);
		return R.ok().put(list);
	}

	/**
	 * 
	 * 描述:保存点赞信息 <br>
	 * 
	 * @param dynamicId
	 *            被点赞的动态id
	 * @param userId
	 *            当前点赞的用户id
	 * @return
	 * @see
	 */
	@RequestMapping("/savePraiseInfo")
	public R savePraiseInfo(String dynamicId, String userId) {
		if (StringUtils.isEmpty(userId)) {
			return R.error("参数异常，获取不到用户id");
		}
		if (StringUtils.isEmpty(dynamicId)) {
			return R.error("参数异常，获取不到dynamicId");
		}
		int num = tbPublishPraiseInfoDataService.insert(dynamicId, userId);
		if (num == 0) {
			return R.error("保存失败");
		}
		return R.ok("保存成功");
	}

	/**
	 * 
	 * 描述: 删除点赞信息<br>
	 * 
	 * @param dynamicId
	 *            动态id
	 * @param userId
	 *            点赞人用户id
	 * @return
	 * @see
	 */
	@RequestMapping("/delPraiseInfo")
	public R delPraiseInfo(String dynamicId, String userId) {
		if (StringUtils.isEmpty(userId)) {
			return R.error("参数异常，获取不到用户id");
		}
		if (StringUtils.isEmpty(dynamicId)) {
			return R.error("参数异常，获取不到dynamicId");
		}
		int num = tbPublishPraiseInfoDataService.delete(dynamicId, userId);
		if (num == 0) {
			return R.error("删除失败");
		}
		return R.ok("删除成功");
	}

	/**
	 * 
	 * 描述: 保存评论信息<br>
	 * 
	 * @param dynamicId
	 * @param sendUserId
	 * @param replyedUserId
	 * @param content
	 * @return
	 * @see
	 */
	@RequestMapping("/saveCommentInfo")
	public R saveCommentInfo(String dynamicId, String sendUserId, String replyedUserId, String content) {
		if (StringUtils.isEmpty(sendUserId)) {
			return R.error("参数异常，获取不到用户id");
		}
		if (StringUtils.isEmpty(dynamicId)) {
			return R.error("参数异常，获取不到dynamicId");
		}
		if (StringUtils.isEmpty(content)) {
			return R.error("评论内容不能为空");
		}
		int num = tbPublishCommentInfoDataService.insert(dynamicId, sendUserId, replyedUserId, content);
		if (num == 0) {
			return R.error("保存失败");
		}
		return R.ok("保存成功");
	}

	/**
	 * 
	 * 描述: 删除评论信息<br>
	 * 
	 * @param dynamicId
	 * @param sendUserId
	 * @param replyedUserId
	 * @param content
	 * @return
	 * @see
	 */
	@RequestMapping("/delCommentInfo")
	public R delCommentInfo(String commentId) {
		if (StringUtils.isEmpty(commentId)) {
			return R.error("参数异常，获取不到commentId");
		}
		int num = tbPublishCommentInfoDataService.updateStateById(commentId);
		if (num == 0) {
			return R.error("删除失败");
		}
		return R.ok("删除成功");
	}

	/**
	 * 
	 * 描述: 发布宠圈
	 * 
	 * @param dynamicId
	 * @param sendUserId
	 * @param replyedUserId
	 * @param content
	 * @return
	 * @see
	 */
	@RequestMapping("/savePetRing")
	public R savePetRing(String userId, String content,BigDecimal longitude,BigDecimal latitude,String dom) {
		if (StringUtils.isEmpty(userId)) {
			return R.error("参数异常，获取不到userId");
		}
		if (StringUtils.isEmpty(content)) {
			return R.error("发布的内容信息不能为空");
		}
		String uuid = UUID.randomUUID().toString();
		int num = tbPublishDynamicInfoDataService.insert(userId, content, uuid, longitude, latitude, dom);
		if (num == 0) {
			return R.error("保存失败");
		}
		return R.ok("保存成功").put(uuid);
	}

	/**
	 * 删除发布的信息
	 * 
	 * @param ListID
	 * @return
	 */
	@RequestMapping("/delPetRing")
	public R delPetRing(String ListID) {
		if (StringUtils.isEmpty(ListID)) {
			return R.error("参数异常，获取不到ListID");
		}
		int num = tbPublishDynamicInfoDataService.delete(ListID);
		if (num == 0) {
			return R.error("删除失败");
		}
		return R.ok("删除成功");
	}

	/**
	 * 
	 * 描述: 关注用户
	 * 
	 * @param dynamicId
	 * @param sendUserId
	 * @param replyedUserId
	 * @param content
	 * @return
	 * @see
	 */
	@RequestMapping("/saveFocusUser")
	public R saveFocusUser(String userId, String focusId) {
		if (StringUtils.isEmpty(userId)) {
			return R.error("参数异常，获取不到userId");
		}
		if (StringUtils.isEmpty(focusId)) {
			return R.error("参数异常，获取不到focusId");
		}
		int num = TbFocusUserInfoService.insert(userId, focusId);
		if (num == 0) {
			return R.error("关注失败");
		}
		return R.ok("关注成功");
	}

	/**
	 * 
	 * 描述: 取消关注用户
	 * 
	 * @param dynamicId
	 * @param sendUserId
	 * @param replyedUserId
	 * @param content
	 * @return
	 * @see
	 */
	@RequestMapping("/deleteFocusUser")
	public R DeleteFocusUser(String userId, String focusId) {
		if (StringUtils.isEmpty(userId)) {
			return R.error("参数异常，获取不到userId");
		}
		if (StringUtils.isEmpty(focusId)) {
			return R.error("参数异常，获取不到focusId");
		}
		int num = TbFocusUserInfoService.Delete(userId, focusId);
		if (num == 0) {
			return R.error("取消关注失败");
		}
		return R.ok("取消关注成功");
	}

	/**
	 * 
	 * 描述: 关注用户列表
	 * 
	 * @param dynamicId
	 * @param sendUserId
	 * @param replyedUserId
	 * @param content
	 * @return
	 * @see
	 */
	@RequestMapping("/getAllsFocusUser")
	public R getAllFocusUser(String userId) {
		if (StringUtils.isEmpty(userId)) {
			return R.error("参数异常，获取不到userId");
		}
		List<TbFocusUserInfo> list = TbFocusUserInfoService.selectAllByUserid(userId);
		return R.ok().put(list);
	}

}
