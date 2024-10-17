package app_33_collections_treemap;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        Map<Integer, Pet> treeMap = new TreeMap<>(); // строит красно бело дерево

        Pet pet1 = new Pet(1, "Vaska");
        Pet pet2 = new Pet(3, "Tuzik");
        Pet pet3 = new Pet(2, "Bulka");
        Pet pet4 = new Pet(4, "Korzhik");
        Pet pet5 = new Pet(5, "Laska");
        Pet pet6 = new Pet(6, "Ghorik");

        treeMap.put(pet1.getId(), pet1);
        treeMap.put(pet2.getId(), pet2);
        treeMap.put(pet3.getId(), pet3);
        treeMap.put(pet4.getId(), pet4);
        treeMap.put(pet5.getId(), pet5);
        treeMap.put(pet6.getId(), pet6);

        for (Map.Entry<Integer, Pet> pet : treeMap.entrySet()) {
            System.out.print(pet + " ");
        }
        System.out.println();
        treeMap.values().iterator().forEachRemaining(pet -> System.out.print(pet + " "));
        System.out.println();
        treeMap.remove(1);
        System.out.println(treeMap.size());
        treeMap.keySet().iterator().forEachRemaining(id -> System.out.print(id + " "));
        System.out.println();
        System.out.println(treeMap.get(2));
        treeMap.forEach((key, pet) -> System.out.println(pet + " "));
    }
}

class Pet {
    private Integer id;
    private String name;

    public Pet(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id) && Objects.equals(name, pet.name);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

