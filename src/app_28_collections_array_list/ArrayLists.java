package app_28_collections_array_list;

// Варианты Big O (от лучшей к худшей):
// O(1) — пример: добавление элемента в массив
// O(log n) — пример: бинарный поиск элемента
// O(n) — пример: поиск элемента по значению
// O(n log n) — пример: быстрая сортировка
// O(n^2) — пример: сортировка пузырьком или перебор двумерных массивов
// O(2^n) — пример: Tower of Hanoi https://dev.to/lofiandcode/big-o-part-5-2-n-2ifn
// O(n!) — пример: рекурсивная функция в цикле https://dev.to/lofiandcode/big-o-part-6-n-58e3

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        // Указываем начальную емкость, чтобы уменьшить количество расширений. Позволяет добавлять дубликатыы
        List<Integer> arrayList = new ArrayList<>(4);
        arrayList.add(1);    // Амортизированное O(1), tесли выходим за предел O(n)
        arrayList.add(2);
        arrayList.add(3);

        // Доступ по индексу — O(1).
        System.out.println(arrayList.get(0));
        // Поиск по значению — O(n).
        System.out.println(arrayList.contains(2));
        // Удаление по значению — O(n).
        arrayList.remove((Integer) 2);
        // Линейный обход — O(n).
        arrayList.forEach(i -> System.out.print("Element: " + i + ", "));
    }
}
