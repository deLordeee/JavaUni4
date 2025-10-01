package org.example;

/**
 * Клас для представлення розділового знака.
 * Використовується у класі {@link Sentence}.
 */
public class Punctuation {
    private final char mark;

    /**
     * Конструктор.
     *
     * @param mark символ розділового знака
     */
    public Punctuation(char mark) {
        this.mark = mark;
    }

    /**
     * Повертає символ розділового знака.
     *
     * @return розділовий знак
     */
    public char getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return String.valueOf(mark);
    }
}
