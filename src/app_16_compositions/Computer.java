package app_16_compositions;

/**
 * Компьютер — пример композиции: содержит Ram и Ssd (отношение «имеет», has-a).
 * Компоненты передаются в конструктор; без них компьютер не собирается.
 */
public class Computer {
    private Ram ram;
    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    /** Вывод параметров: объём RAM (МБ) и SSD. */
    public void show() {
        System.out.println("Computer: RAM=" + ram.getSize() + " MB, SSD=" + ssd.getSize() + " GB");
    }

    public Ram getRam() {
        return ram;
    }

    public Ssd getSsd() {
        return ssd;
    }
}
