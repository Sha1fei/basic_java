package app_12_constructors;

/**
 * Демонстрация конструкторов в Java
 *
 * Конструктор — специальный метод, вызываемый при создании объекта (new).
 * Имя совпадает с именем класса, возвращаемого типа нет.
 * Если конструктор не написан, компилятор добавляет конструктор по умолчанию без параметров.
 *
 * Этот класс показывает:
 * - Конструктор по умолчанию (без параметров)
 * - Конструктор с одним и с двумя параметрами
 * - Вызов другого конструктора через this(...)
 * - Перегрузку конструкторов
 */
public class Constructors {

    public static void main(String[] args) {
        System.out.println("=== КОНСТРУКТОРЫ ===\n");

        // Конструктор без параметров — поля получают значения по умолчанию (0 для int)
        Home home = new Home();
        System.out.println("home: windows=" + home.windows + ", doors=" + home.doors + "\n");

        // Конструктор с одним параметром (doors задаётся по умолчанию через this)
        Home home1 = new Home(3);
        System.out.println("home1: windows=" + home1.windows + ", doors=" + home1.doors + "\n");

        // Конструктор с двумя параметрами
        Home home2 = new Home(5, 2);
        System.out.println("home2: windows=" + home2.windows + ", doors=" + home2.doors + "\n");
    }
}

/**
 * Класс «Дом» с полями windows и doors.
 * Три конструктора: без параметров, с одним параметром (окна), с двумя (окна и двери).
 */
class Home {

    int windows;
    int doors;

    /** Конструктор с двумя параметрами — полная инициализация. */
    Home(int windows, int doors) {
        System.out.println("Конструктор с окнами и дверями");
        this.windows = windows;
        this.doors = doors;
    }

    /**
     * Конструктор с одним параметром (окна).
     * Делегирует вызов конструктору с двумя параметрами, подставляя doors = 1.
     * this(...) должен быть первой строкой конструктора.
     */
    Home(int windows) {
        this(windows, 1);
        System.out.println("Конструктор только с окнами (двери = 1)");
    }

    /** Конструктор по умолчанию — без параметров. Поля останутся 0, если не задать. */
    Home() {
        System.out.println("Конструктор без параметров");
        this.windows = 0;
        this.doors = 0;
    }
}
