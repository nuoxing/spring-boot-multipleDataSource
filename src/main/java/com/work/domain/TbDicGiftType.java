package com.work.domain;

import com.alibaba.fastjson.annotation.JSONField;

public class TbDicGiftType {
    private String code;

    private String descname;

    private String status;

    /**
     * @return code
     */
    @JSONField(name="code")
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return descname
     */
    @JSONField(name="descname")
    public String getDescname() {
        return descname;
    }

    /**
     * @param descname
     */
    public void setDescname(String descname) {
        this.descname = descname == null ? null : descname.trim();
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