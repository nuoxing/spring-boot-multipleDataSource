package com.work.domain;

import java.util.Date;

public class TbPetDetailedInfo {
    private String id;

    private String varietyname;

    private String varietryentname;

    private String picpath;

    private Integer popularity;

    private String placeorigin;

    private String life;

    private String aliias;

    private String femaleheight;

    private String maleheight;

    private String brifeintro;

    private String history;

    private String petcharacter;

    private String fitpeople;

    private String haircarding;

    private String varietyvlaue;

    private String breed;

    private String diseasepre;

    private String attention;

    private Date createtime;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVarietyname() {
        return varietyname;
    }

    public void setVarietyname(String varietyname) {
        this.varietyname = varietyname == null ? null : varietyname.trim();
    }

    public String getVarietryentname() {
        return varietryentname;
    }

    public void setVarietryentname(String varietryentname) {
        this.varietryentname = varietryentname == null ? null : varietryentname.trim();
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getPlaceorigin() {
        return placeorigin;
    }

    public void setPlaceorigin(String placeorigin) {
        this.placeorigin = placeorigin == null ? null : placeorigin.trim();
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life == null ? null : life.trim();
    }

    public String getAliias() {
        return aliias;
    }

    public void setAliias(String aliias) {
        this.aliias = aliias == null ? null : aliias.trim();
    }

    public String getFemaleheight() {
        return femaleheight;
    }

    public void setFemaleheight(String femaleheight) {
        this.femaleheight = femaleheight == null ? null : femaleheight.trim();
    }

    public String getMaleheight() {
        return maleheight;
    }

    public void setMaleheight(String maleheight) {
        this.maleheight = maleheight == null ? null : maleheight.trim();
    }

    public String getBrifeintro() {
        return brifeintro;
    }

    public void setBrifeintro(String brifeintro) {
        this.brifeintro = brifeintro == null ? null : brifeintro.trim();
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }

    public String getPetcharacter() {
        return petcharacter;
    }

    public void setPetcharacter(String petcharacter) {
        this.petcharacter = petcharacter == null ? null : petcharacter.trim();
    }

    public String getFitpeople() {
        return fitpeople;
    }

    public void setFitpeople(String fitpeople) {
        this.fitpeople = fitpeople == null ? null : fitpeople.trim();
    }

    public String getHaircarding() {
        return haircarding;
    }

    public void setHaircarding(String haircarding) {
        this.haircarding = haircarding == null ? null : haircarding.trim();
    }

    public String getVarietyvlaue() {
        return varietyvlaue;
    }

    public void setVarietyvlaue(String varietyvlaue) {
        this.varietyvlaue = varietyvlaue == null ? null : varietyvlaue.trim();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed == null ? null : breed.trim();
    }

    public String getDiseasepre() {
        return diseasepre;
    }

    public void setDiseasepre(String diseasepre) {
        this.diseasepre = diseasepre == null ? null : diseasepre.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
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
}