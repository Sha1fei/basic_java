package app_34_collections_hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * {@link HashSet} — множество на основе хеш-таблицы: дубликатов нет, порядок обхода не гарантируется.
 * add/contains/remove в среднем O(1). Для своих типов важны согласованные {@code equals} и {@code hashCode}
 * (у {@link Record} они генерируются).
 * <p>
 * Если нужен предсказуемый порядок итерации — смотрите {@link java.util.LinkedHashSet}
 * (вставка + связный список). Если нужна сортировка — {@link java.util.TreeSet}.
 */
public class HashSets {
    public static void main(String[] args) {
        // Ссылка типа Set — зависимость от интерфейса; реализацию можно сменить без смены логики.
        // Начальная ёмкость 8 — меньше перераспределений внутренней таблицы (по умолчанию было бы 16).
        Set<Pet> hashSet = new HashSet<>(8);

        // Четыре разных объекта — после add в множестве будет не больше четырёх элементов.
        Pet pet1 = new Pet(1, "Vaska");
        Pet pet2 = new Pet(3, "Tuzik");
        Pet pet3 = new Pet(2, "Bulka");
        Pet pet4 = new Pet(4, "Korzhik");

        // List.of — неизменяемый список; здесь он только как удобный перечень для цикла.
        for (Pet p : List.of(pet1, pet2, pet3, pet4)) {
            // add возвращает true, если элемент действительно добавлен (новый для множества).
            hashSet.add(p);
        }
        // Повторно тот же объект pet1 — по equals это тот же элемент, множество не меняется, add возвращает false.
        System.out.println("Повторный add(pet1): " + hashSet.add(pet1));

        // Порядок при for/iterator не фиксирован (не путать с порядком вставки).
        // Расширенный for под капотом использует Iterator — поведение то же.
        for (Pet pet : hashSet) {
            // toString у record Pet задаёт читаемый вывод.
            System.out.print(pet + " ");
        }
        System.out.println();
        // Тот же состав элементов, обход через forEach (удобно для лямбд).
        hashSet.forEach(pet -> System.out.print(pet + " "));
        System.out.println();
        // remove(Object) ищет элемент через equals/hashCode;
        hashSet.remove(pet1);
        // size() — текущее число элементов после удаления (ожидаем 3).
        System.out.println(hashSet.size());
        // Остались pet2, pet3, pet4 (порядок снова не гарантирован).
        hashSet.forEach(pet -> System.out.print(pet + " "));
        System.out.println();
    }
}

/**
 * Поля участвуют в equals/hashCode — два объекта с одинаковым id и name считаются одним элементом для HashSet.
 * <p>
 * Контракт: если переопределить equals/hashCode вручную, они должны использовать одни и те же поля,
 * иначе элементы «теряются» или дублируются в хеш-коллекциях.
 * <p>
 * {@code requireNonNull(name)} — имя не может быть null (для предсказуемого equals и вывода).
 */
record Pet(Integer id, String name) {
    Pet {
        Objects.requireNonNull(name, "name");
    }
}
