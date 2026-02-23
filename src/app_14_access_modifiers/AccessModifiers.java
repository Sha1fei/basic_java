package app_14_access_modifiers;

/**
 * Демонстрация модификаторов доступа в Java
 *
 * Модификаторы задают, откуда виден класс, поле, метод или конструктор:
 *
 * - private   - только внутри того же класса
 * - default   - (модификатор не пишется) только внутри того же пакета
 * - protected - тот же пакет + подклассы (даже из другого пакета)
 * - public    - отовсюду
 *
 * Порядок: private < default < protected < public
 */
public class AccessModifiers {

    public static void main(String[] args) {
        System.out.println("=== МОДИФИКАТОРЫ ДОСТУПА ===\n");

        Home home = new Home(4);
        System.out.println("home.window (public поле) = " + home.window);

        Home defaultHome = Home.getDefault();
        System.out.println("Home.getDefault().window = " + defaultHome.window);

        home.reboot();
        home.buildPublic();

        System.out.println("\nprivate - свой класс; default - пакет; protected - пакет+наследники; public - везде.");
    }
}

/**
 * Класс с разными модификаторами доступа.
 */
class Home {
    public int window;

    private Home() {
        this.window = 0;
    }

    public static Home getDefault() {
        return new Home();
    }

    protected Home(int window) {
        this.window = window;
    }

    private void build() {
        System.out.println("build() (private)");
    }

    protected void reboot() {
        System.out.println("reboot() (protected)");
    }

    public void buildPublic() {
        build();
    }
}
