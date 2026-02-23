package app_17_static;

/**
 * Демонстрация модификатора static в Java.
 * <p>
 * static — член принадлежит классу, а не экземпляру. Один на весь класс, общий для всех объектов.
 * Статический метод вызывается через имя класса (Test.showSeconds()), статическое поле — тоже.
 * В статических методах нельзя использовать this и обращаться к нестатическим полям/методам без объекта.
 */
public class Static {

    public static void main(String[] args) {
        System.out.println("=== СТАТИЧЕСКИЕ ЧЛЕНЫ ===\n");

        // Вызов статического метода без создания объекта
        Test.showSeconds();

        // Статическое поле одно на весь класс — у всех экземпляров одно и то же значение
        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println("Test.TEST_SECONDS = " + Test.TEST_SECONDS);
        System.out.println("test1.TEST_SECONDS == test2.TEST_SECONDS: " + (test1.TEST_SECONDS == test2.TEST_SECONDS));

        // Счётчик экземпляров (статическое поле)
        System.out.println("Создано экземпляров Test: " + Test.getCount());

        // Статический метод с параметром
        System.out.println("Удвоенное значение: " + Test.doubleValue(50));

        Class<? extends Test> clazz = test1.getClass();
        System.out.println("Класс объекта: " + clazz.getName());
    }
}

/**
 * Класс со статическими полем, методом и счётчиком экземпляров.
 */
class Test {
    /** Статическая константа: одна на класс, имя в UPPER_SNAKE_CASE. */
    public static int TEST_SECONDS = 100;

    /** Статический счётчик созданных экземпляров (увеличивается в конструкторе). */
    private static int count = 0;

    public Test() {
        count++;
    }

    /** Статический метод: вызывается через класс, без объекта. */
    public static void showSeconds() {
        System.out.println("showSeconds(): " + TEST_SECONDS);
    }

    /** Статический метод с параметром. */
    public static int doubleValue(int x) {
        return x * 2;
    }

    public static int getCount() {
        return count;
    }
}
