package junit;


import com.springmvc.commons.util.BaseConfig;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:/spring-mybatis.xml"})
public class BaseJunit4 extends AbstractJUnit4SpringContextTests
{

    public final static String SAVEPATH = BaseConfig.webPath + "jps";

    @Test
    public void ss()
    {
        System.out.println(SAVEPATH);
    }
}