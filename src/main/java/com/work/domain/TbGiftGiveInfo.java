package com.work.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbGiftGiveInfo {
    //主键
    private String id;

    //赠送人id
    private String giveuserid;

    //被赠送人id
    private String begiveuserid;

    //赠送的礼物id
    private String giftid;

    //赠送的数量
    private Integer giftnum;

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
     * 获取赠送人id
     *
     * @return giveuserid - 赠送人id
     */
    @JSONField(name="giveuserid")
    public String getGiveuserid() {
        return giveuserid;
    }

    /**
     * 设置赠送人id
     *
     * @param giveuserid 赠送人id
     */
    public void setGiveuserid(String giveuserid) {
        this.giveuserid = giveuserid == null ? null : giveuserid.trim();
    }

    /**
     * 获取被赠送人id
     *
     * @return begiveuserid - 被赠送人id
     */
    @JSONField(name="begiveuserid")
    public String getBegiveuserid() {
        return begiveuserid;
    }

    /**
     * 设置被赠送人id
     *
     * @param begiveuserid 被赠送人id
     */
    public void setBegiveuserid(String begiveuserid) {
        this.begiveuserid = begiveuserid == null ? null : begiveuserid.trim();
    }

    /**
     * 获取赠送的礼物id
     *
     * @return giftid - 赠送的礼物id
     */
    @JSONField(name="giftid")
    public String getGiftid() {
        return giftid;
    }

    /**
     * 设置赠送的礼物id
     *
     * @param giftid 赠送的礼物id
     */
    public void setGiftid(String giftid) {
        this.giftid = giftid == null ? null : giftid.trim();
    }

    /**
     * 获取赠送的数量
     *
     * @return giftnum - 赠送的数量
     */
    @JSONField(name="giftnum")
    public Integer getGiftnum() {
        return giftnum;
    }

    /**
     * 设置赠送的数量
     *
     * @param giftnum 赠送的数量
     */
    public void setGiftnum(Integer giftnum) {
        this.giftnum = giftnum;
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