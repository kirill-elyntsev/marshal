package com.elyntsev.marshal.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {

    public Map<String, Integer> countOccurrences(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (!isFolder(s)) {
                Integer i = map.get(s);
                map.put(s, (i == null) ? 1 : i + 1);
            }
        }
        return map;
    }

    private boolean isFolder(String s) {
        return s.isEmpty();
    }
}
