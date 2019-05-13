package com.springmvc.commons.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @program: webssm
 * @description: 用于封装分页的一些参数
 * @author: lou wei
 * @create: 2018-09-14 14:47
 **/
@ApiModel(value = "PageParam", description = "分页参数")
public class PageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认页数
     */
    @ApiModelProperty("[非必填] 默认页数1")
    private int page = 1;
    /**
     * 默认显示条数
     */
    @ApiModelProperty("[非必填] 默认条数20")
    private Integer rows = 20;
    /**
     * 是否启用分页
     */
    private Boolean defaultUseFlag;
    /**
     * 是否检验当前页码的合法性
     */
    private Boolean defaultCheckFlag;
    /**
     * 当前sql查询的总条数
     */
    private Integer totle;
    /**
     * 当前sql查询实现分页后的总页数，回填
     */
    private Integer totlePage;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Boolean getDefaultUseFlag() {
        return defaultUseFlag;
    }

    public void setDefaultUseFlag(Boolean defaultUseFlag) {
        this.defaultUseFlag = defaultUseFlag;
    }

    public Boolean getDefaultCheckFlag() {
        return defaultCheckFlag;
    }

    public void setDefaultCheckFlag(Boolean defaultCheckFlag) {
        this.defaultCheckFlag = defaultCheckFlag;
    }

    public Integer getTotle() {
        return totle;
    }

    public void setTotle(Integer totle) {
        this.totle = totle;
    }

    public Integer getTotlePage() {
        return totlePage;
    }

    public void setTotlePage(Integer totlePage) {
        this.totlePage = totlePage;
    }
}
