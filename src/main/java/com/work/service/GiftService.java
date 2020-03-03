package com.work.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.csource.common.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.work.dao.ExtendTbGiftGiveInfoMapper;
import com.work.dao.ExtendTbGiftInfoMapper;
import com.work.dao.base.TbDicGiftTypeMapper;
import com.work.dao.base.TbGiftGiveInfoMapper;
import com.work.dao.base.TbGiftInfoMapper;
import com.work.domain.TbDicGiftType;
import com.work.domain.TbGiftGiveInfo;
import com.work.domain.TbGiftInfo;
import com.work.util.FastDfsUtil;


/**
 * 礼物service
 * @author suwenyu
 *
 */
@Service("giftService")
public class GiftService {

	
	
	@Value("${downurlconfig}")
	private String downurlconfig;
	
	@Autowired
	private TbGiftGiveInfoMapper tbGiftGiveInfoMapper;
	
	@Autowired
	private ExtendTbGiftInfoMapper extendTbGiftInfoMapper;
	
	@Autowired
	private TbGiftInfoMapper tbGiftInfoMapper;
	
	@Autowired
	private ExtendTbGiftGiveInfoMapper extendTbGiftGiveInfoMapper;
	
	
	@Autowired
	private TbDicGiftTypeMapper tbDicGiftTypeMapper;
	
	/**
	 * 保存礼物赠送情况
	 * @param giveuserId
	 * @param begiveuserId
	 * @param giftId
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int saveGiveGift(String giveuserId,String begiveuserId,String giftId){
		String[] giftIds = giftId.split(",");
		int num =0;
		for (String id : giftIds){
		    TbGiftGiveInfo vo = new TbGiftGiveInfo();
	        vo.setId(UUID.randomUUID().toString());
	        vo.setBegiveuserid(begiveuserId);
	        vo.setGiveuserid(giveuserId);
	        vo.setGiftid(id);
	        vo.setCreatetime(new Date());
	        vo.setStatus("1");
	        num = tbGiftGiveInfoMapper.insert(vo);
		}
		return num;
	}
	
	
	/**
	 * 删除赠送情况
	 * @param id
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int cancelGiveGift(String id){
		int num = tbGiftGiveInfoMapper.deleteByPrimaryKey(id);
		return num;
	}
	
	
	
	/**
	 * 获取赠送情况数据
	 * @param userId
	 * @param type self表示获取自己的赠送情况  other获取自己被赠送情况数据
	 * @param pageNum
	 * @param endtime 排序时间id 上次最后的数据时间
	 * @return
	 */
	public List<Map<String,Object>> getGiveGift(String userId,String type,Integer pageNum,String endtime){
		int pageSize = 10;
		Page page = PageHelper.startPage(pageNum, pageSize, true);
		List<Map<String,Object>> lists = extendTbGiftGiveInfoMapper.getGiveGift(userId, type, endtime);
		return lists;
	}
	
	
	
	/**
	 * 分页获取礼物信息
	 * @param pageNum
	 * @param giftType
	 * @return
	 */
	public List<Map<String,Object>> getGiftPageData(Integer pageNum,String giftType){
		int pageSize = 10;
		Page page = PageHelper.startPage(pageNum, pageSize, true);
		List<Map<String,Object>> lists = extendTbGiftInfoMapper.getGiftPageData(giftType);
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(lists);
		System.out.println("总数="+pageInfo.getTotal());
		return lists;
	}
	
	
	/**
	 * 保存礼物的基本信息
	 * @param file
	 * @param giftdesc
	 * @param gifttype
	 * @return
	 * @throws IOException
	 * @throws MyException
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int saveGiftInfo( MultipartFile file,String giftdesc,String gifttype) throws IOException, MyException{
		int num = 0;
		byte[] bytes = file.getBytes();
		String filename = file.getOriginalFilename();
		String file_ext_name = filename.substring(filename.lastIndexOf(".")+1);
		System.out.println("文件后缀="+file_ext_name);
		String path = FastDfsUtil.uploadFile(bytes, file_ext_name, null);
		TbGiftInfo info = new TbGiftInfo();
		info.setId(UUID.randomUUID().toString());
		info.setCreatetime(new Date());
		info.setGiftdesc(giftdesc);
		info.setGiftpath(path);
		info.setGifttype(gifttype);
		info.setPicsize(bytes.length);
		info.setStatus("1");
		info.setGiftcompletepath(downurlconfig+path);
		num = tbGiftInfoMapper.insert(info);
		return num;
	}
	
	
	
	/**
	 * 保存礼物的基本信息
	 * @param file
	 * @param giftdesc
	 * @param gifttype
	 * @return
	 * @throws IOException
	 * @throws MyException
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int saveGiftInfo2( String filepath,String giftdesc,String gifttype) throws IOException, MyException{
		int num = 0;
		String file_ext_name = filepath.substring(filepath.lastIndexOf(".")+1);
		System.out.println("文件后缀="+file_ext_name);
		TbGiftInfo info = new TbGiftInfo();
		info.setId(UUID.randomUUID().toString());
		info.setCreatetime(new Date());
		info.setGiftdesc(giftdesc);
		info.setGiftpath(filepath);
		info.setGifttype(gifttype);
		//info.setPicsize(bytes.length);
		info.setStatus("1");
		info.setGiftcompletepath(downurlconfig+filepath);
		num = tbGiftInfoMapper.insert(info);
		return num;
	}
	
	
	
	/**
	 * 获取礼物类别字典
	 * 描述: <br>
	 * 1、…<br>
	 * 2、…<br>
	 * 实现: <br>
	 * 1、…<br>
	 * 2、…<br>
	 * 
	 * @return 
	 * @see
	 */
	public  List<TbDicGiftType> getDicGiftType(){
	    List<TbDicGiftType> list = tbDicGiftTypeMapper.selectByExample(null);
	    return list;
	}
}
