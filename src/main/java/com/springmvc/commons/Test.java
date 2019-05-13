package com.springmvc.commons;


import com.springmvc.commons.util.BaseConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class Test {
    private static final String PROPERTIES_NAME = Thread.currentThread().getContextClassLoader().getResource("jdbc.properties").getPath();
    public static String db_driver = null;
    public static String db_url = null;
    public static String db_user = null;
    public static String db_pwd = null;
    private static Date DATE;


    private final static String SAVEPATH = BaseConfig.uploadPath + "jps";


    public static void main(String[] args) throws IOException {

        //getProperties();
        //String s = "sss";
        //System.out.println(s.indexOf("ss"));


        //System.out.println(GetProperties.get("username"));

        //GetProperties get = new GetProperties();
        //System.out.println("****" + get.get("username") + "*****");

        /*Calendar tightNow = Calendar.getInstance();
        tightNow.setTime(DATE);*/
        //String name = BaseConfig.getInstance().getName();




        getDataBaseSql();

    }

    //获取properties 文件内容
    public static void getProperties() throws IOException {


        FileInputStream in;

        System.out.println(PROPERTIES_NAME);
        in = new FileInputStream(PROPERTIES_NAME);


        Properties properties = new Properties();
        properties.load(in);
        db_driver = properties.getProperty("driverClass");
        db_url = properties.getProperty("jdbcUrl");
        db_user = properties.getProperty("username");
        db_pwd = properties.getProperty("password");
        System.out.println("读取配置信息成功！");

        System.out.println("-----------------------配置信息-----------------");
        System.out.println("dirver: " + db_driver);
        System.out.println("url: " + db_url);
        System.out.println("user: " + db_user);
        System.out.println("passworld: " + db_pwd);
        System.out.println("----------------------------------------------");
    }


    public static Properties getJDBCProperties() throws IOException {
        FileInputStream in;
        in = new FileInputStream(PROPERTIES_NAME);
        Properties properties = new Properties();
        properties.load(in);
        return properties;
    }


    /**
     * 从数据库导出数据
     * @throws IOException
     */
    public static void getDataBaseSql() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        String command = getExportCommand();
        // 这里其实是在命令窗口中执行的 command 命令行
        try {
            Process exec = runtime.exec(command);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    private static String getExportCommand() throws IOException {

        StringBuilder command = new StringBuilder();

        Properties jdbcProperties = getJDBCProperties();

        // 用户名
        String username = jdbcProperties.getProperty("username");

        //密码
        String password = jdbcProperties.getProperty("password");

        // 导入的目标数据库的名称
        String exportDatabaseName = "test";

        // 导入的目标数据库所在的主机
        String host = "localhost";

        // 使用的端口号
        String port = "3307";

        // 导入的目标文件所在的位置
        String exportPath = "D:/文档/mytable.sql";

        // 路径是mysql中
        String mysqlPath = "D:/Program Files/MySQL/MySQL Server 5.5/bin/";

        // 注意哪些地方要空格，哪些不要空格、密码是用的小p，而端口是用的大P。
        command.append(mysqlPath).append("mysqldump -u").append(username).append(" -p").append(password)
                .append(" -h").append(host).append(" -P").append(port).append(" ").append(exportDatabaseName)
                .append(" -r ").append(exportPath);
        return command.toString();


    }

}
