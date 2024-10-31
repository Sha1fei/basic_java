package app_39_collections_WeakHashMaps;

import java.util.WeakHashMap;

public class WeakHashMaps {
    public static void main(String[] args) {
        WeakHashMap<Integer, Pet> weakHashMap = new WeakHashMap<>(); // ������ HashMap �� ������� ������� �� ���� ������� ���� �� ��� ������ �������� - ����� ���

        Pet pet1 = new Pet(1, "Vaska");
        weakHashMap.put(pet1.getId(), pet1); // ��. hashMap
        System.out.println(weakHashMap.get(pet1.getId()));
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


