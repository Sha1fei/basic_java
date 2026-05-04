package app_37_collections_dequeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/**
 * {@link Deque} (double-ended queue) — очередь с доступом с обоих концов: как очередь (FIFO) и как стек (LIFO).
 * {@link ArrayDeque} — реализация на массиве: операции у краёв в среднем O(1). Часто предпочтительнее {@link java.util.LinkedList}
 * для стека/очереди в одном потоке — меньше накладных расходов, чем связный список.
 * Не блокирует потоки (не thread-safe); для многопоточности смотрите {@link java.util.concurrent.ConcurrentLinkedDeque}.
 */
public class Dequeues {
    public static void main(String[] args) {
        // Начальная ёмкость уменьшает число внутренних перераспределений при росте дека.
        Deque<Pet> deque = new ArrayDeque<>(8);

        Pet pet1 = new Pet(1, "Vaska");
        Pet pet2 = new Pet(3, "Tuzik");

        // Слева направо «голова … хвост»: после вызовов порядок pet1, pet2.
        deque.addFirst(pet1);
        deque.addLast(pet2);

        // getFirst/getLast не удаляют элементы; при пустом деке бросают NoSuchElementException.
        Pet el1 = deque.getLast();   // pet2 (Tuzik)
        Pet el2 = deque.getFirst();  // pet1 (Vaska)

        // removeFirst/removeLast извлекают и удаляют; эквиваленты poll*, но poll* возвращают null при пустоте.
        deque.removeFirst();
        deque.removeLast();

        System.out.println(el1.name());
        System.out.println(el2.name());

        System.out.println("Дек пуст: " + deque.isEmpty() + ", размер: " + deque.size());

        // peekFirst/peekLast — как get*, но при пустом деке возвращают null вместо исключения.
        deque.addFirst(new Pet(10, "Barsik"));
        System.out.println("peekFirst: " + deque.peekFirst());
    }
}

record Pet(Integer id, String name) {
    Pet {
        Objects.requireNonNull(name, "name");
    }
}
