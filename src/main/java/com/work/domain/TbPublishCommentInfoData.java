package com.work.domain;

import java.util.Date;

public class TbPublishCommentInfoData {
    private String id;

    private String dynamictid;

    private String senduserid;

    private String msgtype;

    private String replyeduserid;

    private String content;

    private Date createtime;

    private Date updatetime;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDynamictid() {
        return dynamictid;
    }

    public void setDynamictid(String dynamictid) {
        this.dynamictid = dynamictid == null ? null : dynamictid.trim();
    }

    public String getSenduserid() {
        return senduserid;
    }

    public void setSenduserid(String senduserid) {
        this.senduserid = senduserid == null ? null : senduserid.trim();
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype == null ? null : msgtype.trim();
    }

    public String getReplyeduserid() {
        return replyeduserid;
    }

    public void setReplyeduserid(String replyeduserid) {
        this.replyeduserid = replyeduserid == null ? null : replyeduserid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}