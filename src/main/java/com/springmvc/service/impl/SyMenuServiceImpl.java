package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.Menu;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.mapper.SyMenuMapper;
import com.springmvc.po.SyMenu;
import com.springmvc.service.SyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program: webssm
 * @description: 菜单管理 业务层实现
 * @author: lou wei
 * @create: 2018-09-20 16:01
 **/
@Service
public class SyMenuServiceImpl implements SyMenuService
{
    @Autowired
    private SyMenuMapper syMenuMapper;

    /**
    * @Description: 查询所有顶级菜单
    * @Param: []
    * @return: java.util.List
    * @Author: lou wei
    * @Date: 2018/9/20
    */
    @Override
    public List selectMenusTop()
    {
        List<String> roleIds = ServletUtil.getRoleIdsByUserId(ServletUtil.getMember().getId());
        List list;
        if (ServletUtil.isDeveloper())
        {
            list = syMenuMapper.selectMenusTop();
        }
        else
        {
            list = syMenuMapper.selectMenusTopByUserRole(roleIds);
        }
        return list;
    }

    /**
    * @Description: 查询用户自定义菜单
    * @Param: []
    * @return: java.util.List
    * @Author: lou wei
    * @Date: 2018/9/21
    */
    @Override
    public List selectUserCustomizeMenu(String userId)
    {
        return syMenuMapper.selectUserCustomizeMenu(userId);
    }

    /**
    * @Description: 根据菜单id获取菜单详情
    * @Param: []
    * @return: com.springmvc.po.SyMenu
    * @Author: lou wei
    * @Date: 2018/9/21
    */
    @Override
    public SyMenu selectMenuById(String menuId)
    {
        return syMenuMapper.selectByPrimaryKey(menuId);
    }

    /**
    * @Description: 查询我的菜单列表
    * @Param: []
    * @return: java.util.List<com.springmvc.po.SyMenu>
    * @Author: lou wei
    * @Date: 2018/9/21
    */
    @Override
    public List<SyMenu> selectMyMenus()
    {
        List<String> roleIds = ServletUtil.getRoleIdsByUserId(ServletUtil.getMember().getId());
        List<SyMenu> list;
        if (ServletUtil.isDeveloper())  //是否是开发者
        {
            list = syMenuMapper.selectAllMenus();
        }
        else
        {
            list = syMenuMapper.selectMyMenus(roleIds);
        }
        return list;
    }

    /**
    * @Description: 查询菜单下的子菜单
    * @Param: [list, menu, superId]
    * @return: void
    * @Author: lou wei
    * @Date: 2018/9/21
    */
    @Override
    public void getChildrenMenusBySuperId(List<SyMenu> list, Menu menu, String superId)
    {
        List<Menu> childrenMenus=new ArrayList<Menu>();

        for (SyMenu s : list)
        {
            if (s.getMenuSuperId().equals(superId))
            {
                Menu m = new Menu();
                m.setId(s.getId());
                m.setRel(s.getMenuRel());
                m.setUrl(s.getMenuUrl());
                m.setIcon(s.getMenuIcon());
                m.setOpen(s.getMenuOpen());
                m.setName(s.getMenuName());
                m.setFresh(s.getMenuFresh());
                m.setTarget(s.getMenuTarget());
                m.setSuperId(s.getMenuSuperId());
                m.setExternal(s.getMenuExternal());

                //递归获取下级菜单
                getChildrenMenusBySuperId(list, m, m.getId());
                childrenMenus.add(m);
            }
        }
        menu.setChildrenMenus(childrenMenus);
    }

    /**
    * @Description: 查询所有菜单
    * @Param: []
    * @return: java.util.List<com.springmvc.po.SyMenu>
    * @Author: lou wei
    * @Date: 2018/9/24
    */
    @Override
    public List<SyMenu> selectAllMenus()
    {
        return syMenuMapper.selectAllMenus();
    }

    /**
    * @Description: 查询菜单详情，带父类名称
    * @Param: [id]
    * @return: java.util.Map
    * @Author: lou wei
    * @Date: 2018/9/24
    */
    @Override
    public Map selectMenusById(String id)
    {
        return syMenuMapper.selectDetailsById(id);
    }

    /**
    * @Description: 修改菜单
    * @Param: [menu]
    * @return: java.lang.String
    * @Author: lou wei
    * @Date: 2018/9/25
    */
    @Override
    public String updateMenu(SyMenu menu)
    {
        SyMenu menu1 = new SyMenu();
        menu1.setId(menu.getId());
        menu1.setMenuName(menu.getMenuName());
        menu1.setMenuSuperId(menu.getMenuSuperId());

        SyMenu syMenu = syMenuMapper.selectByCondition(menu1);
        if (syMenu == null)
        {
            if (ServletUtil.isDeveloper())
            {
                //开发人员可修改全部字段
                if (syMenuMapper.updateByPrimaryKey(menu) > 0)
                {
                    return MsgConfig.MSG_KEY_SUCCESS;
                }
                else
                {
                    return MsgConfig.MSG_KEY_FAIL;
                }
            }
            else
            {
                SyMenu old = syMenuMapper.selectByPrimaryKey(menu.getId());
                old.setMenuIcon(menu.getMenuIcon());
                old.setMenuName(menu.getMenuName());
                old.setMenuOpen(menu.getMenuOpen());
                old.setMenuSort(menu.getMenuSort());
                old.setMenuSuperId(menu.getMenuSuperId());

                //非开发人员只可修改部分字段
                if (syMenuMapper.updateByPrimaryKey(old) > 0)
                {
                    return MsgConfig.MSG_KEY_SUCCESS;
                }
                else
                {
                    return MsgConfig.MSG_KEY_FAIL;
                }
            }
        }
        else
        {
            return "msg.menuname.unique";
        }

    }

    /**
    * @Description: 查询菜单图标
    * @Param: []
    * @return: java.lang.String[]
    * @Author: lou wei
    * @Date: 2018/9/25
    */
    @Override
    public String[] selectMenusIcons()
    {
        File node = new File(BaseConfig.webPath+"/resource/images/menu/");
        String[] names = node.list();
        for (int i = 0; i < names.length ; i++)
        {
            names[i] = "resource/images/menu/"+names[i];
        }
        return names;
    }

    /**
    * @Description: 添加菜单
    * @Param: [menu]
    * @return: java.lang.String
    * @Author: lou wei
    * @Date: 2018/9/25
    */
    @Override
    public String addMenu(SyMenu menu)
    {
        SyMenu syMenu = syMenuMapper.selectByCondition(menu);
        if (syMenu==null)
        {
            if (syMenuMapper.insert(menu) > 0)
            {
                return MsgConfig.MSG_KEY_SUCCESS;
            }
            else
            {
                return MsgConfig.MSG_KEY_FAIL;
            }
        }
        else
        {
            return "msg.menuname.unique";//菜单名已被占用
        }

    }

    /**
    * @Description: 删除菜单
    * @Param: [id]
    * @return: java.lang.String
    * @Author: lou wei
    * @Date: 2018/9/25
    */
    @Override
    public String deleteMenu(String id)
    {
        List list = syMenuMapper.selectChild(id);
        if (list.size() > 0)
        {
            return "msg.menu.haschild";
        }
        else
        {
            SyMenu menu =syMenuMapper.selectByPrimaryKey(id);
            if (menu != null)
            {
                if (syMenuMapper.deleteByPrimaryKey(id) > 0)
                {
                    return MsgConfig.MSG_KEY_SUCCESS;
                }
                else
                {
                    return MsgConfig.MSG_KEY_FAIL;
                }
            }
            else
            {
                return MsgConfig.MSG_KEY_NODATA;
            }
        }
    }
}
