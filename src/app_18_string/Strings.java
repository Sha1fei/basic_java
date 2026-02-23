package app_18_string;

import java.util.stream.Collectors;

/**
 * Демонстрация работы со строками (String) в Java.
 * <p>
 * String — неизменяемый (immutable) класс. Методы replace, toUpperCase и т.д.
 * возвращают новую строку. Строки в кавычках попадают в пул строк (intern).
 */
public class Strings {

    /**
     * Примеры основных методов String: создание, сравнение, поиск, форматирование, разбиение.
     */
    public static void main(String[] args) {
        // --- Создание строки из массива символов ---
        var s1 = new String(new char[]{'1', '2', '3'});
        System.out.println("Строка s1 (из массива символов {'1','2','3'}): " + s1);

        // --- Символ по индексу ---
        var ch = s1.charAt(1);
        System.out.println("charAt(1) — символ по индексу 1: " + ch);

        // --- Сравнение: compareTo ---
        var cmp = s1.compareTo("12");
        System.out.println("compareTo(\"12\") — сравнение (<0 меньше, 0 равно, >0 больше): " + cmp);

        // --- Конкатенация ---
        var s4 = s1.concat("4");
        System.out.println("concat(\"4\") — склейка s1 + \"4\": " + s4);

        // --- Проверка вхождения ---
        var s5 = s1.contains("4");
        System.out.println("contains(\"4\") — есть ли подстрока \"4\" в s1: " + s5);

        var s6 = s1.endsWith("3");
        System.out.println("endsWith(\"3\") — заканчивается ли s1 на \"3\": " + s6);

        // --- Равенство ---
        var s7 = s1.equals("123");
        System.out.println("equals(\"123\") — равенство s1 и \"123\": " + s7);

        // --- Форматирование ---
        var s8 = String.format("a = %d, b = %d, c = %s", 1, 2, "3");
        System.out.println("String.format(\"a=%d, b=%d, c=%s\", 1, 2, \"3\"): " + s8);

        // --- Байты ---
        var s9 = s1.getBytes();
        System.out.println("getBytes()[0] — первый байт строки \"123\": " + s9[0]);

        // --- indexOf ---
        var idx = s1.indexOf("3 ");
        System.out.println("indexOf(\"3 \") — индекс первого вхождения; -1 если не найдено: " + idx);

        // --- isBlank / isEmpty ---
        var s11 = s1.isBlank();
        System.out.println("isBlank() — пусто или только пробелы/табы: " + s11);

        var s12 = s1.isEmpty();
        System.out.println("isEmpty() — длина строки равна 0: " + s12);

        // --- join ---
        var s13 = String.join("-", s8, s1);
        System.out.println("String.join(\"-\", s8, s1) — склейка через \"-\": " + s13);

        // --- lastIndexOf ---
        var s14 = s13.lastIndexOf(s1);
        System.out.println("lastIndexOf(s1) — индекс последнего вхождения s1 в s13: " + s14);

        // --- length ---
        var len = s1.length();
        System.out.println("length() — количество символов в s1: " + len);

        // --- lines ---
        var lines = "a\nb\nc".lines().collect(Collectors.toList());
        System.out.println("lines() — разбиение \"a\\nb\\nc\" по переводам строки: " + lines);

        // --- matches ---
        var s17 = s13.matches("(.*)" + s1 + "(.*)");
        System.out.println("matches(...) — совпадение с регулярным выражением: " + s17);

        // --- replace ---
        var s18 = s13.replace('1', '9');
        System.out.println("replace('1', '9') — замена '1' на '9' в s13: " + s18);

        // --- split ---
        var parts = s13.split(",");
        System.out.println("split(\",\")[0] — первый фрагмент после разбиения по запятой: " + parts[0]);

        // --- startsWith ---
        var s20 = s13.startsWith(s1);
        System.out.println("startsWith(s1) — начинается ли s13 с s1: " + s20);

        // --- substring ---
        var s21 = s13.substring(7, 19);
        System.out.println("substring(7, 19) — подстрока s13 [7, 19): " + s21);

        // --- toCharArray ---
        var s22 = s1.toCharArray();
        System.out.println("toCharArray()[1] — символ с индексом 1: " + s22[1]);

        // --- toUpperCase ---
        var s23 = s13.toUpperCase();
        System.out.println("toUpperCase() — s13 в верхнем регистре: " + s23);

        // --- trim ---
        var s24 = new String(" " + s1 + " ").trim();
        System.out.println("trim() — обрезка пробелов у \" 123 \": '" + s24 + "'");

        // --- valueOf ---
        var s25 = String.valueOf(true);
        System.out.println("String.valueOf(true) — преобразование boolean в строку: " + s25);
    }
}
