package app_04_if_else;

/**
 * Демонстрация условных операторов if-else в Java
 * 
 * Этот класс показывает примеры использования:
 * - Простого оператора if
 * - Конструкции if-else
 * - Конструкции if-else if-else
 * - Тернарного оператора (?:)
 * - Вложенных условий
 * - Сравнения чисел в условиях
 */
public class IfElse {
    /**
     * Главный метод программы
     * 
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ УСЛОВНЫХ ОПЕРАТОРОВ IF-ELSE ===\n");
        
        // ============================================
        // ПРОСТОЙ ОПЕРАТОР IF
        // ============================================
        System.out.println("--- ПРОСТОЙ ОПЕРАТОР IF ---");
        
        boolean a_1 = false;
        System.out.println("a_1 = " + a_1);
        
        // Простой if: выполняется только если условие true
        // Если условие false, код внутри блока не выполняется
        if (a_1) {
            System.out.println("if #1 - Этот код не выполнится, так как a_1 = false");
        }
        
        // Если условие true, код выполнится
        if (!a_1) {
            System.out.println("if #2 - Этот код выполнится, так как !a_1 = true");
        }
        
        // ============================================
        // КОНСТРУКЦИЯ IF-ELSE
        // ============================================
        System.out.println("\n--- КОНСТРУКЦИЯ IF-ELSE ---");
        
        // if-else: выполняется один из двух блоков кода
        // Если условие true - выполняется блок if, иначе - блок else
        if (!a_1) {
            System.out.println("if #2 - Условие !a_1 = true, выполняется блок if");
        } else {
            System.out.println("else #3 - Этот код не выполнится, так как условие true");
        }
        
        // Пример с противоположным условием
        if (a_1) {
            System.out.println("if #4 - Этот код не выполнится");
        } else {
            System.out.println("else #3 - Условие a_1 = false, выполняется блок else");
        }
        
        // ============================================
        // КОНСТРУКЦИЯ IF-ELSE IF-ELSE
        // ============================================
        System.out.println("\n--- КОНСТРУКЦИЯ IF-ELSE IF-ELSE ---");
        
        // if-else if-else: позволяет проверить несколько условий последовательно
        // Выполняется первый блок, для которого условие true
        if (a_1) {
            System.out.println("if #4 - Первое условие не выполнится");
        } else if (!a_1) {
            System.out.println("else if #5 - Второе условие !a_1 = true, выполняется этот блок");
        } else {
            System.out.println("else #6 - Этот код не выполнится, так как одно из условий выше true");
        }
        
        // ============================================
        // ТЕРНАРНЫЙ ОПЕРАТОР (?:)
        // ============================================
        System.out.println("\n--- ТЕРНАРНЫЙ ОПЕРАТОР (?:) ---");
        
        // Тернарный оператор: компактная форма if-else
        // Синтаксис: условие ? значение_если_true : значение_если_false
        String result1 = a_1 ? "ternary #1" : "ternary #2";
        System.out.println("a_1 ? \"ternary #1\" : \"ternary #2\" → " + result1);
        System.out.println("Так как a_1 = false, возвращается значение после двоеточия");
        
        // Тернарный оператор можно использовать напрямую в выводе
        System.out.println(a_1 ? "ternary #1" : "ternary #2");
        
        // ============================================
        // ПРИМЕРЫ С ЧИСЛОВЫМИ СРАВНЕНИЯМИ
        // ============================================
        System.out.println("\n--- ПРИМЕРЫ С ЧИСЛОВЫМИ СРАВНЕНИЯМИ ---");
        
        int number = 15;
        System.out.println("number = " + number);
        
        if (number > 10) {
            System.out.println("Число больше 10");
        }
        
        if (number < 20) {
            System.out.println("Число меньше 20");
        } else {
            System.out.println("Число больше или равно 20");
        }
        
        // Проверка диапазона
        if (number >= 10 && number <= 20) {
            System.out.println("Число находится в диапазоне от 10 до 20");
        }
        
        // Множественные условия
        if (number < 10) {
            System.out.println("Число меньше 10");
        } else if (number < 20) {
            System.out.println("Число от 10 до 19");
        } else if (number < 30) {
            System.out.println("Число от 20 до 29");
        } else {
            System.out.println("Число больше или равно 30");
        }
        
        // ============================================
        // ВЛОЖЕННЫЕ УСЛОВИЯ
        // ============================================
        System.out.println("\n--- ВЛОЖЕННЫЕ УСЛОВИЯ ---");
        
        int x = 10;
        int y = 5;
        System.out.println("x = " + x + ", y = " + y);
        
        if (x > 0) {
            System.out.println("x положительное");
            if (y > 0) {
                System.out.println("  и y тоже положительное");
            } else {
                System.out.println("  но y отрицательное или ноль");
            }
        } else {
            System.out.println("x отрицательное или ноль");
        }
        
        // ============================================
        // ПРИМЕРЫ С ЛОГИЧЕСКИМИ ОПЕРАТОРАМИ
        // ============================================
        System.out.println("\n--- ПРИМЕРЫ С ЛОГИЧЕСКИМИ ОПЕРАТОРАМИ ---");
        
        int age = 25;
        boolean hasLicense = true;
        System.out.println("age = " + age + ", hasLicense = " + hasLicense);
        
        // Использование логического И (&&)
        if (age >= 18 && hasLicense) {
            System.out.println("Можно водить машину");
        } else {
            System.out.println("Нельзя водить машину");
        }
        
        // Использование логического ИЛИ (||)
        if (age < 18 || !hasLicense) {
            System.out.println("Нужны дополнительные условия для вождения");
        }
        
        // ============================================
        // ПРИМЕРЫ С ТЕРНАРНЫМ ОПЕРАТОРОМ
        // ============================================
        System.out.println("\n--- ДОПОЛНИТЕЛЬНЫЕ ПРИМЕРЫ ТЕРНАРНОГО ОПЕРАТОРА ---");
        
        int score = 85;
        String grade = score >= 90 ? "Отлично" : (score >= 80 ? "Хорошо" : "Удовлетворительно");
        System.out.println("score = " + score + " → grade = " + grade);
        
        // Тернарный оператор для присваивания
        int max = (x > y) ? x : y;
        System.out.println("max(" + x + ", " + y + ") = " + max);
        
        // Вложенный тернарный оператор (не рекомендуется для сложной логики)
        String status = (age >= 18) ? "Взрослый" : (age >= 13) ? "Подросток" : "Ребенок";
        System.out.println("age = " + age + " → status = " + status);
        
        // ============================================
        // ПРОВЕРКА НА NULL
        // ============================================
        System.out.println("\n--- ПРОВЕРКА НА NULL ---");
        
        // Демонстрация проверки на null
        // В реальном коде значение может приходить из методов, аргументов и т.д.
        String text = getTextValue(); // Может вернуть null или строку
        
        // Важно проверять на null перед использованием
        if (text != null) {
            System.out.println("Длина строки: " + text.length());
        } else {
            System.out.println("Строка равна null, нельзя вызывать методы");
        }
        
        // Безопасная проверка с использованием тернарного оператора
        String safeText = (text != null) ? text : "Значение по умолчанию";
        System.out.println("Безопасное значение: " + safeText);
        
        // Современный способ (Java 7+): Objects.requireNonNull
        // if (text == null) throw new NullPointerException("text не может быть null");
        
        // ============================================
        // УСЛОВИЯ С МЕТОДАМИ
        // ============================================
        System.out.println("\n--- УСЛОВИЯ С МЕТОДАМИ ---");
        
        String email = "user@example.com";
        System.out.println("email = \"" + email + "\"");
        
        // Использование методов в условиях
        if (email != null && email.contains("@") && email.length() > 5) {
            System.out.println("Email выглядит валидным");
        } else {
            System.out.println("Email невалиден");
        }
        
        // Проверка с помощью методов строки
        String name = "Java";
        if (name != null && !name.isEmpty() && name.startsWith("J")) {
            System.out.println("Имя начинается с 'J': " + name);
        }
        
        // ============================================
        // ПАТТЕРН РАННЕГО ВОЗВРАТА (Early Return)
        // ============================================
        System.out.println("\n--- ПАТТЕРН РАННЕГО ВОЗВРАТА ---");
        
        // Демонстрация паттерна раннего возврата через вложенные условия
        System.out.println("Проверка доступа к системе:");
        boolean isAuthenticated = true;
        boolean hasPermission = true;
        boolean isActive = true;
        
        if (!isAuthenticated) {
            System.out.println("  Ошибка: пользователь не аутентифицирован");
        } else if (!hasPermission) {
            System.out.println("  Ошибка: недостаточно прав");
        } else if (!isActive) {
            System.out.println("  Ошибка: учетная запись неактивна");
        } else {
            System.out.println("  Успех: доступ разрешен");
        }
        
        // ============================================
        // КОРОТКОЕ ЗАМЫКАНИЕ В УСЛОВИЯХ
        // ============================================
        System.out.println("\n--- КОРОТКОЕ ЗАМЫКАНИЕ В УСЛОВИЯХ ---");
        
        // Демонстрация короткого замыкания
        // В реальном коде значение может приходить из разных источников
        String data = getDataValue(); // Может вернуть null или строку
        System.out.println("data = " + data);
        
        // Благодаря короткому замыканию, если первое условие false,
        // второе условие не проверяется (избегаем NullPointerException)
        if (data != null && data.length() > 0) {
            System.out.println("Данные не пустые");
        } else {
            System.out.println("Данные пустые или null (безопасная проверка)");
        }
        
        // Важно: порядок условий имеет значение!
        // Неправильно: if (data.length() > 0 && data != null) - вызовет NullPointerException
        // Правильно: if (data != null && data.length() > 0) - безопасно
        
        // ============================================
        // ПРИМЕРЫ С МАТЕМАТИЧЕСКИМИ ОПЕРАЦИЯМИ
        // ============================================
        System.out.println("\n--- ПРИМЕРЫ С МАТЕМАТИЧЕСКИМИ ОПЕРАЦИЯМИ ---");
        
        int a = 10;
        int b = 0;
        System.out.println("a = " + a + ", b = " + b);
        
        // Проверка перед делением (избегаем деления на ноль)
        if (b != 0) {
            double division = (double) a / b;
            System.out.println("a / b = " + division);
        } else {
            System.out.println("Ошибка: деление на ноль невозможно");
        }
        
        // Проверка четности числа
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("Число " + num + " четное");
        } else {
            System.out.println("Число " + num + " нечетное");
        }
        
        // Проверка знака числа
        int value = -5;
        if (value > 0) {
            System.out.println("Число " + value + " положительное");
        } else if (value < 0) {
            System.out.println("Число " + value + " отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }
    
    /**
     * Вспомогательный метод для демонстрации проверки на null
     * В реальном коде это может быть метод, возвращающий значение из БД, API и т.д.
     * 
     * @return может вернуть null или строку
     */
    private static String getTextValue() {
        // В реальном коде здесь может быть логика получения значения
        // Для демонстрации возвращаем null
        return null;
    }
    
    /**
     * Вспомогательный метод для демонстрации короткого замыкания
     * 
     * @return может вернуть null или строку
     */
    private static String getDataValue() {
        // В реальном коде здесь может быть логика получения значения
        // Для демонстрации возвращаем null
        return null;
    }
}
