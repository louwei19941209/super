package com.springmvc.commons.model;

import java.io.Serializable;
import java.util.List;

/**
 * @program: webssm
 * @description: easyui 分页查询数据表格返回的结果
 * @author: lou wei
 * @create: 2018-09-05 22:05
 */
public class DataGrid implements Serializable
{

    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    private Integer total;
    /**
     * 查询数据集合
     */
    @SuppressWarnings("rawtypes")
    private List rows;
    /**
     * 表格底部显示的信息,固定在底部
     * 列名和数据列名相同
     */
    @SuppressWarnings("rawtypes")
    private List footer;

    public Integer getTotal()
    {
        return total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }

    public List getRows()
    {
        return rows;
    }

    public void setRows(List rows)
    {
        this.rows = rows;
    }

    public List getFooter()
    {
        return footer;
    }

    public void setFooter(List footer)
    {
        this.footer = footer;
    }
}
