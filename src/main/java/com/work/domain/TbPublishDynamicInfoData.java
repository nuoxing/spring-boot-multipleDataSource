package com.work.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbPublishDynamicInfoData {
    //主键id
    private String id;

    //用户id
    private String userid;

    //发表的内容信息
    private String content;

    //经度
    private BigDecimal longitude;

    //纬度
    private BigDecimal latitude;

    //创建时间
    private Date createtime;

    //更新时间
    private Date updatetime;

    //状态
    private String status;

    private String dom;

    //省份
    private String province;

    //城市
    private String city;

    //区
    private String district;

    //街道
    private String street;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    @JSONField(name="id")
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取用户id
     *
     * @return userid - 用户id
     */
    @JSONField(name="userid")
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 获取发表的内容信息
     *
     * @return content - 发表的内容信息
     */
    @JSONField(name="content")
    public String getContent() {
        return content;
    }

    /**
     * 设置发表的内容信息
     *
     * @param content 发表的内容信息
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    @JSONField(name="longitude")
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    @JSONField(name="latitude")
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
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

    /**
     * 获取更新时间
     *
     * @return updatetime - 更新时间
     */
    @JSONField(name="updatetime",format="yyyy-MM-dd")
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    @JSONField(name="status")
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return dom
     */
    @JSONField(name="dom")
    public String getDom() {
        return dom;
    }

    /**
     * @param dom
     */
    public void setDom(String dom) {
        this.dom = dom == null ? null : dom.trim();
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    @JSONField(name="province")
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    @JSONField(name="city")
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取区
     *
     * @return district - 区
     */
    @JSONField(name="district")
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区
     *
     * @param district 区
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * 获取街道
     *
     * @return street - 街道
     */
    @JSONField(name="street")
    public String getStreet() {
        return street;
    }

    /**
     * 设置街道
     *
     * @param street 街道
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }
}