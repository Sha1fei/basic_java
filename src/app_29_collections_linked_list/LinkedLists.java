package app_29_collections_linked_list;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        // LinkedList удобен для частых вставок/удалений в начале/конце.
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("size: " + linkedList.size());

        // Добавление в начало/конец — O(1).
        linkedList.addFirst(0);
        linkedList.addLast(4);

        // Доступ по индексу — O(n) (нужно пройти до элемента).
        System.out.println(linkedList.get(0));
        // Поиск по значению — O(n).
        System.out.println(linkedList.contains(2));
        // Удаление по значению — O(n).
        linkedList.remove((Integer) 2);
        // Линейный обход — O(n).
        linkedList.forEach(i -> System.out.print("Element: " + i + ", "));
    }
}
