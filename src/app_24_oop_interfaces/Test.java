package app_24_oop_interfaces;

public interface Test {
    // Все поля интерфейса неявно public static final.
    String CONSTANT_TEST = "run test";

    // Статический метод интерфейса.
    static String test4() {
        return "run test4";
    }

    // Абстрактный метод: должен быть реализован классом.
    void test5();

    // default-метод: имеет реализацию и может быть переопределён.
    default void test2() {
        System.out.println(Test.CONSTANT_TEST);
        System.out.println("run test2");
        test3();
        System.out.println(Test.test4());
    }

    // Приватный метод: доступен только внутри интерфейса (в Java 9+).
    private void test3() {
        System.out.println("run test3");
    }
}
