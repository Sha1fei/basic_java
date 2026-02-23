package app_15_packages_and_imports;

// Одиночный импорт: один класс из пакета
import app_15_packages_and_imports.test_a.TestA;
// Импорт со звёздочкой (*): все публичные классы из пакета test_a.test_b (TestB, TestC и т.д.)
import app_15_packages_and_imports.test_a.test_b.*;

/**
 * Демонстрация пакетов и импортов в Java.
 * Пакет задаётся в начале файла: package полное.имя.пакета;
 * Структура папок должна совпадать с именем пакета (app_15_packages_and_imports/test_a/test_b).
 * Классы из других пакетов подключаются через import или полное имя (например, java.util.List).
 * import package.* — импорт всех публичных классов пакета (звёздочка не включает подпакеты).
 */
public class PackagesAndImports {

    public static void main(String[] args) {
        // Использование классов из вложенных пакетов test_a и test_a.test_b
        TestA testA = new TestA();
        TestB testB = new TestB();
        TestC testC = new TestC();

        System.out.println(testA.getName());
        System.out.println(testB.getName());
        System.out.println(testC.getName());
    }
}
