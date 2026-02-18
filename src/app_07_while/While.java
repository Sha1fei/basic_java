package app_07_while;

/**
 * Демонстрация циклов while и do-while в Java
 *
 * while — проверяет условие до выполнения тела; если условие false с самого начала, тело не выполнится ни разу.
 * do-while — сначала выполняет тело, потом проверяет условие; тело выполнится минимум один раз.
 *
 * Этот класс показывает:
 * - Цикл while
 * - Цикл do-while (отличие от while)
 * - break и continue
 * - Типичные ошибки (бесконечный цикл)
 */
public class While {
    /**
     * Точка входа в программу
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ЦИКЛОВ WHILE И DO-WHILE ===\n");

        // ============================================
        // ЦИКЛ WHILE
        // ============================================
        System.out.println("--- ЦИКЛ WHILE ---");
        System.out.println("Синтаксис: while (условие) { тело }");
        System.out.println("Условие проверяется ДО выполнения тела. Если false — тело не выполнится.\n");

        int countWhile = 0;
        while (countWhile < 3) {
            System.out.println("  countWhile = " + countWhile);
            countWhile += 1;  // не забывать изменять переменную, иначе цикл станет бесконечным
        }
        System.out.println("После цикла: countWhile = " + countWhile + "\n");

        // ============================================
        // ЦИКЛ DO-WHILE
        // ============================================
        System.out.println("--- ЦИКЛ DO-WHILE ---");
        System.out.println("Синтаксис: do { тело } while (условие);");
        System.out.println("Тело выполняется минимум один раз, затем проверяется условие.\n");

        int countDoWhile = 0;
        do {
            System.out.println("  countDoWhile = " + countDoWhile);
            countDoWhile += 1;
        } while (countDoWhile < 3);
        System.out.println("После цикла: countDoWhile = " + countDoWhile + "\n");

        // Do-while: тело выполнится хотя бы один раз, даже если условие сразу false
        System.out.println("--- DO-WHILE: выполнение минимум один раз ---");
        int x = 10;
        do {
            System.out.println("  x = " + x + " (условие x < 5 уже false, но тело выполнилось один раз)");
            x++;
        } while (x < 5);
        System.out.println();

        // ============================================
        // BREAK — выход из цикла
        // ============================================
        System.out.println("--- BREAK: досрочный выход из цикла ---");
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                System.out.println("  Достигнуто i = 5, выходим из цикла (break)");
                break;
            }
            System.out.println("  i = " + i);
            i++;
        }
        System.out.println();

        // ============================================
        // CONTINUE — переход к следующей итерации
        // ============================================
        System.out.println("--- CONTINUE: пропуск итерации ---");
        int j = 0;
        while (j < 6) {
            j++;
            if (j % 2 == 0) {
                continue;  // пропускаем чётные числа
            }
            System.out.println("  Нечётное: j = " + j);
        }
        System.out.println();

        // ============================================
        // ПРАКТИЧЕСКИЙ ПРИМЕР: поиск в строке
        // ============================================
        System.out.println("--- ПРАКТИЧЕСКИЙ ПРИМЕР: поиск символа ---");
        String text = "Привет, Java!";
        int index = 0;
        char target = 'в';  // буква «в» есть в слове «Привет»
        while (index < text.length()) {
            if (text.charAt(index) == target) {
                System.out.println("  Символ '" + target + "' найден на позиции " + index);
                break;
            }
            index++;
        }
        if (index == text.length()) {
            System.out.println("  Символ не найден");
        }
        System.out.println();

        // ============================================
        // ПРАКТИЧЕСКИЙ ПРИМЕР: сумма до условия
        // ============================================
        System.out.println("--- ПРАКТИЧЕСКИЙ ПРИМЕР: сумма чисел 1 + 2 + ... + n ---");
        int n = 5;
        int sum = 0;
        int k = 1;
        while (k <= n) {
            sum += k;
            k++;
        }
        System.out.println("  Сумма от 1 до " + n + " = " + sum);
        System.out.println();

        // ============================================
        // ВЛОЖЕННЫЕ ЦИКЛЫ (краткий пример)
        // ============================================
        System.out.println("--- ВЛОЖЕННЫЕ ЦИКЛЫ ---");
        int row = 0;
        while (row < 2) {
            int col = 0;
            while (col < 3) {
                System.out.print("  [" + row + "," + col + "]");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
