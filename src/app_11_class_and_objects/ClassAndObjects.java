package app_11_class_and_objects;

/**
 * Демонстрация классов и объектов в Java
 *
 * Класс — шаблон (описание полей и методов). Объект — экземпляр класса, создаётся через new.
 * Один класс может иметь много объектов с разными значениями полей.
 *
 * Этот класс показывает:
 * - Создание объекта (new)
 * - Обращение к полям и методам объекта
 * - Несколько экземпляров одного класса
 * - Передачу объекта в метод
 * - Ссылочную природу объектов (null, две ссылки на один объект)
 */
public class ClassAndObjects {

    public static void main(String[] args) {
        System.out.println("=== КЛАССЫ И ОБЪЕКТЫ ===\n");

        // ============================================
        // СОЗДАНИЕ ОБЪЕКТА И ОБРАЩЕНИЕ К ПОЛЯМ/МЕТОДАМ
        // ============================================
        System.out.println("--- Создание объекта Computer ---");
        Computer computer = new Computer();
        System.out.println("computer.ram = " + computer.ram);
        System.out.println("computer.ssd = " + computer.ssd);
        computer.load();
        System.out.println();

        // ============================================
        // НЕСКОЛЬКО ОБЪЕКТОВ ОДНОГО КЛАССА
        // ============================================
        System.out.println("--- Несколько экземпляров ---");
        Computer laptop = new Computer(2048, 256);
        Computer desktop = new Computer(8192, 1000);
        System.out.println("Ноутбук: RAM=" + laptop.ram + ", SSD=" + laptop.ssd);
        System.out.println("Десктоп: RAM=" + desktop.ram + ", SSD=" + desktop.ssd);
        laptop.load();
        desktop.load();
        System.out.println();

        // ============================================
        // ПЕРЕДАЧА ОБЪЕКТА В МЕТОД
        // ============================================
        System.out.println("--- Передача объекта в метод ---");
        printComputerInfo(computer);
        System.out.println();

        // ============================================
        // ССЫЛКИ: ДВЕ ПЕРЕМЕННЫЕ — ОДИН ОБЪЕКТ
        // ============================================
        System.out.println("--- Ссылки на один объект ---");
        Computer same = computer;
        same.ram = 2048;
        System.out.println("Изменили same.ram; computer.ram = " + computer.ram);
        System.out.println();

        // ============================================
        // NULL — ОТСУТСТВИЕ ОБЪЕКТА
        // ============================================
        System.out.println("--- null ---");
        Computer empty = null;
        if (empty == null) {
            System.out.println("empty не указывает на объект (null)");
        }
        // empty.load(); // вызов приведёт к NullPointerException
        System.out.println();

    }

    /** Метод принимает объект типа Computer и выводит его поля. */
    static void printComputerInfo(Computer c) {
        if (c == null) {
            System.out.println("Компьютер не задан (null)");
            return;
        }
        System.out.println("RAM=" + c.ram + ", SSD=" + c.ssd);
    }
}

/**
 * Простой класс «Компьютер»: поля (состояние) и метод (поведение).
 * Конструктор по умолчанию и с параметрами.
 */
class Computer {
    int ram;
    int ssd;

    /** Конструктор по умолчанию: значения по умолчанию для полей. */
    Computer() {
        this.ram = 1024;
        this.ssd = 500;
    }

    /** Конструктор с параметрами: задаём RAM и SSD при создании. */
    Computer(int ram, int ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    /** Метод экземпляра: вызывается у конкретного объекта. */
    void load() {
        System.out.println("Computer loaded (RAM=" + ram + ", SSD=" + ssd + ")");
    }
}
