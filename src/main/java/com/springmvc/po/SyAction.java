package com.springmvc.po;

public class SyAction
{
    private String id;

    private String menuId;

    private Short actionSort;

    private String actionName;

    private String actionUrl;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id == null ? null : id.trim();
    }

    public String getMenuId()
    {
        return menuId;
    }

    public void setMenuId(String menuId)
    {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public Short getActionSort()
    {
        return actionSort;
    }

    public void setActionSort(Short actionSort)
    {
        this.actionSort = actionSort;
    }

    public String getActionName()
    {
        return actionName;
    }

    public void setActionName(String actionName)
    {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public String getActionUrl()
    {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl)
    {
        this.actionUrl = actionUrl == null ? null : actionUrl.trim();
    }
}