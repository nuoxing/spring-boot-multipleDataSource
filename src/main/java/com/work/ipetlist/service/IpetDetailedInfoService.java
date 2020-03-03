package com.work.ipetlist.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.ExtendTbPetDetailedInfoMapper;
import com.work.dao.base.TbPetDetailedInfoMapper;
import com.work.domain.TbPetDetailedInfo;


@Service("ipetDetailedInfoService")
public class IpetDetailedInfoService {

	
	@Autowired
	private TbPetDetailedInfoMapper tbPetDetailedInfoMapper;
	
	@Autowired
	private ExtendTbPetDetailedInfoMapper extendTbPetDetailedInfoMapper;
	
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public void insert(){
		TbPetDetailedInfo vo = new TbPetDetailedInfo();
		vo.setId(UUID.randomUUID().toString());
		//extendTbPetDetailedInfoMapper.insert(vo);
	}
	
	
	
}
