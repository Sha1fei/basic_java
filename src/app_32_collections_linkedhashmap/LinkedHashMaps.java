package app_32_collections_linkedhashmap;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Демонстрация {@link LinkedHashMap}: хеш-таблица с связным списком по порядку вставки.
 * Получить элемент по ключу — в среднем O(1), как у обычной HashMap.
 */
public class LinkedHashMaps {
    public static void main(String[] args) {
        // Ключ в карте совпадает с id — так проще искать и удалять по идентификатору.
        Person person1 = new Person("Ivan", 18, 1);
        Person person2 = new Person("Petr", 21, 3);
        Person person3 = new Person("Andrew", 16, 2);

        // LinkedHashMap сохраняет порядок вставки при обходе (в отличие от HashMap).
        // Память: чуть больше, чем у HashMap, из-за списка «кто за кем встал».
        // Начальная ёмкость 8 — без лишних перераспределений буфера для трёх пар.
        Map<Integer, Person> linkedHashMap = new LinkedHashMap<>(8);

        // Порядок в списке = порядок put (удобно держать данные рядом с заполнением карты).
        List<Person> people = List.of(person1, person2, person3);
        for (Person p : people) {
            // put: если ключа ещё не было — новая пара; если был — старое значение заменяется.
            linkedHashMap.put(p.id(), p);
        }

        // Обход пар ключ/значение — порядок совпадает с порядком put() (1, 3, 2 — как выше).
        for (Map.Entry<Integer, Person> person : linkedHashMap.entrySet()) {
            // toString() у Map.Entry печатает key=value
            System.out.print(person + " ");
        }
        System.out.println();
        // values() — представление без копии данных; итерация в том же порядке вставки.
        linkedHashMap.values().iterator().forEachRemaining(p -> System.out.print(p + " "));
        System.out.println();
        // remove(1) убирает запись с ключом 1 (Ivan).
        linkedHashMap.remove(1);
        // size() — сколько пар осталось.
        System.out.println(linkedHashMap.size());
        // keySet() — только ключи, снова в порядке вставки оставшихся элементов.
        linkedHashMap.keySet().iterator().forEachRemaining(id -> System.out.print(id + " "));
        System.out.println();
        // get(2) — O(1) в среднем; при отсутствии ключа вернёт null.
        System.out.println(linkedHashMap.get(2));
        // forEach — тот же порядок, что и у entrySet; удобно для лаконичного кода.
        linkedHashMap.forEach((key, person) -> System.out.println(person + " "));
    }
}

/**
 * Record: неизменяемые данные, equals/hashCode/toString генерируются компилятором —
 * удобно для значений в Map.
 */
record Person(String name, int age, int id) {
    Person {
        Objects.requireNonNull(name, "name");
    }
}
