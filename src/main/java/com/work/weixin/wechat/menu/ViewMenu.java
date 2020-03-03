package com.work.weixin.wechat.menu;

public class ViewMenu
{

    private String type;
    private String name;
    private String url;
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getUrl()
    {
        return url;
    }
    public void setUrl(String url)
    {
        this.url = url;
    }
    @Override
    public String toString()
    {
        return "{\"type\":\"" + type + "\", \"name\":\"" + name + "\", \"url\":\"" + url + "\"}";
    }
    
    
    
}
