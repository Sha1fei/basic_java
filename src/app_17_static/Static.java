package app_17_static;

/**
 * Демонстрация модификатора static в Java.
 * <p>
 * static — член принадлежит классу, а не экземпляру: один на весь класс, общий для всех объектов.
 * Статический метод вызывается через имя класса (Test.showSeconds()), статическое поле — тоже.
 * В статических методах нельзя использовать this и обращаться к нестатическим полям/методам без объекта.
 * Типичное использование: main, константы, утилитные методы, счётчики, фабрики.
 */
public class Static {

    public static void main(String[] args) {
        System.out.println("=== СТАТИЧЕСКИЕ ЧЛЕНЫ ===\n");

        // Вызов статического метода без создания объекта (типично для утилит)
        Test.showSeconds();

        // Статическое поле одно на весь класс — у всех экземпляров одно и то же значение
        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println("Test.TEST_SECONDS = " + Test.TEST_SECONDS);
        System.out.println("test1 и test2 — один класс, одно статическое поле: " + test1.getClass().equals(test2.getClass()));

        // Счётчик экземпляров: статическое поле обновляется в конструкторе (создали 2 — count = 2)
        System.out.println("Создано экземпляров Test: " + Test.getCount());

        // Статический метод с параметром — как утилитная функция
        System.out.println("Удвоенное значение: " + Test.doubleValue(50));
    }
}

/**
 * Класс со статическими полем, методом и счётчиком экземпляров.
 * Показывает: статическую константу, статический счётчик, статические методы.
 */
class Test {
    /** Статическая константа: одна на класс, имя в UPPER_SNAKE_CASE. */
    public static int TEST_SECONDS = 100;

    /** Статический счётчик созданных экземпляров (увеличивается в конструкторе). */
    private static int count = 0;

    /** При создании каждого экземпляра общий счётчик count увеличивается на 1. */
    public Test() {
        count++;
    }

    /** Статический метод: вызывается через класс (Test.showSeconds()), без объекта. */
    public static void showSeconds() {
        System.out.println("showSeconds(): " + TEST_SECONDS);
    }

    /** Статический метод с параметром — пример утилитной функции. */
    public static int doubleValue(int x) {
        return x * 2;
    }

    /** Возвращает количество созданных экземпляров Test. */
    public static int getCount() {
        return count;
    }
}
