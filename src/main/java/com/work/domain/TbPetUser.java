package com.work.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbPetUser {
    //微信openid
    private String OPENID;

    //昵称
    private String NICKNAME;

    //密码
    private String PASSWORD;

    //性别
    private String SEX;

    //手机号码
    private String TEL;

    //出生日期
    private Date BIRTHDAY;

    private String AGE;

    //个人简介
    private String PERSONALPROFILE;

    //用户图片
    private String PICTURE;

    //城市
    private String CITY;

    //国家
    private String COUNTRY;

    //省份
    private String POVINCES;

    //创建时间
    private Date CREATETIME;

    //最新登录时间
    private Date LASTRIGESTTIME;

    /**
     * 获取微信openid
     *
     * @return OPENID - 微信openid
     */
    @JSONField(name="openid")
    public String getOPENID() {
        return OPENID;
    }

    /**
     * 设置微信openid
     *
     * @param OPENID 微信openid
     */
    public void setOPENID(String OPENID) {
        this.OPENID = OPENID == null ? null : OPENID.trim();
    }

    /**
     * 获取昵称
     *
     * @return NICKNAME - 昵称
     */
    @JSONField(name="nickname")
    public String getNICKNAME() {
        return NICKNAME;
    }

    /**
     * 设置昵称
     *
     * @param NICKNAME 昵称
     */
    public void setNICKNAME(String NICKNAME) {
        this.NICKNAME = NICKNAME == null ? null : NICKNAME.trim();
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    @JSONField(name="password")
    public String getPASSWORD() {
        return PASSWORD;
    }

    /**
     * 设置密码
     *
     * @param PASSWORD 密码
     */
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD == null ? null : PASSWORD.trim();
    }

    /**
     * 获取性别
     *
     * @return SEX - 性别
     */
    @JSONField(name="sex")
    public String getSEX() {
        return SEX;
    }

    /**
     * 设置性别
     *
     * @param SEX 性别
     */
    public void setSEX(String SEX) {
        this.SEX = SEX == null ? null : SEX.trim();
    }

    /**
     * 获取手机号码
     *
     * @return TEL - 手机号码
     */
    @JSONField(name="tel")
    public String getTEL() {
        return TEL;
    }

    /**
     * 设置手机号码
     *
     * @param TEL 手机号码
     */
    public void setTEL(String TEL) {
        this.TEL = TEL == null ? null : TEL.trim();
    }

    /**
     * 获取出生日期
     *
     * @return BIRTHDAY - 出生日期
     */
    @JSONField(name="birthday",format="yyyy-MM-dd")
    public Date getBIRTHDAY() {
        return BIRTHDAY;
    }

    /**
     * 设置出生日期
     *
     * @param BIRTHDAY 出生日期
     */
    public void setBIRTHDAY(Date BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }

    /**
     * @return AGE
     */
    @JSONField(name="age")
    public String getAGE() {
        return AGE;
    }

    /**
     * @param AGE
     */
    public void setAGE(String AGE) {
        this.AGE = AGE == null ? null : AGE.trim();
    }

    /**
     * 获取个人简介
     *
     * @return PERSONALPROFILE - 个人简介
     */
    @JSONField(name="personalprofile")
    public String getPERSONALPROFILE() {
        return PERSONALPROFILE;
    }

    /**
     * 设置个人简介
     *
     * @param PERSONALPROFILE 个人简介
     */
    public void setPERSONALPROFILE(String PERSONALPROFILE) {
        this.PERSONALPROFILE = PERSONALPROFILE == null ? null : PERSONALPROFILE.trim();
    }

    /**
     * 获取用户图片
     *
     * @return PICTURE - 用户图片
     */
    @JSONField(name="picture")
    public String getPICTURE() {
        return PICTURE;
    }

    /**
     * 设置用户图片
     *
     * @param PICTURE 用户图片
     */
    public void setPICTURE(String PICTURE) {
        this.PICTURE = PICTURE == null ? null : PICTURE.trim();
    }

    /**
     * 获取城市
     *
     * @return CITY - 城市
     */
    @JSONField(name="city")
    public String getCITY() {
        return CITY;
    }

    /**
     * 设置城市
     *
     * @param CITY 城市
     */
    public void setCITY(String CITY) {
        this.CITY = CITY == null ? null : CITY.trim();
    }

    /**
     * 获取国家
     *
     * @return COUNTRY - 国家
     */
    @JSONField(name="country")
    public String getCOUNTRY() {
        return COUNTRY;
    }

    /**
     * 设置国家
     *
     * @param COUNTRY 国家
     */
    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY == null ? null : COUNTRY.trim();
    }

    /**
     * 获取省份
     *
     * @return POVINCES - 省份
     */
    @JSONField(name="povinces")
    public String getPOVINCES() {
        return POVINCES;
    }

    /**
     * 设置省份
     *
     * @param POVINCES 省份
     */
    public void setPOVINCES(String POVINCES) {
        this.POVINCES = POVINCES == null ? null : POVINCES.trim();
    }

    /**
     * 获取创建时间
     *
     * @return CREATETIME - 创建时间
     */
    @JSONField(name="createtime",format="yyyy-MM-dd")
    public Date getCREATETIME() {
        return CREATETIME;
    }

    /**
     * 设置创建时间
     *
     * @param CREATETIME 创建时间
     */
    public void setCREATETIME(Date CREATETIME) {
        this.CREATETIME = CREATETIME;
    }

    /**
     * 获取最新登录时间
     *
     * @return LASTRIGESTTIME - 最新登录时间
     */
    @JSONField(name="lastrigesttime",format="yyyy-MM-dd")
    public Date getLASTRIGESTTIME() {
        return LASTRIGESTTIME;
    }

    /**
     * 设置最新登录时间
     *
     * @param LASTRIGESTTIME 最新登录时间
     */
    public void setLASTRIGESTTIME(Date LASTRIGESTTIME) {
        this.LASTRIGESTTIME = LASTRIGESTTIME;
    }
}