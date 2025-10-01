package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас для представлення тексту,
 * який складається з масиву {@link Sentence}.
 */
public class Text {
    private final List<Sentence> sentences = new ArrayList<>();

    /**
     * Створює текст з рядка.
     * <p>
     * Текст автоматично розбивається на речення
     * за допомогою розділових знаків (.!?).
     * </p>
     *
     * @param text вихідний текст
     */
    public Text(String text) {
        String normalized = text.replaceAll("[\\t ]+", " ");
        String[] sentenceParts = normalized.split("(?<=[.!?])");

        for (String s : sentenceParts) {
            String trimmed = s.trim();
            if (!trimmed.isEmpty()) {
                sentences.add(new Sentence(trimmed));
            }
        }
    }

    /**
     * Повертає список усіх речень у тексті.
     *
     * @return список речень
     */
    public List<Sentence> getSentences() {
        return sentences;
    }
}
