package com.work.domain;

import java.util.Date;

public class TbPublishPraiseInfoData {
    private String id;

    private String dynamictid;

    private String userid;

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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
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