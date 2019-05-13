package com.springmvc.commons.util;

public class JsonUtil
{
    public static void json()
    {
       /* String jsonString = "[{\"comeCode\":\"oneforall\",\"company\":\"啪啪啪\",\"entrustSign\":\"321321321\",\"id\":9,\"laboratory\":\"研发部\",\"name\":\"橡胶果实\",\"number\":1,\"only\":\"45665465\",\"remarks\":\"1\",\"repair\":\"是\",\"specModel\":\"oneforall\",\"testType\":\"制造\",\"vulgo\":\"恶魔果实\"},{\"comeCode\":\"oneforall\",\"company\":\"啪啪啪\",\"entrustSign\":\"321321321\",\"id\":9,\"laboratory\":\"研发部\",\"name\":\"橡胶果实\",\"number\":1,\"only\":\"45665465\",\"remarks\":\"1\",\"repair\":\"是\",\"specModel\":\"oneforall\",\"testType\":\"制造\",\"vulgo\":\"恶魔果实\"}]";
        JSONArray json = JSONArray.parseArray(jsonString); // 首先把字符串转成 JSONArray  对象
        for (Object aJson : json)
        {
            JSONObject jsonObject = (JSONObject) aJson;
            *//*System.out.println(jsonObject.get("company"));
            Integer i = (Integer) jsonObject.get("id");
            System.out.println(i);*//*



            Map map = jsonObject;

            for (Object o : map.values())
            {
                System.out.println(o);
            }

        }*/





    }


    public static void main(String[] args)
    {
        json();
    }
}
