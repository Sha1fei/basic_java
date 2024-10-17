package app_62_reflection;

import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection_Test> reflection_test = Reflection_Test.class;
        Constructor<Reflection_Test> reflection_test_constructor = reflection_test.getConstructor(String.class);
        Reflection_Test instance = reflection_test_constructor.newInstance("Ivan"); //создание instance конструктор

        Class<? extends Reflection_Test> reflection_test2 = instance.getClass();

        System.out.println("Class name: " + reflection_test.getName());
        System.out.println("Class name: " + reflection_test.getSimpleName());
        System.out.println("Superclass: " + reflection_test.getSuperclass().getName());

        System.out.println();
        for (Method method : reflection_test.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
            System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
            System.out.println("Return type: " + method.getReturnType().getName());
            System.out.println("Annotation: " + method.getAnnotation(CustomAnnotation.class).value());
            System.out.println("Parameters:");
            for (Parameter parameter : method.getParameters()) {
                System.out.println("  Type: " + parameter.getType().getName());
                System.out.println("  Name: " + parameter.getName());
            }
            System.out.println();
        }

        Method methodSet = reflection_test.getDeclaredMethod("setName", String.class);
        Method methodGet = reflection_test.getDeclaredMethod("getName");
        methodSet.invoke(instance, "Valentin");
        System.out.println(methodGet.invoke(instance));
        methodGet.invoke(instance);
        System.out.println();

        Field[] fields = instance.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
            System.out.println("Type: " + field.getType().getName());
            field.setAccessible(true);
            System.out.println("Value: " + field.get(instance));
            System.out.println("Annotation: " + field.getAnnotation(CustomAnnotation.class).value());
            System.out.println();
        }

    }
}

class Reflection_Test {
    @CustomAnnotation()
    private String name;

    public Reflection_Test(String name) {
        this.name = name;
    }

    @CustomAnnotation()
    public String getName() {
        return name;
    }

    @CustomAnnotation()
    public void setName(String name) {
        this.name = name;
    }

    @Override
    @CustomAnnotation()
    public String toString() {
        return "Reflection_Test{" +
                "name='" + name + '\'' +
                '}';
    }
}


