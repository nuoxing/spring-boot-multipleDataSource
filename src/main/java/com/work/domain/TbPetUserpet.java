package com.work.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;

public class TbPetUserpet {
    //主键id
    private String ID;

    //用户ID
    private String USERID;

    //宠物昵称
    private String IPTNAME;

    //宠物种类
    private String IPTTYPE;

    //宠物种类名称
    private String IPTTYPENAME;

    //身长
    private String height;

    //体重
    private String weight;

    //年龄
    private String age;

    //性别
    private String sex;

    //备注
    private String remark;

    //距离
    private String distance;

    //创建时间
    private Date createtime;
    
    private List<Map<String,String>> pictureUrl;

    @JSONField(name="pictureurl")
    public List<Map<String, String>> getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(List<Map<String, String>> pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	/**
     * 获取主键id
     *
     * @return ID - 主键id
     */
    @JSONField(name="id")
    public String getID() {
        return ID;
    }

    /**
     * 设置主键id
     *
     * @param ID 主键id
     */
    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    /**
     * 获取用户ID
     *
     * @return USERID - 用户ID
     */
    @JSONField(name="userid")
    public String getUSERID() {
        return USERID;
    }

    /**
     * 设置用户ID
     *
     * @param USERID 用户ID
     */
    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    /**
     * 获取宠物昵称
     *
     * @return IPTNAME - 宠物昵称
     */
    @JSONField(name="iptname")
    public String getIPTNAME() {
        return IPTNAME;
    }

    /**
     * 设置宠物昵称
     *
     * @param IPTNAME 宠物昵称
     */
    public void setIPTNAME(String IPTNAME) {
        this.IPTNAME = IPTNAME == null ? null : IPTNAME.trim();
    }

    /**
     * 获取宠物种类
     *
     * @return IPTTYPE - 宠物种类
     */
    @JSONField(name="ipttype")
    public String getIPTTYPE() {
        return IPTTYPE;
    }

    /**
     * 设置宠物种类
     *
     * @param IPTTYPE 宠物种类
     */
    public void setIPTTYPE(String IPTTYPE) {
        this.IPTTYPE = IPTTYPE == null ? null : IPTTYPE.trim();
    }

    /**
     * 获取宠物种类名称
     *
     * @return IPTTYPENAME - 宠物种类名称
     */
    @JSONField(name="ipttypename")
    public String getIPTTYPENAME() {
        return IPTTYPENAME;
    }

    /**
     * 设置宠物种类名称
     *
     * @param IPTTYPENAME 宠物种类名称
     */
    public void setIPTTYPENAME(String IPTTYPENAME) {
        this.IPTTYPENAME = IPTTYPENAME == null ? null : IPTTYPENAME.trim();
    }

    /**
     * 获取身长
     *
     * @return height - 身长
     */
    @JSONField(name="height")
    public String getHeight() {
        return height;
    }

    /**
     * 设置身长
     *
     * @param height 身长
     */
    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    /**
     * 获取体重
     *
     * @return weight - 体重
     */
    @JSONField(name="weight")
    public String getWeight() {
        return weight;
    }

    /**
     * 设置体重
     *
     * @param weight 体重
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    @JSONField(name="age")
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    @JSONField(name="sex")
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    @JSONField(name="remark")
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取距离
     *
     * @return distance - 距离
     */
    @JSONField(name="distance")
    public String getDistance() {
        return distance;
    }

    /**
     * 设置距离
     *
     * @param distance 距离
     */
    public void setDistance(String distance) {
        this.distance = distance == null ? null : distance.trim();
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    @JSONField(name="createtime",format="yyyy-MM-dd")
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}