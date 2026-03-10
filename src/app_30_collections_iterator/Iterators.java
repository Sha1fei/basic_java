package app_30_collections_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        // ArrayList на основе List.of — изменяемая коллекция, remove в итераторе доступен.
        Iterator<Integer> iterator_1 = new ArrayList<>(List.of(1, 2, 3, 4, 5)).iterator();
        // Arrays.asList — фиксированный размер, remove через итератор выбросит UnsupportedOperationException.
        Iterator<Integer> iterator_2 = Arrays.asList(1, 2, 3, 4, 5).iterator();
        // List.of — неизменяемая коллекция, remove недоступен.
        Iterator<Integer> iterator_3 = List.of(1, 2, 3, 4, 5).iterator();

        // Классический проход: hasNext() -> next().
        for (; iterator_1.hasNext(); ) {
            Integer next = iterator_1.next();
            // Безопасное удаление во время итерации — только через iterator.remove().
            if (next == 2) {
                iterator_1.remove();
            }
            System.out.print(next + " ");
        }

        System.out.println();
        // forEachRemaining удобен для вывода оставшихся элементов.
        iterator_2.forEachRemaining((item) -> System.out.print(item + " "));

        System.out.println();
        // Альтернативный вариант обхода в while.
        while (iterator_3.hasNext()) {
            Integer next = iterator_3.next();
            System.out.print(next + " ");
        }
    }
}
