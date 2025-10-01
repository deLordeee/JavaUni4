package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас для представлення речення,
 * яке складається зі {@link Word} та {@link Punctuation}.
 */
public class Sentence {
    private final List<Word> words = new ArrayList<>();
    private final List<Punctuation> punctuations = new ArrayList<>();

    /**
     * Створює речення з рядка.
     * <p>
     * Речення розбивається на слова та розділові знаки.
     * </p>
     *
     * @param sentence текст речення
     */
    public Sentence(String sentence) {
        String normalized = sentence.replaceAll("[\\t ]+", " ");
        String[] parts = normalized.split("\\s+");

        for (String part : parts) {
            String cleanWord = part.replaceAll("[^\\p{L}]", "");
            if (!cleanWord.isEmpty()) {
                words.add(new Word(cleanWord));
            }
            String marks = part.replaceAll("[\\p{L}]", "");
            for (char c : marks.toCharArray()) {
                punctuations.add(new Punctuation(c));
            }
        }
    }

    /**
     * Повертає список слів у реченні.
     *
     * @return список слів
     */
    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word word : words) {
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
