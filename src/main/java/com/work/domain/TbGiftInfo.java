package com.work.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbGiftInfo {
    //主键
    private String id;

    //礼物描述
    private String giftdesc;

    //礼物图片文件系统路径
    private String giftpath;

    //礼物分类
    private String gifttype;

    //礼物图片下载路径
    private String giftcompletepath;

    //图片大小
    private Integer picsize;

    //创建时间
    private Date createtime;

    //更新时间
    private Date updatetime;

    //状态值
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
     * 获取礼物描述
     *
     * @return giftdesc - 礼物描述
     */
    @JSONField(name="giftdesc")
    public String getGiftdesc() {
        return giftdesc;
    }

    /**
     * 设置礼物描述
     *
     * @param giftdesc 礼物描述
     */
    public void setGiftdesc(String giftdesc) {
        this.giftdesc = giftdesc == null ? null : giftdesc.trim();
    }

    /**
     * 获取礼物图片文件系统路径
     *
     * @return giftpath - 礼物图片文件系统路径
     */
    @JSONField(name="giftpath")
    public String getGiftpath() {
        return giftpath;
    }

    /**
     * 设置礼物图片文件系统路径
     *
     * @param giftpath 礼物图片文件系统路径
     */
    public void setGiftpath(String giftpath) {
        this.giftpath = giftpath == null ? null : giftpath.trim();
    }

    /**
     * 获取礼物分类
     *
     * @return gifttype - 礼物分类
     */
    @JSONField(name="gifttype")
    public String getGifttype() {
        return gifttype;
    }

    /**
     * 设置礼物分类
     *
     * @param gifttype 礼物分类
     */
    public void setGifttype(String gifttype) {
        this.gifttype = gifttype == null ? null : gifttype.trim();
    }

    /**
     * 获取礼物图片下载路径
     *
     * @return giftcompletepath - 礼物图片下载路径
     */
    @JSONField(name="giftcompletepath")
    public String getGiftcompletepath() {
        return giftcompletepath;
    }

    /**
     * 设置礼物图片下载路径
     *
     * @param giftcompletepath 礼物图片下载路径
     */
    public void setGiftcompletepath(String giftcompletepath) {
        this.giftcompletepath = giftcompletepath == null ? null : giftcompletepath.trim();
    }

    /**
     * 获取图片大小
     *
     * @return picsize - 图片大小
     */
    @JSONField(name="picsize")
    public Integer getPicsize() {
        return picsize;
    }

    /**
     * 设置图片大小
     *
     * @param picsize 图片大小
     */
    public void setPicsize(Integer picsize) {
        this.picsize = picsize;
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
     * 获取状态值
     *
     * @return status - 状态值
     */
    @JSONField(name="status")
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态值
     *
     * @param status 状态值
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}