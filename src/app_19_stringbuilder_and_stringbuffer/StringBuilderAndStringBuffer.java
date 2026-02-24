package app_19_stringbuilder_and_stringbuffer;

/**
 * StringBuilder и StringBuffer — изменяемые последовательности символов (mutable).
 * <p>
 * StringBuilder — быстрее, не потокобезопасен (один поток).
 * StringBuffer — потокобезопасен (synchronized методы), медленнее.
 * Для конкатенации в цикле предпочтительнее StringBuilder, а не String.
 */
public class StringBuilderAndStringBuffer {

    /**
     * Примеры конструкторов, insert, append, length и capacity.
     */
    public static void main(String[] args) {
        // Конструкторы: из строки, пустой, копия из другого StringBuilder
        StringBuilder s1 = new StringBuilder("abc");
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder(new StringBuilder("123"));

        // StringBuffer — аналог StringBuilder с synchronized (потокобезопасность)
        StringBuffer s4 = new StringBuffer();

        // insert(offset, str) — вставка в позицию; изменяет объект и возвращает this
        System.out.println("insert(0, ...): " + s1.insert(0, "s1: "));
        System.out.println("s2: " + s2.insert(0, "s2: "));
        System.out.println("s3: " + s3.insert(0, "s3: "));
        System.out.println("s4: " + s4.insert(0, "s4: "));

        // append — добавление в конец (цепочка вызовов)
        s1.append('d');
        System.out.println("append: " + s1.append(" - updated s1"));

        // length() — текущая длина; capacity() — зарезервированная ёмкость (может расти)
        StringBuilder sb = new StringBuilder(16);
        sb.append("hello");
        System.out.println("length=" + sb.length() + ", capacity=" + sb.capacity());
    }
}
