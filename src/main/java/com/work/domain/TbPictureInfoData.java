package com.work.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbPictureInfoData {
    //主键id
    private String id;

    //图片类型
    private String pictype;

    private String path;

    //状态值
    private String status;

    //关联id
    private String relativeid;

    //创建时间
    private Date createtime;

    private String completepath;

    private Integer picsize;

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
     * 获取图片类型
     *
     * @return pictype - 图片类型
     */
    @JSONField(name="pictype")
    public String getPictype() {
        return pictype;
    }

    /**
     * 设置图片类型
     *
     * @param pictype 图片类型
     */
    public void setPictype(String pictype) {
        this.pictype = pictype == null ? null : pictype.trim();
    }

    /**
     * @return path
     */
    @JSONField(name="path")
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
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

    /**
     * 获取关联id
     *
     * @return relativeid - 关联id
     */
    @JSONField(name="relativeid")
    public String getRelativeid() {
        return relativeid;
    }

    /**
     * 设置关联id
     *
     * @param relativeid 关联id
     */
    public void setRelativeid(String relativeid) {
        this.relativeid = relativeid == null ? null : relativeid.trim();
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
     * @return completepath
     */
    @JSONField(name="completepath")
    public String getCompletepath() {
        return completepath;
    }

    /**
     * @param completepath
     */
    public void setCompletepath(String completepath) {
        this.completepath = completepath == null ? null : completepath.trim();
    }

    /**
     * @return picsize
     */
    @JSONField(name="picsize")
    public Integer getPicsize() {
        return picsize;
    }

    /**
     * @param picsize
     */
    public void setPicsize(Integer picsize) {
        this.picsize = picsize;
    }
}