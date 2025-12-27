package app_01_primitive_data_types;

/**
 * Демонстрация примитивных типов данных в Java
 * 
 * Этот класс показывает основные примитивные типы данных:
 * - Целочисленные типы (byte, short, int, long)
 * - Типы с плавающей точкой (double, float)
 * - Символьный тип (char)
 * - Логический тип (boolean)
 * 
 * Примитивные типы хранятся в стеке и имеют фиксированный размер в памяти.
 * Они не являются объектами и не имеют методов.
 */
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ПРИМИТИВНЫХ ТИПОВ ДАННЫХ В JAVA ===\n");
        
        // ============================================
        // ЦЕЛОЧИСЛЕННЫЕ ТИПЫ ДАННЫХ
        // ============================================
        
        System.out.println("--- ЦЕЛОЧИСЛЕННЫЕ ТИПЫ ---");
        
        // byte: 8 бит (1 байт)
        // Диапазон: от -128 до 127
        // Использование: экономия памяти при работе с небольшими числами
        // (например, данные из файлов, сетевые протоколы)
        byte a_1 = 15;
        System.out.println("byte a_1 = " + a_1);
        System.out.println("  Размер: 8 бит (1 байт)");
        System.out.println("  Диапазон: от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("  Пример использования: обработка байтовых данных\n");
        
        // short: 16 бит (2 байта)
        // Диапазон: от -32,768 до 32,767
        // Использование: редко используется, в основном для совместимости
        short a_2 = 15;
        System.out.println("short a_2 = " + a_2);
        System.out.println("  Размер: 16 бит (2 байта)");
        System.out.println("  Диапазон: от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("  Пример использования: старые API, экономия памяти\n");
        
        // int: 32 бита (4 байта)
        // Диапазон: от -2,147,483,648 до 2,147,483,647
        // Использование: наиболее часто используемый целочисленный тип
        // По умолчанию все целочисленные литералы имеют тип int
        int a_3 = 15;
        System.out.println("int a_3 = " + a_3);
        System.out.println("  Размер: 32 бита (4 байта)");
        System.out.println("  Диапазон: от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("  Пример использования: счетчики, индексы, математические операции\n");
        
        // long: 64 бита (8 байт)
        // Диапазон: от -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807
        // Использование: большие числа (временные метки, ID, большие вычисления)
        // Суффикс 'L' или 'l' указывает, что это литерал типа long
        long a_4 = 15L;
        System.out.println("long a_4 = " + a_4);
        System.out.println("  Размер: 64 бита (8 байт)");
        System.out.println("  Диапазон: от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("  Пример использования: временные метки (timestamp), большие числа");
        System.out.println("  Литералы: 15L или 15l (рекомендуется использовать 'L')\n");

        // ============================================
        // ТИПЫ С ПЛАВАЮЩЕЙ ТОЧКОЙ (ДРОБНЫЕ ЧИСЛА)
        // ============================================
        
        System.out.println("--- ТИПЫ С ПЛАВАЮЩЕЙ ТОЧКОЙ ---");
        
        // float: 32 бита (4 байта)
        // Точность: около 7 десятичных знаков
        // Диапазон: примерно от 1.4e-45 до 3.4e+38
        // Использование: экономия памяти, когда не требуется высокая точность
        // Суффикс 'F' или 'f' обязателен для литералов типа float
        float b_2 = 15.3F;
        System.out.println("float b_2 = " + b_2);
        System.out.println("  Размер: 32 бита (4 байта)");
        System.out.println("  Точность: ~7 десятичных знаков");
        System.out.println("  Диапазон: от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println("  Пример использования: графические вычисления, игры");
        System.out.println("  Литералы: 15.3F или 15.3f (обязательно!)\n");
        
        // double: 64 бита (8 байт)
        // Точность: около 15-17 десятичных знаков
        // Диапазон: примерно от 4.9e-324 до 1.7e+308
        // Использование: стандартный тип для дробных чисел (рекомендуется)
        // По умолчанию все дробные литералы имеют тип double
        double b_1 = 14.2;
        System.out.println("double b_1 = " + b_1);
        System.out.println("  Размер: 64 бита (8 байт)");
        System.out.println("  Точность: ~15-17 десятичных знаков");
        System.out.println("  Диапазон: от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
        System.out.println("  Пример использования: научные вычисления, финансы, точные расчеты");
        System.out.println("  Литералы: 14.2 или 14.2D (D необязателен)\n");

        // ============================================
        // СИМВОЛЬНЫЙ ТИП
        // ============================================
        
        System.out.println("--- СИМВОЛЬНЫЙ ТИП ---");
        
        // char: 16 бит (2 байта)
        // Хранит один символ Unicode (не ASCII!)
        // Диапазон: от '\u0000' (0) до '\uffff' (65,535)
        // Использование: символы, строки (внутри String)
        // Литералы: одинарные кавычки для одного символа
        char c_1 = 't';
        System.out.println("char c_1 = '" + c_1 + "'");
        System.out.println("  Размер: 16 бит (2 байта)");
        System.out.println("  Диапазон: от \\u0000 (0) до \\uffff (65,535)");
        System.out.println("  Кодировка: Unicode (UTF-16)");
        System.out.println("  Примеры инициализации:");
        System.out.println("    char c1 = 'A';           // Символ");
        System.out.println("    char c2 = 65;            // Числовое значение (ASCII)");
        System.out.println("    char c3 = '\\u0041';     // Unicode escape-последовательность");
        System.out.println("    char c4 = '\\n';          // Управляющий символ (новая строка)");
        System.out.println("  Важно: char - это НЕ строка! Для строк используется String\n");

        // ============================================
        // ЛОГИЧЕСКИЙ ТИП
        // ============================================
        
        System.out.println("--- ЛОГИЧЕСКИЙ ТИП ---");
        
        // boolean: размер не определен в спецификации (обычно 1 байт)
        // Может быть только true или false
        // В Java НЕТ преобразования между boolean и числами (в отличие от C/C++)
        // Использование: условия, флаги, логические операции
        boolean d_1 = false;
        System.out.println("boolean d_1 = " + d_1);
        System.out.println("  Размер: не определен (обычно 1 байт)");
        System.out.println("  Значения: только true или false");
        System.out.println("  Особенности:");
        System.out.println("    - Нет преобразования в числа (нельзя: if (1))");
        System.out.println("    - Нет преобразования из чисел (нельзя: if (x))");
        System.out.println("    - Используется в условиях: if (d_1) { ... }");
        System.out.println("    - Логические операции: && (И), || (ИЛИ), ! (НЕ)");
        System.out.println("  Примеры:");
        boolean isActive = true;
        boolean isCompleted = false;
        System.out.println("    boolean isActive = " + isActive + ";");
        System.out.println("    boolean isCompleted = " + isCompleted + ";");
        System.out.println("    boolean result = isActive && !isCompleted; // " + (isActive && !isCompleted) + "\n");

        // ============================================
        // ДОПОЛНИТЕЛЬНАЯ ИНФОРМАЦИЯ
        // ============================================
        
        System.out.println("--- ДОПОЛНИТЕЛЬНАЯ ИНФОРМАЦИЯ ---");
        System.out.println("1. Примитивные типы хранятся в стеке (stack), а не в куче (heap)");
        System.out.println("2. Примитивные типы имеют значения по умолчанию:");
        System.out.println("   - Числовые типы: 0");
        System.out.println("   - char: '\\u0000'");
        System.out.println("   - boolean: false");
        System.out.println("3. Автоматическое преобразование типов (расширение):");
        System.out.println("   byte → short → int → long → float → double");
        System.out.println("   char → int (но не наоборот!)");
        System.out.println("4. Явное преобразование (сужение) требует приведения типов:");
        System.out.println("   int x = 100;");
        System.out.println("   byte y = (byte) x; // Явное приведение типа");
        System.out.println("5. Переполнение: при превышении диапазона значение 'переворачивается'");
        System.out.println("   byte max = 127;");
        System.out.println("   max++; // Станет -128 (переполнение!)");
    }
}
