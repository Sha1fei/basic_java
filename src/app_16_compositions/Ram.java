package app_16_compositions;

/**
 * Модуль оперативной памяти (RAM).
 * Используется как часть компьютера (композиция).
 */
public class Ram {
    /** Объём в мегабайтах. */
    private int size;

    public Ram() {
    }

    public Ram(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
