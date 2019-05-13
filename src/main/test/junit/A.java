package junit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class A
{

    public static String a = "";
    public static int i = 0;



    public void load()
    {
        a = "xxx";
        i = 2;
        System.out.println(i+a);
    }

    public static void main(String[] args)
    {
        String url = "task/todo/load.do?rel=gzlc_dbrw";
        String url2 = "work/monitor/load.do?rel=gzlc_lcjk";

        List<String> urls = new ArrayList<>();
        List<String> urls2 = new ArrayList<>();
        urls2.add("1");
        urls2.add("2");
        urls.add(url);
        urls.add(url2);
        urls.addAll(urls2);

        for (String u : urls)
        {
            System.out.println(u.split("\\?")[0]);
        }
    }

    @Test
    public void test()
    {
        System.out.println(i);
    }
}
