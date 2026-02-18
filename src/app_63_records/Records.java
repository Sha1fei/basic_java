package app_63_records;

import java.util.List;

/**
 * Демонстрация Records в Java (Java 14+, стабильно с Java 16)
 *
 * Record — компактный способ объявить неизменяемый класс-носитель данных.
 * Компилятор автоматически генерирует: конструктор, геттеры, equals(), hashCode(), toString().
 *
 * Синтаксис: record Имя(тип поле1, тип поле2, ...) { тело }
 *
 * Этот класс показывает:
 * - Простой record
 * - Компактный конструктор (валидация)
 * - Дополнительные методы в record
 * - Record, реализующий интерфейс
 * - Вложенный record
 * - Использование в коллекциях и Stream API
 */
public class Records {

    /**
     * Простой record: точка с координатами x, y.
     * Автоматически: Point(int x, int y), getX(), getY(), equals(), hashCode(), toString()
     */
    public record Point(int x, int y) {
    }

    /**
     * Record с компактным конструктором — можно проверять и нормализовать данные.
     */
    public record User(String name, int age) {
        // Компактный конструктор: вызывается после присваивания полей
        public User {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("name не может быть пустым");
            }
            if (age < 0 || age > 150) {
                throw new IllegalArgumentException("age должен быть от 0 до 150");
            }
        }

        // Дополнительный метод
        public boolean isAdult() {
            return age >= 18;
        }
    }

    /**
     * Record может реализовывать интерфейс.
     */
    public record Product(String id, String title, double price) implements Comparable<Product> {
        @Override
        public int compareTo(Product other) {
            return Double.compare(this.price, other.price);
        }
    }

    /**
     * Вложенный record — удобно для группировки данных.
     */
    public record Range(int from, int to) {
        public int length() {
            return Math.max(0, to - from);
        }

        // Вложенный record
        public record Segment(int start, int end) {
            public boolean contains(int value) {
                return value >= start && value <= end;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ RECORDS (Java 16+) ===\n");

        // ============================================
        // ПРОСТОЙ RECORD
        // ============================================
        System.out.println("--- Простой record Point ---");
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);

        System.out.println("p1 = " + p1);           // Point[x=10, y=20]
        System.out.println("p1.x() = " + p1.x());  // геттер без префикса get
        System.out.println("p1.y() = " + p1.y());
        System.out.println("p1.equals(p2) = " + p1.equals(p2));  // true
        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println();

        // ============================================
        // RECORD С ВАЛИДАЦИЕЙ
        // ============================================
        System.out.println("--- Record User с компактным конструктором ---");
        User user = new User("Алексей", 25);
        System.out.println("user = " + user);
        System.out.println("user.isAdult() = " + user.isAdult());

        try {
            new User("", 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        }
        System.out.println();

        // ============================================
        // RECORD, РЕАЛИЗУЮЩИЙ ИНТЕРФЕЙС
        // ============================================
        System.out.println("--- Record Product (Comparable) ---");
        Product prod1 = new Product("P001", "Ноутбук", 75000);
        Product prod2 = new Product("P002", "Мышь", 1500);
        System.out.println("prod1 = " + prod1);
        System.out.println("prod1.compareTo(prod2) = " + prod1.compareTo(prod2));
        System.out.println();

        // ============================================
        // ВЛОЖЕННЫЙ RECORD
        // ============================================
        System.out.println("--- Вложенный record Range.Segment ---");
        Range range = new Range(0, 100);
        System.out.println("range.length() = " + range.length());

        Range.Segment segment = new Range.Segment(10, 50);
        System.out.println("segment = " + segment);
        System.out.println("segment.contains(25) = " + segment.contains(25));
        System.out.println();

        // ============================================
        // RECORDS В КОЛЛЕКЦИЯХ И STREAM
        // ============================================
        System.out.println("--- Records в списке и Stream ---");
        List<Point> points = List.of(
                new Point(0, 0),
                new Point(1, 1),
                new Point(2, 4)
        );

        points.forEach(System.out::println);

        int sumX = points.stream()
                .mapToInt(Point::x)
                .sum();
        System.out.println("Сумма всех x = " + sumX);
        System.out.println();

        // ============================================
        // ЛОКАЛЬНЫЙ RECORD (Java 16+)
        // ============================================
        System.out.println("--- Локальный record ---");
        record Pair(String first, String second) {
            String concat() {
                return first + " | " + second;
            }
        }

        Pair pair = new Pair("Java", "Records");
        System.out.println("pair.concat() = " + pair.concat());
    }
}
