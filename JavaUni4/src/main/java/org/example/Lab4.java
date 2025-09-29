package org.example;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Виконавчий клас для лабораторної роботи №4.
 */
public class Lab4 {

    /**
     * Головний метод виконання програми.
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        String inputText = "Це перше речення з унікальними словами. " +
                "Друге речення містить загальні слова. " +
                "Третє речення також має загальні елементи.";

        Text text = new Text(inputText);
        List<Sentence> sentences = text.getSentences();

        if (sentences.size() < 2) {
            System.out.println("Текст повинен містити принаймні два речення.");
            return;
        }

        Sentence firstSentence = sentences.get(0);
        Set<String> otherWords = new HashSet<>();

        for (int i = 1; i < sentences.size(); i++) {
            for (Word w : sentences.get(i).getWords()) {
                otherWords.add(w.getWord());
            }
        }

        for (Word w : firstSentence.getWords()) {
            if (!otherWords.contains(w.getWord())) {
                System.out.println("Унікальне слово з першого речення: " + w.getWord());
                return;
            }
        }

        System.out.println("Унікальних слів у першому реченні не знайдено.");
    }
}