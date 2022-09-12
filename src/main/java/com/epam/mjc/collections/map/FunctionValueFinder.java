package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        return functionMap.containsKey(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map <Integer, Integer> result = new HashMap<>();
        for (int each : sourceList) {
            result.put(5 * each + 2, 1);
        }
        return result;
    }
}
