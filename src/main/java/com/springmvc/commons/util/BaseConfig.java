package com.springmvc.commons.util;

import org.apache.log4j.Logger;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class BaseConfig implements ServletContextAware {
    private static Logger logger = Logger.getLogger(BaseConfig.class);

    /**
     * classPath 路径
     */
    public static String classPath = "";
    /**
     * web跟目录 webroot
     */
    public static String webPath = "";

    public static String url = "";

    /**
     * 一般上传文件的跟目录
     */
    public static String uploadPath = "";

    public static String tomCatPath = "";

    private ServletContext servletContext;

    private String name;

    private String age;

    private String devName;

    private String saName;

    //私有的默认构造子
    private BaseConfig() {
    }


    //获取spring创建的bean对象
    public synchronized static BaseConfig getInstance() {
        return ServletUtil.getApplicationContext().getBean(BaseConfig.class);
    }


    /**
     * 初始化加载ini文件
     *
     * @param []
     * @return void
     * @author louwei
     * @date 2018/8/16 21:32
     */
    //@PostConstruct   //在bean初始化完后执行
    public void load() throws IOException {

        Map<String, String> filePath = readProperties("/path.properties");

        classPath = this.getClass().getResource("/").getPath();//获取classpath路径
        webPath = servletContext.getRealPath("/");//获取webroot跟目录;
        uploadPath = filePath.get("file.wjdir") + filePath.get("file.wjtmp"); //设置一般文件上传目录
        //文件访问前缀
        url = filePath.get("file.wjvisit");

        System.out.println("webPath====" + webPath);
        System.out.println("classPath====" + classPath);
        System.out.println("uploadPath====" + uploadPath);
        System.out.println("tomCatPath====" + tomCatPath);
    }

    /**
     * 将properties配置文件转换为Map键值对
     *
     * @param path
     * @return
     * @throws IOException
     */
    public Map<String, String> readProperties(String path) throws IOException {

        InputStream is = getClass().getResourceAsStream(path);
        Properties prop = new Properties();
        prop.load(is);
        is.close();
        return (Map) prop;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getSaName() {
        return saName;
    }

    public void setSaName(String saName) {
        this.saName = saName;
    }

    @Override
    public void setServletContext(ServletContext arg0) {
        this.servletContext = arg0;
    }


}
