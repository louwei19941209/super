package com.springmvc.service.impl;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.SyDeptMapper;
import com.springmvc.po.SyDept;
import com.springmvc.service.SyDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: webssm
 * @description: 部门管理 业务层
 * @author: lou wei
 * @create: 2018-09-21 10:52
 **/
@Service
public class SyDeptServiceImpl implements SyDeptService
{

    @Autowired
    private SyDeptMapper syDeptMapper;

    /**
    * @Description: 根据部门id获取部门名称
    * @Param: [deptId]
    * @return: com.springmvc.po.SyDept
    * @Author: lou wei
    * @Date: 2018/9/21
    */
    @Override
    public SyDept selectDeptNameByDeptId(String deptId)
    {
        return syDeptMapper.selectByPrimaryKey(deptId);
    }

    /**
    * @Description: 所有部门
    * @Param: []
    * @return: java.util.List<com.springmvc.po.SyDept>
    * @Author: lou wei
    * @Date: 2018/9/27
    */
    @Override
    public List<SyDept> selectAllDept()
    {
        return syDeptMapper.selectAll();
    }

    /**
    * @Description: 所有部门分页
    * @Param: []
    * @return: com.springmvc.commons.model.DataGrid
    * @Author: lou wei
    * @Date: 2018/9/27
    */
    @Override
    public DataGrid selectAllDeptByPage(PageParam param, SyDept dept)
    {
        DataGrid data = new DataGrid();
        data.setTotal(param.getTotle());
        data.setRows(syDeptMapper.selectAllByPage(param, dept));
        return data;
    }

    /**
    * @Description: 查询部门详情
    * @Param: [id]
    * @return: com.springmvc.po.SyDept
    * @Author: lou wei
    * @Date: 2018/10/8
    */
    @Override
    public SyDept selectDeptById(String id)
    {
        return syDeptMapper.selectByPrimaryKey(id);
    }
}
