package com.work.weixin.wechat.menu;


import java.util.List;


public class SubButton
{

    private String name;

    private List<ViewMenu> listView;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<ViewMenu> getListView()
    {
        return listView;
    }

    public void setListView(List<ViewMenu> listView)
    {
        this.listView = listView;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("{\"name\":\"" + name + "\", \"sub_button\":[");
      
        for (ViewMenu vo : listView){
            sb.append(vo.toString());
            sb.append(",");
        }
        String str = sb.toString();
        str = str.substring(0, str.length()-1);
        return str + "]}";
    }
    
    

}
