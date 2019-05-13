package com.springmvc.commons.tag;

import com.springmvc.commons.util.ServletUtil;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @program: webssm
 * @description: 验证当前用户是否是开发人员
 * @author: lou wei
 * @create: 2018-09-24 11:06
 **/
public class IsDeveloperTag extends TagSupport
{
    private static final long serialVersionUID = 1L;

    //对标签内容的处理
    public int doStartTag() throws JspException
    {
        if (ServletUtil.isDeveloper())
        {
            return EVAL_BODY_INCLUDE; //标签内包含的内容被正常执行
        }
        return SKIP_BODY; //不显示该标签之间的内容
    }
}
