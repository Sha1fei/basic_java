package app_27_oop_generics;

interface Animal_Kingdom<T> {
    // Обобщенный контракт: принимает и возвращает один и тот же тип.
    T getAnimalInfo(T animal);
}

public class Generics {
    public static void main(String[] args) {
        // "super" позволяет Animal_Type или его суперклассы как тип-цель.
        Animal<? super Animal_Type<String>> animal = new Animal<>();
        Animal_Type<String> animalType = new Animal_Type<>("chordates", "bone");
        System.out.println(animal.getAnimalInfo(animalType));
    }
}

// Тип ограничен наследниками Animal_Type с любым параметром.
class Animal<T extends Animal_Type<?>> implements Animal_Kingdom<T> {

    @Override
    public T getAnimalInfo(T animal) {
        System.out.println("Animal info: " + animal);
        return animal;
    }
}

// Ограниченный параметр: используем CharSequence, чтобы избежать финального типа.
class Animal_Type<T extends CharSequence> extends Animal_Class<T> {
    private final T animal_type;

    public Animal_Type(T animal_type, T animal_class) {
        super(animal_class);
        this.animal_type = animal_type;
    }

    public T getAnimalType() {
        return animal_type;
    }

    @Override
    public String toString() {
        return "Animal_Type{type=" + animal_type + ", class=" + getAnimalClass() + "}";
    }
}

class Animal_Class<T> {
    private final T animal_class;

    protected Animal_Class(T animal_class) {
        this.animal_class = animal_class;
    }

    public T getAnimalClass() {
        return animal_class;
    }
}

