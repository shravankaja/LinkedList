package com.linkedlist;

import org.junit.jupiter.api.*;

import java.util.*;

public class HashMapTest {
    @Test
    void givenASentenceShouldReturnWordFrequuency() {
        String sentence = "To be or not to be  ";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = hashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            hashMap.add(word, value);
        }
        int frequency = hashMap.get("to");
        System.out.println(hashMap);
        Assertions.assertEquals(2, frequency);
    }
}
