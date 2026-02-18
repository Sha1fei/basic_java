package app_05_switch;

/**
 * Демонстрация оператора switch в Java
 * 
 * Этот класс показывает примеры использования:
 * - Классического switch statement (с break)
 * - Switch expression (Java 14+)
 * - Множественные case значения
 * - Работу с разными типами данных
 * - Fall-through поведение (отсутствие break)
 * - Использование default case
 * 
 * Switch может работать с типами:
 * - byte, short, int, char
 * - String (начиная с Java 7)
 * - enum (начиная с Java 5)
 */
public class Switch {
    /**
     * Главный метод программы
     * 
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ОПЕРАТОРА SWITCH ===\n");
        
        // ============================================
        // КЛАССИЧЕСКИЙ SWITCH STATEMENT
        // ============================================
        System.out.println("--- КЛАССИЧЕСКИЙ SWITCH STATEMENT ---");
        
        // Switch работает с: byte, short, int, char, String, enum
        int month = 3;
        System.out.println("month = " + month);
        
        // Классический switch: проверяет значение переменной и выполняет соответствующий case
        // break необходим для выхода из switch, иначе выполнение продолжится (fall-through)
        switch (month) {
            case 1:
                System.out.println("January");
                break;  // break прерывает выполнение и выходит из switch
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                // default выполняется, если ни один case не совпал
                System.out.println("Invalid month");
                break;
        }
        
        // ============================================
        // SWITCH EXPRESSION (Java 14+)
        // ============================================
        System.out.println("\n--- SWITCH EXPRESSION (Java 14+) ---");
        
        // Switch expression: возвращает значение и может использоваться как выражение
        // Стрелочный синтаксис (->) автоматически прерывает выполнение (не нужен break)
        // Можно использовать несколько значений через запятую
        var result = switch (month) {
            case 12, 1, 2 -> "Winter";      // Зима: декабрь, январь, февраль
            case 3, 4, 5 -> "Spring";        // Весна: март, апрель, май
            case 6, 7, 8 -> "Summer";        // Лето: июнь, июль, август
            case 9, 10, 11 -> "Autumn";      // Осень: сентябрь, октябрь, ноябрь
            default -> "Invalid month";      // Обработка недопустимых значений
        };
        System.out.println("Сезон для месяца " + month + ": " + result);
        
        // ============================================
        // FALL-THROUGH ПОВЕДЕНИЕ (отсутствие break)
        // ============================================
        System.out.println("\n--- FALL-THROUGH ПОВЕДЕНИЕ ---");
        
        int dayOfWeek = 3;
        System.out.println("dayOfWeek = " + dayOfWeek);
        
        // Без break выполнение "проваливается" в следующий case
        // Это может быть полезно, когда несколько case должны выполнять один код
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Рабочий день");
                break;
            case 6:
            case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Неверный день недели");
        }
        
        // ============================================
        // SWITCH СО СТРОКАМИ (String)
        // ============================================
        System.out.println("\n--- SWITCH СО СТРОКАМИ ---");
        
        String language = "Java";
        System.out.println("language = \"" + language + "\"");
        
        switch (language) {
            case "Java":
                System.out.println("Отличный выбор! Java - мощный язык программирования");
                break;
            case "Python":
                System.out.println("Python - популярный язык для data science");
                break;
            case "JavaScript":
                System.out.println("JavaScript - язык веб-разработки");
                break;
            case "C++":
                System.out.println("C++ - язык системного программирования");
                break;
            default:
                System.out.println("Неизвестный язык программирования");
        }
        
        // Switch expression со строками
        String greeting = switch (language) {
            case "Java" -> "Hello, Java Developer!";
            case "Python" -> "Hello, Pythonista!";
            case "JavaScript" -> "Hello, JavaScript Developer!";
            default -> "Hello, Programmer!";
        };
        System.out.println("Приветствие: " + greeting);
        
        // ============================================
        // SWITCH С CHAR
        // ============================================
        System.out.println("\n--- SWITCH С CHAR ---");
        
        char grade = 'B';
        System.out.println("grade = '" + grade + "'");
        
        switch (grade) {
            case 'A':
                System.out.println("Отлично! Оценка A");
                break;
            case 'B':
                System.out.println("Хорошо! Оценка B");
                break;
            case 'C':
                System.out.println("Удовлетворительно. Оценка C");
                break;
            case 'D':
                System.out.println("Плохо. Оценка D");
                break;
            case 'F':
                System.out.println("Неудовлетворительно. Оценка F");
                break;
            default:
                System.out.println("Неверная оценка");
        }
        
        // ============================================
        // SWITCH EXPRESSION С БЛОКАМИ КОДА
        // ============================================
        System.out.println("\n--- SWITCH EXPRESSION С БЛОКАМИ ---");
        
        int number = 5;
        System.out.println("number = " + number);
        
        // Switch expression может содержать блоки кода с yield
        String description = switch (number) {
            case 1, 2, 3 -> {
                System.out.println("  Маленькое число");
                yield "Маленькое число (1-3)";
            }
            case 4, 5, 6 -> {
                System.out.println("  Среднее число");
                yield "Среднее число (4-6)";
            }
            case 7, 8, 9 -> {
                System.out.println("  Большое число");
                yield "Большое число (7-9)";
            }
            default -> {
                System.out.println("  Вне диапазона");
                yield "Число вне диапазона 1-9";
            }
        };
        System.out.println("Описание: " + description);
        
        // ============================================
        // ПРАКТИЧЕСКИЙ ПРИМЕР: КАЛЬКУЛЯТОР
        // ============================================
        System.out.println("\n--- ПРАКТИЧЕСКИЙ ПРИМЕР: КАЛЬКУЛЯТОР ---");
        
        int operand1 = 10;
        int operand2 = 5;
        String operation = "+";
        System.out.println("Операция: " + operand1 + " " + operation + " " + operand2);
        
        int calculationResult = switch (operation) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand2 != 0 ? operand1 / operand2 : 0;
            case "%" -> operand1 % operand2;
            default -> {
                System.out.println("  Неизвестная операция");
                yield 0;
            }
        };
        System.out.println("Результат: " + calculationResult);
    }
}
