package app_25_oop_inner_and_nested_classes;

public class InnerAndNestedClasses {
    // Поле внешнего класса, доступно внутренним классам
    private final String value;

    public InnerAndNestedClasses(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        InnerAndNestedClasses app = new InnerAndNestedClasses("test");
        app.handlerMethod();

        // Нестатический внутренний класс создаётся через экземпляр внешнего класса
        InnerAndNestedClasses.InnerClass innerClass = app.new InnerClass();
        innerClass.testInner();

        // Статический вложенный класс создаётся без экземпляра внешнего класса
        InnerAndNestedClasses.InnerClass2 innerClass2 = new InnerAndNestedClasses.InnerClass2();
        innerClass2.testInner2();

    }

    // Метод демонстрирует локальный класс (объявляется внутри метода)
    void handlerMethod() {
        class NestedClass2 {
            void testInner() {
                System.out.println("run Nested Class");
            }
        }

        NestedClass2 nestedClass2 = new NestedClass2();
        nestedClass2.testInner();
    }

    // Статический вложенный класс: не имеет ссылки на внешний объект
    static class InnerClass2 {
        void testInner2() {
            System.out.println("run Nested Class2");
        }
    }

    // Нестатический внутренний класс: имеет доступ к полям внешнего объекта
    class InnerClass {
        void testInner() {
            System.out.println("run Inner Class: " + InnerAndNestedClasses.this.value); // обращение к внешнему объекту без его создания
        }
    }
}
