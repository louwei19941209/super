package com.springmvc.commons.tag;

import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @program: webssm
 * @description: 根据字典值类型，以下拉列表方式输出字典值
 * @author: lou wei
 * @create: 2018-11-15 10:58
 **/
public class OutSelectOptionTag extends SimpleTagSupport
{
    private Integer type;

   /* @Override
    public void doTag() throws JspException, IOException
    {
        JspWriter out = getJspContext().getOut();
        if (type == null)
        {
            out.print("");
        }
        else
        {
            List<Map<String, String>> list = MyCache.getInstance().getListValues(type);
            if (list != null)
            {
                for (Map<String, String> m : list)
                {
                    out.print("<option value=\""+m.get("value")+"\">"+m.get("name")+"</option>");
                }
            }
        }
    }*/

    public Integer getType()
    {
        return type;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }
}
