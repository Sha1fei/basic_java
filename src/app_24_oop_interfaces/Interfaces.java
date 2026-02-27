package app_24_oop_interfaces;

// Реализация интерфейса через implements (в отличие от наследования extends).
public class Interfaces implements Test {
    public static void main(String[] args) {
        Interfaces demo = new Interfaces();
        // default-метод из интерфейса
        demo.test2();
        // реализация абстрактного метода интерфейса
        demo.test5();
    }

    @Override
    public void test5() {
        System.out.println("run test5");
    }
}
