package app_14_access_modifiers;

/**
 * Демонстрация модификаторов доступа в Java
 *
 * - private   - только внутри того же класса
 * - default   - (без модификатора) только внутри пакета
 * - protected - пакет + подклассы
 * - public    - отовсюду
 */
public class AccessModifiers {

    public static void main(String[] args) {
        System.out.println("=== МОДИФИКАТОРЫ ДОСТУПА ===\n");

        Home home = new Home(4);
        System.out.println("home.window (public) = " + home.window);

        Home defaultHome = Home.getDefault();
        System.out.println("getDefault().window = " + defaultHome.window);

        home.reboot();
        home.buildPublic();

        Office office = new Office();
        office.work();

        Cottage cottage = new Cottage(2);
        cottage.reboot();
        System.out.println("cottage.window = " + cottage.window);
    }
}

/** Класс с членами private, protected, public. */
class Home {
    public int window;

    /** Приватный конструктор: снаружи вызвать нельзя, только из getDefault(). */
    private Home() { this.window = 0; }

    public static Home getDefault() { return new Home(); }

    /** protected: тот же пакет или подкласс. */
    protected Home(int window) { this.window = window; }

    private void build() { System.out.println("build() (private)"); }

    protected void reboot() { System.out.println("reboot() (protected)"); }

    /** Публичный метод вызывает внутри private build(). */
    public void buildPublic() { build(); }
}

/** Класс и метод с доступом по умолчанию (видны только в пакете). */
class Office {
    void work() { System.out.println("work() (default)"); }
}

/** Подкласс Home: может вызывать protected-конструктор и reboot(). */
class Cottage extends Home {
    Cottage(int windows) { super(windows); }
}
