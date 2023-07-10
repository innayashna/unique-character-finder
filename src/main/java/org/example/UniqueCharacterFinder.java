package org.example;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacterFinder {

    public static char findUniqueCharacter(String text) {
        Set<Character> uniqueCharacters = new LinkedHashSet<>();

        String[] words = text.split("\\s+");

        // Перебираємо слова в порядку їх появи у тексті
        for (int i = 0; i < words.length; i++) {
            Map<Character, Integer> characterCounts = new HashMap<>();

            // Рахуємо кількість кожного з символів у слові
            for (char c : words[i].toCharArray()) {
                characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
            }

            // Знаходимо перший неповторюваний символ слова і додаємо його до колекції
            for (char c : words[i].toCharArray()) {
                if (characterCounts.get(c) == 1) {
                    uniqueCharacters.add(c);
                    break;
                }
            }

            // Перевіряємо символи з попереднього слова й видаляємо ті, які повторюються
            for (int j = 0; j < i; j++) {
                for (char c : words[j].toCharArray()) {
                    if (characterCounts.containsKey(c)) {
                        uniqueCharacters.remove(c);
                    }
                }
            }
        }

        return uniqueCharacters.iterator().next();
    }
}
