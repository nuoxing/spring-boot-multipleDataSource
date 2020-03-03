package com.work.petring.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.ExtendTbFocusUserInfoMapper;
import com.work.dao.ExtendTbPetUserMapper;
import com.work.domain.TbFocusUserInfo;
import com.work.domain.TbFocusUserInfoExample;
import com.work.domain.TbPetUser;

/**
 * 关注用户
 * @author ljj
 *
 */
@Service("TbFocusUserInfoService")
public class TbFocusUserInfoService {

	@Autowired
	private ExtendTbFocusUserInfoMapper  tbFocusUserInfoMapper;
	
	@Autowired
	private ExtendTbPetUserMapper tbPetUserMapper;

	/**
	 * 关注用户
	 * @param userid
	 * @param focusid
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int insert(String userid, String focusid) {
		String uuid = UUID.randomUUID().toString();
		TbFocusUserInfo vo = new TbFocusUserInfo();
		vo.setId(uuid);
		vo.setUserid(userid);
		vo.setFocuseduserid(focusid);
		vo.setCreatetime(new Date());
		vo.setStatus("1");
		TbPetUser focusUser = tbPetUserMapper.selectByPrimaryKey(focusid);
		if(focusUser!=null) {
			vo.setFocusedusername(focusUser.getNICKNAME());
			vo.setFocuseduserpicture(focusUser.getPICTURE());
		}
		int num = tbFocusUserInfoMapper.insert(vo);
		return num;
	}

	/**
	 * 取消关注用户
	 * @param userid
	 * @param focusid
	 * @return
	 */
	public int Delete(String userid, String focusid) {
		TbFocusUserInfoExample  example = new TbFocusUserInfoExample();
		example.createCriteria().andUseridEqualTo(userid).andFocuseduseridEqualTo(focusid);
		int num = tbFocusUserInfoMapper.deleteByExample(example);
		return num;
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
	public List<TbFocusUserInfo> selectAllByUserid(String userid) {
		TbFocusUserInfoExample  example = new TbFocusUserInfoExample();
		example.createCriteria().andUseridEqualTo(userid);
		List<TbFocusUserInfo> list = tbFocusUserInfoMapper.selectByExample(example);
		return list;
	}
	
	
}
