package com.company.SentenceStatistics;

import java.util.HashMap;

public class Main {
    public static void main( String[] args ) {

        HashMap<Character, Integer> map = new HashMap<>();

        String text = "daavvvidd";

        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);

            if (map.containsKey(charAt)) {
                Integer integer = map.get(charAt);
                integer++;
                map.put(charAt, integer);
            } else {
                map.put(charAt, 1);
            }
        }
        System.out.println(map);
    }
}