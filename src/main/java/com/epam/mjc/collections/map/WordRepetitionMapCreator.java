package com.epam.mjc.collections.map;

import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence.replaceAll(",", "");
        Map <String, Integer> map = new HashMap <>();
        String [] words = sentence.split(" ");
        for (String word : words) {
            word.toLowerCase();
            if (map.containsKey(word)) {
                int temp = map.get(word);
                map.put(word, ++temp);
            }
            else {
                map.put(word, 1);
            }
        }

        return map;
    }
}
