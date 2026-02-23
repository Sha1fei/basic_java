package app_16_compositions;

/**
 * Накопитель SSD.
 * Используется как часть компьютера (композиция).
 */
public class Ssd {
    /** Объём в гигабайтах (или МБ — по договорённости). */
    private int size;

    public Ssd() {
    }

    public Ssd(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
