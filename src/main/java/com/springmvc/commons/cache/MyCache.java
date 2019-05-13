package com.springmvc.commons.cache;

import com.springmvc.commons.model.UserInfo;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.po.SyDept;
import com.springmvc.po.SyUsers;
import com.springmvc.service.SyDeptService;
import com.springmvc.service.SyUsersService;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: webssm
 * @description: 自定义缓存类
 * @author: lou wei
 * @create: 2018-09-04 18:05
 */
public class MyCache
{
    /**
     * 用户id-->用户信息对象  UserInfo
     */
    public static final String USERID2INFO = "userId2Info";

    /**
     * 部门id-->名称
     */
    public static final String DEPTID2NAME = "deptId2Name";

    /**
     * 角色id-->名称
     */
    public static final String ROLE2NAME = "roleId2Name";

    /**
     * 字典值类型 type-->类型下字典值
     */
    public static final String TYPE2LISTVALUES = "type2ListValues";

    /**
     * 字典值id-->字典值
     */
    public static final String LISTID2NAME = "listId2Name";
    /**
     * 数据权限  type : json格式查询规则
     */
    public static final String DATAPERMISSIONS = "dataPermissions";


    @Autowired
    private CacheManager ehcacheManager; //注入缓存管理器

    @Autowired
    private SyUsersService syUsersService;

    @Autowired
    private SyDeptService syDeptService;

    /*@Autowired
    private ListValuesService listValuesService;*/


    //私有的默认构造子
    private MyCache()
    {
    }

    //获取spring创建的bean对象
    public synchronized static MyCache getInstance()
    {

        return ServletUtil.getApplicationContext().getBean(MyCache.class);

    }

    /**
    * @Description: 根据用户id，获取用户名字
    * @Param: []
    * @return: java.lang.String
    * @Author: lou wei
    * @Date: 2018/9/17
    */
    public String getUserName(String ids)
    {
        if (StringUtils.isBlank(ids))
        {
            return "";
        }
        //获取缓存对象
        Cache cache = ehcacheManager.getCache(MyCache.USERID2INFO);
        String [] sz_ids = ids.split(",");
        StringBuilder name = new StringBuilder();
        for (String id : sz_ids)
        {
            UserInfo userInfo = getUserInfo(cache, id);
            if (userInfo != null)
            {
                name.append(userInfo.getTureName()).append(",");
            }
        }
        if (name.toString().equals(""))
        {
            return "";
        }
        return name.substring(0, name.lastIndexOf(","));
    }
    
    /** 
    * @Description: 根据部门id获取部门名字
    * @Param: [ids] 
    * @return: java.lang.String 
    * @Author: lou wei
    * @Date: 2018/9/21 
    */ 
    public String getDeptName(String ids)
    {
        if (StringUtils.isBlank(ids))
        {
            return "";
        }
        //获取缓存对象
        Cache cache = ehcacheManager.getCache(MyCache.DEPTID2NAME);
        String [] sz_ids = ids.split(",");
        StringBuilder names = new StringBuilder();

        for (String id : sz_ids)
        {
            Element element = cache.get(id);
            if (element == null)
            {
                SyDept dept = syDeptService.selectDeptNameByDeptId(id);
                if (dept != null)
                {
                    cache.put(new Element(id, dept.getDeptName()));
                    names.append(dept.getDeptName()).append(",");
                }
            }
            else
            {
                names.append(element.getObjectValue()).append(",");
            }
        }
        if ("".equals(names.toString()))
        {
            return "";
        }
        return names.substring(0, names.lastIndexOf(","));
    }

    /**
    * @Description: 查询用户缓存对象
    * @Param: [cache, id]
    * @return: com.springmvc.commons.model.UserInfo
    * @Author: lou wei
    * @Date: 2018/9/17
    */
    public UserInfo getUserInfo(Cache cache, String id)
    {
        UserInfo userInfo= null;
        //获取缓存
        Element element = cache.get(id);
        if (element == null)
        {
            SyUsers users = syUsersService.selectByPrimaryKey(id);
            userInfo = new UserInfo();
            userInfo.setDeptId(users.getDeptId());
            userInfo.setUserName(users.getUserName());
            userInfo.setTureName(users.getTrueName());
            //创建元素,将元素添加到缓存中
            cache.put(new Element(id, userInfo));
        }
        else
        {
            userInfo = (UserInfo) element.getObjectValue();
        }
        return userInfo;
    }

    /**
    * @Description:  根据类型获取对应的数据字典集合
    * @Param: [type]
    * @return: java.util.List<java.util.Map<java.lang.String,java.lang.String>>
    * @Author: lou wei
    * @Date: 2018/11/14
    */
    @SuppressWarnings("unchecked")
    /*public List<Map<String, String>> getListValues(Integer type)
    {
        if (type == null)
        {
            return null;
        }
        Cache cache = ehcacheManager.getCache(MyCache.TYPE2LISTVALUES);
        Element element = cache.get(type);
        if (element == null)
        {
            List<ListValues> values = listValuesService.selectListByType(type);
            if (!values.isEmpty())
            {
                List<Map<String, String>> list = new ArrayList<>();
                for (ListValues v :values)
                {
                    Map<String,String> m=new HashMap<String,String>();
                    m.put("value", v.getId());
                    m.put("name", v.getListValue());
                    list.add(m);
                }
                cache.put(new Element(type, list));
                return list;
            }
        }
        else
        {
            return (List<Map<String, String>>) element.getObjectValue();
        }
        return null;
    }*/

    /**
    * @Description: 删除缓存对象
    * @Param: [cacheName, key]
    * @return: void
    * @Author: lou wei
    * @Date: 2018/9/28
    */
    public void removeCache(String cacheName, Object key)
    {
        ehcacheManager.getCache(cacheName).remove(key);
    }
}
