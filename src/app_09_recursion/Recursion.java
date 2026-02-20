package app_09_recursion;

/**
 * Демонстрация рекурсии в Java
 *
 * Рекурсия — вызов методом самого себя с изменёнными аргументами.
 * Обязательно должно быть базовое условие (условие выхода), иначе — бесконечная рекурсия и StackOverflowError.
 *
 * Этот класс показывает:
 * - Факториал (классический пример)
 * - Числа Фибоначчи
 * - Сумма чисел от 1 до n
 * - Степень числа
 * - Рекурсивный вывод последовательности
 * - Хвостовая рекурсия и ограничения JVM
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ РЕКУРСИИ ===\n");

        // ============================================
        // ФАКТОРИАЛ
        // ============================================
        System.out.println("--- Факториал ---");
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("factorial(0) = " + factorial(0));
        System.out.println();

        // ============================================
        // ЧИСЛА ФИБОНАЧЧИ
        // ============================================
        System.out.println("--- Числа Фибоначчи (n-й член: F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2)) ---");
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\n");

        // ============================================
        // СУММА 1 + 2 + ... + n
        // ============================================
        System.out.println("--- Сумма от 1 до n ---");
        System.out.println("sumToN(5) = " + sumToN(5));
        System.out.println();

        // ============================================
        // СТЕПЕНЬ ЧИСЛА (a^b при b >= 0)
        // ============================================
        System.out.println("--- Степень числа ---");
        System.out.println("power(2, 10) = " + power(2, 10));
        System.out.println();

        // ============================================
        // РЕКУРСИВНЫЙ ВЫВОД (от n до 1 и от 1 до n)
        // ============================================
        System.out.println("--- Рекурсивный вывод: от 5 до 1 ---");
        printDown(5);
        System.out.println("\n--- Рекурсивный вывод: от 1 до 5 ---");
        printUp(1, 5);
        System.out.println();

        // ============================================
        // ХВОСТОВАЯ РЕКУРСИЯ
        // ============================================
        // Хвостовая рекурсия — когда рекурсивный вызов является последним действием метода
        // (после него не выполняется никаких операций с результатом).
        System.out.println("--- Хвостовая рекурсия ---");
        System.out.println("factorialTail(5) = " + factorialTail(5));
        System.out.println("sumToNTail(5) = " + sumToNTail(5));
        System.out.println("  В Java JVM не оптимизирует хвостовую рекурсию (нет TCO), поэтому глубокая рекурсия всё равно может привести к StackOverflowError. Для длинных вычислений лучше использовать цикл.");
    }

    /**
     * Факториал: n! = n * (n-1) * ... * 1. По определению 0! = 1.
     * Базовый случай: x <= 1 → return 1.
     */
    public static long factorial(int x) {
        if (x <= 1) {
            return 1;
        }
        return (long) x * factorial(x - 1);
    }

    /**
     * n-е число Фибоначчи (рекурсия без кэша — много повторных вызовов, для больших n медленно).
     */
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Сумма целых чисел от 1 до n включительно.
     */
    public static int sumToN(int n) {
        if (n <= 0) return 0;
        return n + sumToN(n - 1);
    }

    /**
     * Степень: a^b (b >= 0). Базовый случай: b == 0 → 1.
     */
    public static long power(int a, int b) {
        if (b == 0) return 1;
        return (long) a * power(a, b - 1);
    }

    /**
     * Вывести числа от n до 1 (печать до рекурсивного вызова — сначала текущее, потом «вниз»).
     */
    public static void printDown(int n) {
        if (n <= 0) return;
        System.out.print(n + " ");
        printDown(n - 1);
    }

    /**
     * Вывести числа от current до max включительно (печать после рекурсивного вызова — сначала «вглубь», потом печать).
     */
    public static void printUp(int current, int max) {
        if (current > max) return;
        printUp(current + 1, max);
        System.out.print(current + " ");
    }

    // ---------- Хвостовая рекурсия ----------

    /**
     * Факториал в виде хвостовой рекурсии.
     * Результат накапливается в параметре acc; рекурсивный вызов — последняя операция, после него ничего не выполняется.
     * Не хвостовая версия: return x * factorial(x - 1) — после вызова идёт умножение.
     */
    public static long factorialTail(int n, long acc) {
        if (n <= 1) return acc;
        return factorialTail(n - 1, n * acc);
    }

    /** Удобная обёртка: factorialTail(5) == factorialTail(5, 1). */
    public static long factorialTail(int n) {
        return factorialTail(n, 1);
    }

    /**
     * Сумма 1..n в виде хвостовой рекурсии (накопление в acc).
     */
    public static int sumToNTail(int n, int acc) {
        if (n <= 0) return acc;
        return sumToNTail(n - 1, n + acc);
    }

    public static int sumToNTail(int n) {
        return sumToNTail(n, 0);
    }
}
