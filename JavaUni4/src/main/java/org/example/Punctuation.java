package org.example;

/**
 * Клас для представлення розділового знака.
 */
public class Punctuation {
    private final char mark;

    /**
     * Конструктор.
     * @param mark символ розділового знака
     */
    public Punctuation(char mark) {
        this.mark = mark;
    }

    public char getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return String.valueOf(mark);
    }
}