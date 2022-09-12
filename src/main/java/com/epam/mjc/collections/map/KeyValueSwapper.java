package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> reversed = new HashMap<>();
        for (Map.Entry<Integer, String> a : sourceMap.entrySet()) {
            reversed.put(a.getValue(), a.getKey());
        }

        return reversed;
    }
}
