package com.work.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.work.dao.UserInfoMapper;

/**
 * 用户信息的缓存service
 * @author suwenyu
 *
 */
@Service
public class UserCacheService {

	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	 /**
     * 描述: 用户数据<br>
     * 
     * @param code
     * @return
     * @see
     */
    @Cacheable(value = "cfccache", key = "#userid + 'userinfo'")
    public Map<String,String> getUserInfo(String userid)
    {
    	Map<String, String> userInfo = userInfoMapper.getUserInfo(userid);
    	if (userInfo == null){
    		return new HashMap<String,String>();
    	}
        return userInfo;
    }
	
	
}
