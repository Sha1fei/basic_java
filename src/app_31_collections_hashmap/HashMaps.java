package app_31_collections_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // Порядок при итерации по HashMap не гарантируется.
        Map<Integer, Pet> hashMap = new HashMap<>();
        // Инициализируем объекты питомцев.
        Pet pet1 = new Pet(1, "Vaska");
        Pet pet2 = new Pet(3, "Tuzik");
        Pet pet3 = new Pet(2, "Bulka");
        Pet pet4 = new Pet(4, "Korzhik");
        // Ключом используем id, значение — сам объект.
        hashMap.put(pet1.getId(), pet1);
        hashMap.put(pet2.getId(), pet2);
        hashMap.put(pet3.getId(), pet3);
        hashMap.put(pet4.getId(), pet4);

        // Итерация по entrySet дает доступ и к ключу, и к значению.
        for (Map.Entry<Integer, Pet> pet : hashMap.entrySet()) {
            System.out.print(pet + " ");
        }
        System.out.println();
        // Итерация только по значениям.
        hashMap.values().iterator().forEachRemaining(pet -> System.out.print(pet + " "));
        System.out.println();
        // Удаляем элемент по ключу.
        hashMap.remove(1);
        // Проверяем размер после удаления.
        System.out.println(hashMap.size());
        // Итерация только по ключам.
        hashMap.keySet().iterator().forEachRemaining(id -> System.out.print(id + " "));
        System.out.println();
        // Получение значения по ключу.
        System.out.println(hashMap.get(2));
        // Короткий способ обойти все пары ключ/значение.
        hashMap.forEach((key, pet) -> System.out.print(pet + " "));
    }
}

class Pet {
    private final Integer id;
    private final String name;

    public Pet(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pet other = (Pet) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

   

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
