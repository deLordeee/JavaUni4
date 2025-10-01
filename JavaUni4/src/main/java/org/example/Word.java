package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас для представлення слова,
 * яке складається з {@link Letter}.
 */
public class Word {
    private final List<Letter> letters = new ArrayList<>();

    /**
     * Створює слово з рядка.
     * <p>
     * Усі символи, які є літерами, зберігаються як {@link Letter}.
     * Слово автоматично переводиться у нижній регістр.
     * </p>
     *
     * @param word рядок, що містить слово
     */
    public Word(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(new Letter(Character.toLowerCase(ch)));
            }
        }
    }

    /**
     * Повертає слово у вигляді рядка.
     *
     * @return слово
     */
    public String getWord() {
        StringBuilder sb = new StringBuilder();
        for (Letter letter : letters) {
            sb.append(letter.getValue());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getWord();
    }
}
