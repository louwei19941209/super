package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyDept;
import com.springmvc.service.SyDeptService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: webssm
 * @description: 部门，控制层
 * @author: lou wei
 * @create: 2018-09-27 15:29
 **/
@Controller
@RequestMapping("dept")
public class SyDeptController extends BaseAction {
    @Autowired
    private SyDeptService syDeptService;


    /**
     * @Description: 跳转部门页面
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/10/8
     */
    @RequestMapping("load")
    public String load() {
        return "system/organize/dept/load";
    }


    /**
     * @Description: 查询所有部门
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @RequestMapping("allDept")
    public ModelAndView selectDept() {
        return ajaxJson(syDeptService.selectAllDept());
    }

    /**
     * @Description: 部门查询，查找带回
     * @Param: [type 1:单选，2：多选，3：上级部门查询]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @RequestMapping("lookUpPage")
    public String lookUpPage(Integer type) {
        if (type != null) {
            if (type == 2) {
                return "system/organize/dept/lookup_more";
            } else {
                return "system/organize/dept/lookup";
            }
        } else {

            return "system/organize/dept/lookup";
        }
    }

    /**
     * @Description: 部门查询，查找带回
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @RequestMapping("lookUp")
    public ModelAndView lookUp(PageParam param, SyDept dept) {
        return ajaxJson(syDeptService.selectAllDeptByPage(param, dept));
    }

    /**
     * @Description: 添加部门
     * @Param: [dept]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @RequestMapping("add")
    @RequiresPermissions("dept:add")
    public ModelAndView addDept(SyDept dept) {
        return null;
    }

    /**
     * @Description: 部门修改页面
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/10/8
     */
    @RequestMapping("updatePage")
    public String updatePage(String id, ModelMap map) {
        SyDept dept = syDeptService.selectDeptById(id);
        if (dept == null) {
            return NODATA;
        }
        map.addAttribute("dept", dept);
        return "system/organize/dept/update";
    }
}
