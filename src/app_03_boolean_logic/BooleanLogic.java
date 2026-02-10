package app_03_boolean_logic;

/**
 * Демонстрация булевой логики и логических операторов в Java
 * 
 * Этот класс показывает примеры использования:
 * - Булевых переменных (boolean)
 * - Операторов сравнения (==, !=, <, >, <=, >=)
 * - Логических операторов (&&, ||, !)
 * - Приоритета операций
 */
public class BooleanLogic {
    /**
     * Главный метод программы
     * 
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ БУЛЕВОЙ ЛОГИКИ В JAVA ===\n");
        
        // ============================================
        // ОПЕРАТОРЫ СРАВНЕНИЯ
        // ============================================
        System.out.println("--- ОПЕРАТОРЫ СРАВНЕНИЯ ---");
        
        // Прямое присваивание булевого значения
        boolean a_1 = true;
        System.out.println("a_1 = true → " + a_1);
        
        // Оператор "меньше" (<): проверяет, меньше ли левое значение правого
        boolean a_2 = 10 < 1;  // false, так как 10 не меньше 1
        System.out.println("a_2 = 10 < 1 → " + a_2);
        
        // Оператор "больше или равно" (>=): проверяет, больше или равно ли левое значение правому
        boolean a_3 = 10 >= 1;  // true, так как 10 больше 1
        System.out.println("a_3 = 10 >= 1 → " + a_3);
        
        // Оператор "не равно" (!=): проверяет, различны ли значения
        boolean a_4 = 10 != 1;  // true, так как 10 не равно 1
        System.out.println("a_4 = 10 != 1 → " + a_4);
        
        // Оператор "равно" (==): проверяет равенство значений
        boolean a_5 = 10 == 1;  // false, так как 10 не равно 1
        System.out.println("a_5 = 10 == 1 → " + a_5);
        
        // Дополнительные операторы сравнения
        boolean a_6 = 10 > 1;   // true, так как 10 больше 1
        System.out.println("a_6 = 10 > 1 → " + a_6);
        
        boolean a_7 = 10 <= 1;  // false, так как 10 не меньше или равно 1
        System.out.println("a_7 = 10 <= 1 → " + a_7);
        
        // ============================================
        // ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
        // ============================================
        System.out.println("\n--- ЛОГИЧЕСКИЕ ОПЕРАТОРЫ ---");
        
        // Логическое И (&&): возвращает true только если оба операнда true
        // Короткое замыкание: если первый операнд false, второй не вычисляется
        boolean b_1 = a_1 && a_2;  // true && false = false
        System.out.println("b_1 = a_1 && a_2 → " + b_1 + " (true && false)");
        
        // Логическое ИЛИ (||): возвращает true если хотя бы один операнд true
        // Короткое замыкание: если первый операнд true, второй не вычисляется
        boolean b_2 = a_1 || a_2;  // true || false = true
        System.out.println("b_2 = a_1 || a_2 → " + b_2 + " (true || false)");
        
        // Логическое НЕ (!): инвертирует значение
        boolean b_3 = !a_1;  // !true = false
        System.out.println("b_3 = !a_1 → " + b_3 + " (!true)");
        
        // ============================================
        // ДОПОЛНИТЕЛЬНЫЕ ПРИМЕРЫ
        // ============================================
        System.out.println("\n--- ДОПОЛНИТЕЛЬНЫЕ ПРИМЕРЫ ---");
        
        // Комбинация операторов
        int num1 = 10;
        int num2 = 5;
        int num3 = 3;
        int num4 = 7;
        
        boolean c_1 = (num1 > num2) && (num3 < num4);  // true && true = true
        System.out.println("c_1 = (10 > 5) && (3 < 7) → " + c_1);
        
        boolean c_2 = (num1 > num2) || (num3 > num4);  // true || false = true
        System.out.println("c_2 = (10 > 5) || (3 > 7) → " + c_2);
        
        boolean c_3 = !(num1 > num2);  // !true = false
        System.out.println("c_3 = !(10 > 5) → " + c_3);
        
        // Сравнение строк (сравнивает ссылки, не содержимое!)
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        boolean d_1 = str1 == str2;  // true (оба указывают на один объект в пуле строк)
        boolean d_2 = str1 == str3;   // false (разные объекты в памяти)
        boolean d_3 = str1.equals(str3);  // true (сравнение содержимого)
        
        System.out.println("\nСравнение строк:");
        System.out.println("str1 == str2 → " + d_1 + " (сравнение ссылок)");
        System.out.println("str1 == str3 → " + d_2 + " (разные объекты)");
        System.out.println("str1.equals(str3) → " + d_3 + " (сравнение содержимого)");
        
        // ============================================
        // ТАБЛИЦА ИСТИННОСТИ
        // ============================================
        System.out.println("\n--- ТАБЛИЦА ИСТИННОСТИ ---");
        
        // Используем переменные для избежания предупреждений о "мертвом коде"
        boolean t1 = true;
        boolean t2 = true;
        boolean f1 = false;
        boolean f2 = false;
        
        System.out.println("Логическое И (&&):");
        System.out.println("  true  && true  = " + (t1 && t2));
        System.out.println("  true  && false = " + (t1 && f1));
        System.out.println("  false && true  = " + (f1 && t1));
        System.out.println("  false && false = " + (f1 && f2));
        
        System.out.println("\nЛогическое ИЛИ (||):");
        System.out.println("  true  || true  = " + (t1 || t2));
        System.out.println("  true  || false = " + (t1 || f1));
        System.out.println("  false || true  = " + (f1 || t1));
        System.out.println("  false || false = " + (f1 || f2));
        
        System.out.println("\nЛогическое НЕ (!):");
        System.out.println("  !true  = " + (!t1));
        System.out.println("  !false = " + (!f1));
    }
}
