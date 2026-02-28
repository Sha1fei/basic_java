package app_27_oop_generics;

interface Animal_Kingdom<T> {
    // РћР±РѕР±С‰РµРЅРЅС‹Р№ РєРѕРЅС‚СЂР°РєС‚: РїСЂРёРЅРёРјР°РµС‚ Рё РІРѕР·РІСЂР°С‰Р°РµС‚ РѕРґРёРЅ Рё С‚РѕС‚ Р¶Рµ С‚РёРї.
    T getAnimalInfo(T animal);
}

public class Generics {
    public static void main(String[] args) {
        // "super" РїРѕР·РІРѕР»СЏРµС‚ Animal_Type РёР»Рё РµРіРѕ СЃСѓРїРµСЂРєР»Р°СЃСЃС‹ РєР°Рє С‚РёРї-С†РµР»СЊ.
        Animal<? super Animal_Type<String>> animal = new Animal<>();
        Animal_Type<String> animalType = new Animal_Type<>("chordates", "bone");
        System.out.println(animal.getAnimalInfo(animalType));
    }
}

class Animal<T extends Animal_Type<?>> implements Animal_Kingdom<T> {

    @Override
    public T getAnimalInfo(T animal) {
        System.out.println("Animal type: " + animal.getAnimalType()
                + ", Animal class: " + animal.getAnimalClass());
        return animal;
    }
}

// РћРіСЂР°РЅРёС‡РµРЅРЅС‹Р№ РїР°СЂР°РјРµС‚СЂ: РёСЃРїРѕР»СЊР·СѓРµРј CharSequence, С‡С‚РѕР±С‹ РёР·Р±РµР¶Р°С‚СЊ С„РёРЅР°Р»СЊРЅРѕРіРѕ С‚РёРїР°.
class Animal_Type<T extends CharSequence> extends Animal_Class<T> {
    private final T animal_type;

    public Animal_Type(T animal_type, T animal_class) {
        this.animal_type = animal_type;
        setAnimalClass(animal_class);
    }

    public T getAnimalType() {
        return animal_type;
    }
}

class Animal_Class<T> {
    private T animal_class;

    protected void setAnimalClass(T animal_class) {
        this.animal_class = animal_class;
    }

    public T getAnimalClass() {
        return animal_class;
    }
}

