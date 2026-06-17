package homework9;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {

        String sentence = "java git java oop java git python";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println(map);
    }
}