package app_64_type_casting;

/**
 * Приведение типов: примитивы и объекты (классы).
 * Также проверка принадлежности к типу/родителю через instanceof.
 */
public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("=== ПРИВЕДЕНИЕ ТИПОВ ===\n");

        // ============================================
        // ПРИМИТИВЫ: расширяющее и сужающее приведение
        // ============================================
        int i = 200;
        long l = i; // расширяющее: int -> long (безопасно)
        double d = l; // расширяющее: long -> double
        System.out.println("int -> long -> double: " + d);

        double pi = 3.14159;
        int piInt = (int) pi; // сужающее: double -> int (теряем дробную часть)
        System.out.println("double -> int (loss): " + piInt);

        byte b = 100;
        int bInt = b; // расширяющее: byte -> int
        byte bBack = (byte) (bInt + 30); // сужающее: возможна потеря
        System.out.println("byte -> int -> byte: " + bBack);
        System.out.println();

        // ============================================
        // ОБЪЕКТЫ: upcast / downcast и instanceof
        // ============================================
        Animal animal = new Cat("Murzik"); // upcast: Cat -> Animal
        System.out.println("animal name: " + animal.getName());

        // Проверка принадлежности к типу/родителю
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));
        System.out.println("animal instanceof Cat: " + (animal instanceof Cat));
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));

        // Downcast возможен только после проверки
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal; // downcast: Animal -> Cat
            cat.meow();
        }

        Animal another = new Dog("Sharik");
        if (another instanceof Cat) {
            // не выполнится
            Cat cat = (Cat) another;
            cat.meow();
        } else {
            System.out.println("another не является Cat");
        }
    }
}

abstract class Animal {
    protected final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}
