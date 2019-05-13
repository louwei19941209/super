package com.springmvc.po;

/**
 * @program: super
 * @description: 企业荣誉附件表
 * @author: lou wei
 * @create: 2019-04-30 10:30
 **/
public class HonorFile {

    private int id;

    private int honorId;

    private String newName;

    private String oldName;

    private String ext;

    private int size;

    private String path;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHonorId() {
        return honorId;
    }

    public void setHonorId(int honorId) {
        this.honorId = honorId;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
