package com.yaronp;

import java.util.HashMap;
import java.util.Map;

public class mapShare {
    public static void main(String[] args) {

        Map<String, String> map10 = new HashMap<String, String>();
        map10.put("a", "aaa");
        map10.put("b", "bbb");
        map10.put("c", "ccc");

        Map<String, String> map11 = new HashMap<String, String>();
        map11.put("a", "aaa");
        map11.put("b", "bbb");

        assert mapShareF(map10).equals(map11);
    }

    private static Map<String, String> mapShareF(Map<String, String> map) {
        map.remove("c");

        if (map.containsKey("a")) {
            map.put("b",map.get("a"));
        }
        return map;
    }
}
