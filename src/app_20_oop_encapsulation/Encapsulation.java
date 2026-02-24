package app_20_oop_encapsulation;

// Инкапсуляция: скрываем данные и даем доступ через методы.

public class Encapsulation {
    public static void main(String[] args) {
        // Инкапсуляция: доступ к полю через геттер/сеттер.
        Computer computer = new Computer();
        computer.setRam(12);
        System.out.println("RAM: " + computer.getRam());
        System.out.println("Double RAM: " + computer.getDoubleRam());
    }
}

class Computer {
    private int ram;

    public void setRam(int ram) {
        if (ram <= 0) {
            throw new IllegalArgumentException("RAM must be positive");
        }
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public int getDoubleRam() {
        return ram * 2;
    }
}
