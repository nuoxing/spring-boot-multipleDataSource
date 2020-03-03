package com.work.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbFocusUserInfo {
    //主键
    private String id;

    //用户id
    private String userid;

    //被关注用户id
    private String focuseduserid;

    //被关注用户名称
    private String focusedusername;

    //被关注用户头像链接
    private String focuseduserpicture;

    private Date createtime;

    private String status;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    @JSONField(name="id")
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
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
     * 获取被关注用户id
     *
     * @return focuseduserid - 被关注用户id
     */
    @JSONField(name="focuseduserid")
    public String getFocuseduserid() {
        return focuseduserid;
    }

    /**
     * 设置被关注用户id
     *
     * @param focuseduserid 被关注用户id
     */
    public void setFocuseduserid(String focuseduserid) {
        this.focuseduserid = focuseduserid == null ? null : focuseduserid.trim();
    }

    /**
     * 获取被关注用户名称
     *
     * @return focusedusername - 被关注用户名称
     */
    @JSONField(name="focusedusername")
    public String getFocusedusername() {
        return focusedusername;
    }

    /**
     * 设置被关注用户名称
     *
     * @param focusedusername 被关注用户名称
     */
    public void setFocusedusername(String focusedusername) {
        this.focusedusername = focusedusername == null ? null : focusedusername.trim();
    }

    /**
     * 获取被关注用户头像链接
     *
     * @return focuseduserpicture - 被关注用户头像链接
     */
    @JSONField(name="focuseduserpicture")
    public String getFocuseduserpicture() {
        return focuseduserpicture;
    }

    /**
     * 设置被关注用户头像链接
     *
     * @param focuseduserpicture 被关注用户头像链接
     */
    public void setFocuseduserpicture(String focuseduserpicture) {
        this.focuseduserpicture = focuseduserpicture == null ? null : focuseduserpicture.trim();
    }

    /**
     * @return createtime
     */
    @JSONField(name="createtime",format="yyyy-MM-dd")
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return status
     */
    @JSONField(name="status")
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}