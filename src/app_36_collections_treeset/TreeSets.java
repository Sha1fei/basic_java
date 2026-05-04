package app_36_collections_treeset;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * {@link TreeSet} — множество на основе красно-чёрного дерева: элементы упорядочены по «естественному» порядку
 * ключей или по {@link java.util.Comparator}. Дубликатов нет; add/remove/contains — O(log n).
 * <p>
 * Элементы должны быть сравнимы: либо реализуют {@link Comparable}, либо в конструктор передаётся компаратор:
 * {@code new TreeSet<>(Comparator.comparing(Pet::name))}.
 */
public class TreeSets {
    public static void main(String[] args) {
        // Без Comparator используется порядок из Comparable.compareTo у Pet.
        Set<Pet> treeSet = new TreeSet<>();

        Pet pet1 = new Pet(1, "Vaska");
        Pet pet2 = new Pet(3, "Tuzik");
        Pet pet3 = new Pet(2, "Bulka");
        Pet pet4 = new Pet(4, "Korzhik");
        Pet pet5 = new Pet(5, "Laska");
        Pet pet6 = new Pet(6, "Ghorik");

        for (Pet p : List.of(pet1, pet2, pet3, pet4, pet5, pet6)) {
            treeSet.add(p);
        }
        // Дубликат определяется через compareTo == 0 (здесь совпадают id и имя у pet1).
        System.out.println("Повторный add(pet1): " + treeSet.add(pet1));

        // Обход всегда в отсортированном порядке (по compareTo), не в порядке вставки (1…6 по id).
        for (Pet pet : treeSet) {
            System.out.print(pet + " ");
        }
        System.out.println();
        treeSet.forEach(pet -> System.out.print(pet + " "));
        System.out.println();
        // remove(Object): поиск элемента через compareTo (как и при добавлении).
        treeSet.remove(pet1);
        // После удаления pet1 остаётся 5 элементов (id 2…6).
        System.out.println(treeSet.size());
        treeSet.forEach(pet -> System.out.print(pet + " "));
        System.out.println();
        // println по одному — удобнее читать вывод построчно.
        treeSet.forEach(pet -> System.out.println(pet + " "));
    }
}

/**
 * Для {@link TreeSet} без компаратора тип должен реализовать {@link Comparable}.
 * Сравнение сначала по id, при равных id — по имени (чтобы compareTo согласовывался с equals).
 */
record Pet(Integer id, String name) implements Comparable<Pet> {
    Pet {
        Objects.requireNonNull(name, "name");
    }

    @Override
    public int compareTo(Pet o) {
        int byId = Integer.compare(id, o.id);
        return byId != 0 ? byId : name.compareTo(o.name);
    }
}
