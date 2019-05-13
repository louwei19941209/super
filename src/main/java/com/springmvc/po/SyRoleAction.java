package com.springmvc.po;

public class SyRoleAction
{
    private String id;

    private String roleId;

    private String actionId;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId()
    {
        return roleId;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getActionId()
    {
        return actionId;
    }

    public void setActionId(String actionId)
    {
        this.actionId = actionId == null ? null : actionId.trim();
    }
}