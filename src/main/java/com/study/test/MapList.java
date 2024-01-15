package com.study.test;


import java.util.*;

public class MapList {
    public static void main(String[] args) {


        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String,Object>();

        map1.put("name", "홍길동");
        map1.put("rating", "vip");
        map1.put("age", "30");
        customers.add(map1);

        Map<String, Object> map2 = new HashMap<String,Object>();

        map2.put("name", "김기영");
        map2.put("rating", "gold");
        map2.put("age", "35");
        customers.add(map2);

        for (Map<String, Object> customer : customers) {
            for (Map.Entry<String, Object> entry : customer.entrySet()) {
                String key = entry.getKey();
                String value = (String) entry.getValue();
                System.out.println(key + " = " + value);
            }
        }

//            System.out.println("name=" +customer.get("name"));
//            System.out.println("rating=" +customer.get("rating"));
//            System.out.println("age=" +customer.get("age"));


//        for(Map<String, Object> map : resultMap){
//            for(Map.Entry<String, Object> entry : map.entrySet()){
//                String key = entry.getKey();
//                Object value = entry.getValue();
//                System.out.println("key: " + key + " | value: " + value);
//                System.out.println(key +"=" + value);
//            }
//    }

}
}