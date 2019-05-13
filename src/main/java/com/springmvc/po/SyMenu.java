package com.springmvc.po;

public class SyMenu {
    private String id;

    private String menuSuperId;

    private Byte menuStatus;

    private Short menuSort;

    private String menuName;

    private String menuIcon;

    private String menuUrl;

    private String menuTarget;

    private String menuRel;

    private String menuOpen;

    private String menuExternal;

    private String menuFresh;

    private String superName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMenuSuperId() {
        return menuSuperId;
    }

    public void setMenuSuperId(String menuSuperId) {
        this.menuSuperId = menuSuperId == null ? null : menuSuperId.trim();
    }

    public Byte getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Byte menuStatus) {
        this.menuStatus = menuStatus;
    }

    public Short getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Short menuSort) {
        this.menuSort = menuSort;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuTarget() {
        return menuTarget;
    }

    public void setMenuTarget(String menuTarget) {
        this.menuTarget = menuTarget == null ? null : menuTarget.trim();
    }

    public String getMenuRel() {
        return menuRel;
    }

    public void setMenuRel(String menuRel) {
        this.menuRel = menuRel == null ? null : menuRel.trim();
    }

    public String getMenuOpen() {
        return menuOpen;
    }

    public void setMenuOpen(String menuOpen) {
        this.menuOpen = menuOpen == null ? null : menuOpen.trim();
    }

    public String getMenuExternal() {
        return menuExternal;
    }

    public void setMenuExternal(String menuExternal) {
        this.menuExternal = menuExternal == null ? null : menuExternal.trim();
    }

    public String getMenuFresh() {
        return menuFresh;
    }

    public void setMenuFresh(String menuFresh) {
        this.menuFresh = menuFresh == null ? null : menuFresh.trim();
    }

    public String getSuperName()
    {
        return superName;
    }

    public void setSuperName(String superName)
    {
        this.superName = superName;
    }
}