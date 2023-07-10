package org.example;

import static org.example.UniqueCharacterFinder.findUniqueCharacter;

public class Main {
    public static void main(String[] args) {
        String text = "C makes it easy for you to shoot yourself in the foot." +
                " C++ makes that harder, but when you do, it blows away your whole leg. " +
                "(с) Bjarne Stroustrup";

        char uniqueCharacter = findUniqueCharacter(text);
        System.out.println("Перший унікальний символ: " + uniqueCharacter);
    }
}