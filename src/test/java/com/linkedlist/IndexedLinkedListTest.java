package com.linkedlist;

import org.junit.jupiter.api.*;

public class IndexedLinkedListTest {
    @Test
    public void indexedLinkedList() {
        String sentence = "Paranoids are not paranoids because they are paranoids but" +
                "because they keep putting themselves" +
                "deliberately into paranoids avoidable" +
                "situations";
        IndexedLinkedList<String, Integer> indexedLinkedList = new IndexedLinkedList<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = indexedLinkedList.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            indexedLinkedList.add(word, value);
        }
        int frequency = indexedLinkedList.get("paranoids");
        Assertions.assertEquals(3, frequency);
        indexedLinkedList.deleteNode("are");
        int frequencyOne = indexedLinkedList.get("are");
        System.out.println(indexedLinkedList);
        Assertions.assertEquals(0, frequencyOne);

    }
}
