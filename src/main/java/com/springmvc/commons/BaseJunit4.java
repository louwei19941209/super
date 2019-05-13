package com.springmvc.commons;


import com.springmvc.commons.util.BaseConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:/spring-mybatis.xml"})
public class BaseJunit4 extends AbstractJUnit4SpringContextTests
{

    public final static String SAVEPATH = BaseConfig.webPath + "jps";


    public void ss()
    {
        System.out.println(SAVEPATH);
    }
}
