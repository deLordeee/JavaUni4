package org.example;

/**
 * Клас для представлення однієї літери.
 * Використовується як елемент у класі {@link Word}.
 */
public class Letter {
    private final char value;

    /**
     * Конструктор класу Letter.
     *
     * @param value символ літери
     */
    public Letter(char value) {
        this.value = value;
    }

    /**
     * Повертає символ літери.
     *
     * @return символ
     */
    public char getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
