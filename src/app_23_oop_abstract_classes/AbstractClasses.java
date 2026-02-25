package app_23_oop_abstract_classes;

public class AbstractClasses {
    public static void main(String[] args) {
        // Нельзя создать экземпляр абстрактного класса Animal, только его наследников.
        Animal cat = new Cat();
        cat.setName("Murzik");
        System.out.println(cat.getName());
    }
}

abstract class Animal {
    // protected: доступно наследникам, но скрыто от внешнего кода
    protected String name;

    // Общий геттер для всех наследников
    public String getName() {
        return name;
    }

    // Абстрактный сеттер: каждая реализация решает, как хранить имя
    public abstract String setName(String name);
}

class Cat extends Animal {

    // Для кота сохраняем имя с простой валидацией
    @Override
    public String setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "Без имени";
            return this.name;
        }
        this.name = name.trim();
        return this.name;
    }
}
