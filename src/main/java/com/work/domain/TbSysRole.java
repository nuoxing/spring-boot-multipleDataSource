package com.work.domain;

public class TbSysRole {
    private String ID;

    private String rolename;

    private String bstop;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getBstop() {
        return bstop;
    }

    public void setBstop(String bstop) {
        this.bstop = bstop == null ? null : bstop.trim();
    }
}