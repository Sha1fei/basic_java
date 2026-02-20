package app_10_arrays;

/**
 * Демонстрация массивов в Java
 *
 * Массив — объект фиксированной длины, хранящий элементы одного типа.
 * Индексация с нуля. Длина задаётся при создании и не меняется.
 *
 * Этот класс показывает:
 * - Создание одномерных и многомерных массивов
 * - Инициализация при объявлении и через new
 * - Свойство length, перебор for и for-each
 * - Копирование, сортировка, заполнение (java.util.Arrays)
 * - Двумерные (зубчатые) массивы
 */
public class Arrays {

    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ МАССИВОВ В JAVA ===\n");

        // ============================================
        // СОЗДАНИЕ ОДНОМЕРНОГО МАССИВА
        // ============================================
        System.out.println("--- Создание одномерного массива ---");

        // new тип[размер] — все элементы по умолчанию (для int — 0)
        int[] a_1 = new int[10];
        a_1[0] = 1;
        System.out.println("a_1[0]: " + a_1[0]);
        System.out.println("a_1.length: " + a_1.length);

        // Инициализация списком значений (длина определяется автоматически)
        int[] a_2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("a_2[2]: " + a_2[2]);
        System.out.println("a_2.length: " + a_2.length);
        System.out.println();

        // ============================================
        // ПЕРЕБОР МАССИВА
        // ============================================
        System.out.println("--- Перебор: for-each и for по индексу ---");
        System.out.print("for-each: ");
        for (int item : a_2) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("for (индекс): ");
        for (int i = 0; i < a_2.length; i++) {
            System.out.print(a_2[i] + " ");
        }
        System.out.println("\n");

        // ============================================
        // КЛАСС java.util.Arrays
        // ============================================
        System.out.println("--- Методы java.util.Arrays ---");
        System.out.println("Arrays.toString(a_2): " + java.util.Arrays.toString(a_2));

        int[] copy = java.util.Arrays.copyOf(a_2, a_2.length);
        System.out.println("Копия: " + java.util.Arrays.toString(copy));

        int[] forSort = {30, 10, 50, 20, 40};
        java.util.Arrays.sort(forSort);
        System.out.println("После sort: " + java.util.Arrays.toString(forSort));

        int[] filled = new int[5];
        java.util.Arrays.fill(filled, 7);
        System.out.println("После fill(7): " + java.util.Arrays.toString(filled));

        int key = 20;
        int pos = java.util.Arrays.binarySearch(forSort, key);
        System.out.println("binarySearch(" + key + ") = " + pos + " (индекс в отсортированном массиве)");
        System.out.println();

        // ============================================
        // ДВУМЕРНЫЙ (ЗУБЧАТЫЙ) МАССИВ
        // ============================================
        System.out.println("--- Двумерный массив ---");
        // Каждая строка может быть своей длины; строки могут быть null
        int[][] a_3 = {{1, 2}, null, new int[4], {7, 8}};
        System.out.println("a_3[0] = " + java.util.Arrays.toString(a_3[0]));
        System.out.println("a_3[1] = " + a_3[1]);
        System.out.println("a_3[2] = " + java.util.Arrays.toString(a_3[2]));
        System.out.println("a_3[3][1] = " + a_3[3][1]);

        System.out.println("\nПеребор двумерного массива:");
        for (int row = 0; row < a_3.length; row++) {
            if (a_3[row] == null) {
                System.out.println("  Строка " + row + ": null");
                continue;
            }
            System.out.print("  Строка " + row + ": ");
            for (int col = 0; col < a_3[row].length; col++) {
                System.out.print(a_3[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ============================================
        // МАССИВ СТРОК И ССЫЛОЧНЫЕ ТИПЫ
        // ============================================
        System.out.println("--- Массив строк ---");
        String[] words = {"Java", "Python", "C++"};
        for (String w : words) {
            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println("Arrays.toString(words): " + java.util.Arrays.toString(words));
        System.out.println();

        // ============================================
        // ГРАНИЦЫ И ОШИБКИ
        // ============================================
        System.out.println("--- Длина и индексы ---");
        System.out.println("Допустимые индексы для a_2: от 0 до " + (a_2.length - 1));
        System.out.println("Обращение к a_2[a_2.length] или a_2[-1] вызовет ArrayIndexOutOfBoundsException.");
    }
}
