package app_22_oop_polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        // Полиморфизм: переменная базового типа хранит объекты наследников.
        Animal cat = new Cat();
        cat.setName("Murzik");

        Animal dog = new Dog();
        dog.setName("Sharik");
        // Varargs: можно передать список объектов без массива.
        Animal.showAnimals(cat, dog);

    }
}

abstract class Animal {
    // Поле доступно наследникам, но скрыто от внешнего кода.
    protected String name;

    /**
     * Выводит имена животных, опираясь на полиморфизм.
     * Здесь не нужно приводить типы — достаточно вызвать общий метод.
     */
    public static void showAnimals(Animal... animals) {
        for (Animal animal : animals) {
            // Защита от null, чтобы не получить NullPointerException.
            if (animal == null) {
                System.out.println("null");
                continue;
            }
            System.out.println(animal.getName());
        }
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод: каждая реализация задаёт имя по-своему.
    public abstract void setName(String name);

    // Утилита для нормализации имени (общая для наследников).
    protected String normalizeName(String name, String defaultName) {
        if (name == null || name.isBlank()) {
            return defaultName;
        }
        return name.trim();
    }
}

class Cat extends Animal {

    // Для кота имя остаётся как есть.
    @Override
    public void setName(String name) {
        this.name = normalizeName(name, "Без имени");
    }

}

class Dog extends Animal {

    // Для собаки добавляем префикс при установке имени.
    @Override
    public void setName(String name) {
        String baseName = normalizeName(name, "Без имени");
        this.name = "Dog: " + baseName;
    }
}

