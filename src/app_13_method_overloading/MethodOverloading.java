package app_13_method_overloading;

/**
 * Демонстрация перегрузки методов (method overloading) в Java
 *
 * Перегрузка - несколько методов с одним именем, но разными списками параметров
 * (количество, типы или порядок типов). Компилятор выбирает нужный метод по аргументам вызова.
 * Возвращаемый тип сам по себе не отличает перегрузку: сигнатура = имя + параметры.
 * Два метода не могут отличаться только возвращаемым типом - будет ошибка компиляции.
 *
 * Этот класс показывает:
 * - Перегрузку по количеству параметров (0, 1, 2)
 * - Перегрузку по типам параметров (int vs long)
 * - Перегрузку по порядку параметров (int, long) и (long, int)
 */
public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("=== ПЕРЕГРУЗКА МЕТОДОВ ===\n");

        Home home = new Home();

        // Разные вызовы build() - компилятор выбирает метод по числу и типам аргументов
        System.out.println("build()      -> " + home.build());
        System.out.println("build(1)     -> " + home.build(1));
        System.out.println("build(1, 2L) -> " + home.build(1, 2L));
        System.out.println("build(2L, 1) -> " + home.build(2L, 1));
        System.out.println("build(2L)    -> " + home.build(2L));
    }

}

/**
 * Класс с перегруженным методом build().
 * Разные комбинации параметров вызывают разные версии метода.
 */
class Home {
    int windows;
    long doors;

    /** Без параметров. */
    String build() {
        return "Дом по умолчанию";
    }

    /** Один параметр int - число окон. */
    String build(int windows) {
        return "Дом с " + windows + " окном(ами)";
    }

    /** Два параметра: (int, long). Порядок типов важен для выбора перегрузки. */
    String build(int windows, long doors) {
        return "Дом: окна=" + windows + ", двери=" + doors;
    }

    /** Два параметра: (long, int) - другая сигнатура, чем (int, long). */
    String build(long doors, int windows) {
        return "Дом: двери=" + doors + ", окна=" + windows;
    }

    /** Один параметр long - число дверей. */
    String build(long doors) {
        return "Дом с " + doors + " дверью(ями)";
    }
}
