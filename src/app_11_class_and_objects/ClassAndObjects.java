package app_11_class_and_objects;

public class ClassAndObjects {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.ram);
        System.out.println(computer.ssd);
        computer.load();
        
        // Получение системных свойств Java
        // Можно добавить в VMOptions: -Dtest=test
        // Или передать свойства через аргументы: arg1, arg2
        var systemVariables = System.getProperties();
        System.out.println("\nСистемные свойства Java:");
        System.out.println("Java версия: " + systemVariables.getProperty("java.version"));
        System.out.println("ОС: " + systemVariables.getProperty("os.name"));
    }
}


class Computer {
    int ssd = 500;
    int ram = 1024;

    void load() {
        System.out.println("Computer loaded");
    }
}
