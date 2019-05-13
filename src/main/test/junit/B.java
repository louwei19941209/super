package junit;

import com.springmvc.commons.util.JsonUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class B
{
    public static String s = "";

    public static void main(String[] args)
    {
        A a = new A();
        a.load();
        s = A.a;
        System.out.println("***"+s+"***");

        JsonUtil.json();
    }

    @Test
    public void test()
    {
        List<List> list = new ArrayList<>();

        List list1 = new ArrayList();

        list1.add("sss");
        list1.add("xxx");
        list1.add("nnn");

        list.add(list1);
        int i = 0;
        for (List b : list)
        {
           for (Object o : b)
           {
               System.out.println(o);
           }
        }
    }

}
