package app_35_collections_linkedhashset;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * {@link LinkedHashSet} — как {@link java.util.HashSet}, но итерация идёт в порядке <em>вставки</em>
 * (дополнительно хранится связный список элементов). Дубликатов нет, add/contains/remove в среднем O(1).
 * <p>
 * В отличие от {@link java.util.HashSet} порядок обхода предсказуем; в отличие от {@link java.util.TreeSet}
 * сортировки по ключу нет — только хронология добавления.
 */
public class LinkedHashSets {
    public static void main(String[] args) {
        // Интерфейс Set — к коду привязаны только операции множества, не к конкретной реализации.
        // Ёмкость 8 — чуть меньше внутренних перестроений, чем у HashSet(16) по умолчанию.
        Set<Pet> linkedHashSet = new LinkedHashSet<>(8);

        Pet pet1 = new Pet(1, "Vaska");
        Pet pet2 = new Pet(3, "Tuzik");
        Pet pet3 = new Pet(2, "Bulka");
        Pet pet4 = new Pet(4, "Korzhik");

        // List.of удобен для перечисления; сам список неизменяем, меняем только множество.
        for (Pet p : List.of(pet1, pet2, pet3, pet4)) {
            linkedHashSet.add(p);
        }
        // Повторный add того же объекта: множество не растёт, add возвращает false.
        System.out.println("Повторный add(pet1): " + linkedHashSet.add(pet1));

        // Порядок обхода = порядок первой вставки: Vaska, Tuzik, Bulka, Korzhik.
        for (Pet pet : linkedHashSet) {
            System.out.print(pet + " ");
        }
        System.out.println();
        // Тот же порядок, обход через итератор.
        linkedHashSet.forEach(pet -> System.out.print(pet + " "));
        System.out.println();
        // remove ищет элемент по equals/hashCode; передаём Pet, а не int.
        linkedHashSet.remove(pet1);
        System.out.println(linkedHashSet.size());
        // Остались Tuzik, Bulka, Korzhik — снова в порядке их первой вставки.
        linkedHashSet.forEach(pet -> System.out.print(pet + " "));
        System.out.println();
    }
}

/**
 * Для корректной работы в хеш-множестве важны согласованные equals и hashCode (у record генерируются).
 */
record Pet(Integer id, String name) {
    Pet {
        Objects.requireNonNull(name, "name");
    }
}
