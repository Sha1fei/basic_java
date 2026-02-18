package app_06_functions;

/**
 * Демонстрация функций (методов) в Java
 *
 * Метод — это именованный блок кода, который можно вызывать.
 * Синтаксис объявления: [модификаторы] тип_возврата имя_метода(параметры) { тело }
 *
 * Этот класс показывает примеры:
 * - Методов с возвращаемым значением
 * - Методов без возвращаемого значения (void)
 * - Параметров и аргументов
 * - Перегрузки методов (overloading)
 * - Рекурсивных вызовов
 */
public class Functions {
    /**
     * Точка входа в программу
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ФУНКЦИЙ (МЕТОДОВ) В JAVA ===\n");

        // Вызов метода add и вывод результата
        int sum = add(1, 2);
        System.out.println("add(1, 2) = " + sum);

        // Метод можно вызывать прямо в выражении
        System.out.println("add(10, 20) = " + add(10, 20));

        // Вызов void-метода (ничего не возвращает)
        greet("Пользователь");

        // Вызов перегруженных методов
        System.out.println("multiply(3, 4) = " + multiply(3, 4));
        System.out.println("multiply(2.5, 4.0) = " + multiply(2.5, 4.0));

        // Вызов метода с переменным числом аргументов (varargs)
        System.out.println("sum(1, 2, 3) = " + sum(1, 2, 3));
        System.out.println("sum(1, 2, 3, 4, 5) = " + sum(1, 2, 3, 4, 5));

        // Рекурсивный вызов
        System.out.println("factorial(5) = " + factorial(5));

        // Метод с разными типами параметров
        printInfo("Java", 17);
    }

    /**
     * Метод с возвращаемым значением.
     * Синтаксис: [модификаторы] return_type nameVerb(параметры) { body }
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Метод без возвращаемого значения (void).
     * Используется для выполнения действий без результата.
     *
     * @param name имя для приветствия
     */
    public static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /**
     * Перегрузка метода (overloading): несколько методов с одним именем,
     * но разными типами или количеством параметров.
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Перегруженная версия multiply для типа double.
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Varargs — переменное число аргументов одного типа.
     * Внутри метода numbers ведёт себя как массив int[].
     *
     * @param numbers произвольное количество целых чисел
     * @return сумма всех переданных чисел
     */
    public static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    /**
     * Рекурсивный метод: метод вызывает сам себя с изменёнными аргументами.
     * Обязательно должно быть условие выхода (базовый случай).
     *
     * @param n неотрицательное целое
     * @return n! (факториал)
     */
    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // базовый случай: выход из рекурсии
        }
        return n * factorial(n - 1);
    }

    /**
     * Метод с несколькими параметрами разных типов.
     *
     * @param language название языка
     * @param version  версия (число)
     */
    public static void printInfo(String language, int version) {
        System.out.println("\nЯзык: " + language + ", версия: " + version);
    }
}
