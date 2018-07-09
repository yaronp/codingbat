package com.yaronp;

import java.util.HashMap;
import java.util.Map;

public class mapBully {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "candy");
        map.put("b", "dirt");

        Map<String, String> map1 = new HashMap<String, String>();
        map.put("a", "");
        map.put("b", "candy");


        mapBullyF(map);
        assert mapBullyF(map).equals(map1);

    }

    private static Map<String, String> mapBullyF(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

}
