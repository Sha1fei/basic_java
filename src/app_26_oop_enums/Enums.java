package app_26_oop_enums;

import java.util.Arrays;

enum TestEnum_1 {
    Test_A, Test_B, Test_C, Test_D, Test_E;
}

// enum может реализовывать интерфейсы и переопределять методы.
enum TestEnum_2 implements TestEnums_2_interface {
    Test_A("test_a") {
        @Override
        public void getTest2(){
            System.out.println("Вызов метода getTest2");
        }
    }, // т.к. переопредели конструктор TestEnum_2, {} - т.к. добавили абстрактный метод
    Test_B("test_b"){
        @Override
        public void getTest2(){
            System.out.println("Вызов метода getTest2");
        }
    };
    
    
    private final String test;

    // Конструктор enum всегда private (неявно).
    TestEnum_2(String test) {
        this.test = test;
    }

    // Геттер для поля enum-константы.
    public String getTest() {
        return test;
    }

    // Можно переопределить метод на уровне enum.
    @Override
    public abstract void getTest2();
}


interface TestEnums_2_interface {
    void getTest2();
}

public class Enums {
    public static void main(String[] args) {
        System.out.println(TestEnum_1.Test_A);
        System.out.println(TestEnum_1.Test_B.name());
        System.out.println(TestEnum_1.Test_C.toString());
        System.out.println(TestEnum_1.valueOf("Test_D"));
        System.out.println(Arrays.toString(TestEnum_1.values())); // массив всех констант
        System.out.println(TestEnum_1.Test_E.ordinal()); // порядковый номер (0-based)

        System.out.println(TestEnum_2.Test_A.getTest());
        System.out.println(TestEnum_2.Test_B.getTest());
        TestEnum_2.Test_A.getTest2();
    }
}
