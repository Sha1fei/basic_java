package app_21_oop_inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(1024);
        System.out.println("RAM: " + laptop.getRam());
        System.out.println("SSD: " + laptop.getSsd());
        System.out.println(": " + laptop.load());
    }
}

// Базовый класс: общие поля и поведение для наследников.
class Computer {
    // protected: видно наследникам, но скрыто для внешнего кода
    protected int ssd;
    // final: значение задаётся в конструкторе и больше не меняется
    private final int ram;

    public Computer(int ram) {
        this(ram, 2048);
    }


    public Computer() {
        this(0, 2048);
    }
    

    public Computer(int ram, int ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }


    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setRam(int ssd) {
        this.ssd = ssd;
    }
}

// final: класс нельзя наследовать, но происходит наследование Laptop от класса Computer
final class Laptop extends Computer {
    static {
        // Статический блок: выполняется один раз при загрузке класса
        System.out.println("Static init: class is loaded once.");
    }

    {
        // Инициализатор экземпляра: выполняется перед конструктором
        System.out.println("Instance init: runs before constructor.");
    }

    // Вызываем конструктор базового класса и задаём SSD=512
    public Laptop(int ram) {
        super(ram, 512);
        System.out.println("Static init: class is loaded once.");
    }

    /**
     * Метод демонстрирует работу с унаследованными методами:
     * меняет значение через сеттер, выводит RAM и возвращает строку.
     */
    public String load (){
        super.setRam(5000);
        System.out.println(super.getRam());
        return "I'm laoded";
    }

    // Конструктор по умолчанию
    public Laptop() {
        this(0);
    }
}
