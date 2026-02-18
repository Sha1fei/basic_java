package app_08_for;

/**
 * Демонстрация цикла for в Java
 *
 * Цикл for используется, когда известно количество итераций или нужно перебрать диапазон.
 * Синтаксис: for (инициализация; условие; обновление) { тело }
 *
 * Этот класс показывает:
 * - Классический цикл for
 * - Улучшенный for (for-each) для массивов и коллекций
 * - Вложенные циклы for
 * - break и continue внутри for
 * - Перебор строки по символам
 */
public class For {
    /**
     * Точка входа в программу
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ЦИКЛА FOR ===\n");

        // ============================================
        // КЛАССИЧЕСКИЙ ЦИКЛ FOR
        // ============================================
        System.out.println("--- КЛАССИЧЕСКИЙ FOR ---");
        System.out.println("Синтаксис: for (инициализация; условие; обновление) { тело }\n");

        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                continue;  // пропускаем последнюю итерацию (не выводим 3)
            }
            System.out.println("  i = " + i);
        }
        System.out.println();

        // ============================================
        // FOR-EACH (улучшенный for)
        // ============================================
        System.out.println("--- FOR-EACH: перебор элементов ---");
        System.out.println("Синтаксис: for (тип элемент : массив или коллекция) { тело }\n");

        String str = "Test";
        for (char c : str.toCharArray()) {
            System.out.print(c + "  ");
        }
        System.out.println("\n");

        // For-each по массиву
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Элементы массива:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // ============================================
        // FOR С НЕСКОЛЬКИМИ ПЕРЕМЕННЫМИ
        // ============================================
        System.out.println("--- FOR: несколько переменных ---");
        for (int a = 0, b = 10; a < b; a++, b--) {
            System.out.println("  a = " + a + ", b = " + b);
        }
        System.out.println();

        // ============================================
        // BREAK — досрочный выход из цикла
        // ============================================
        System.out.println("--- BREAK: выход при условии ---");
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("  Достигнуто j = 5, выходим (break)");
                break;
            }
            System.out.println("  j = " + j);
        }
        System.out.println();

        // ============================================
        // ВЛОЖЕННЫЕ ЦИКЛЫ FOR
        // ============================================
        System.out.println("--- ВЛОЖЕННЫЕ ЦИКЛЫ: таблица умножения (фрагмент) ---");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.printf("  %2d ", row * col);
            }
            System.out.println();
        }
        System.out.println();

        // ============================================
        // ПРАКТИЧЕСКИЙ ПРИМЕР: сумма и произведение
        // ============================================
        System.out.println("--- ПРАКТИЧЕСКИЙ ПРИМЕР: сумма 1..n ---");
        int n = 5;
        int sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k;
        }
        System.out.println("  Сумма от 1 до " + n + " = " + sum);

        System.out.println("\n--- Факториал ---");
        int factN = 5;
        long factorial = 1;
        for (int f = 1; f <= factN; f++) {
            factorial *= f;
        }
        System.out.println("  " + factN + "! = " + factorial);
        System.out.println();

        // ============================================
        // ОБРАТНЫЙ ПЕРЕБОР (от большего к меньшему)
        // ============================================
        System.out.println("--- ОБРАТНЫЙ ПЕРЕБОР ---");
        for (int r = 5; r >= 1; r--) {
            System.out.print(r + " ");
        }
        System.out.println("\n");

        // ============================================
        // ПЕРЕБОР С ШАГОМ
        // ============================================
        System.out.println("--- ПЕРЕБОР С ШАГОМ (каждое второе число) ---");
        for (int s = 0; s <= 10; s += 2) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
