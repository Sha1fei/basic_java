package app_16_compositions;

/**
 * Демонстрация композиции (composition) в Java.
 * Композиция — отношение «часть–целое»: объект содержит другие объекты как поля.
 * Класс Computer «имеет» Ram и Ssd (has-a). Компоненты создаются снаружи и передаются в конструктор
 * либо создаются внутри — в обоих случаях это композиция.
 */
public class Compositions {

    public static void main(String[] args) {
        Ram ram = new Ram();
        Ssd ssd = new Ssd();
        ram.setSize(1024);
        ssd.setSize(2048);

        // Композиция: компьютер «состоит из» ram и ssd
        Computer computer = new Computer(ram, ssd);
        computer.show();
    }
}
