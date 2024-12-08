package org.softwaretechnologies;

import org.softwaretechnologies.animals.*;

public class AnimalFactory {

    /**
     * Метод для создания животных по типу
     * @param name - имя животного
     * @param type - тип животного
     * @return животное, соответствующее каждому из типов.
     */


    public static Animal createAnimal(String name, AnimalType type) {
        /* TODO в зависимости от type создайте и верните нужное животное */
        switch (type){
            case CAT:
                return new Cat(name) {
                    @Override
                    public String sound() {
                        return super.sound();
                    }
                };
            case DOG:
                return new Dog(name) {
                    @Override
                    public String sound() {
                        return super.sound();
                    }
                };
            case COW:
                return new Cow(name) {
                    @Override
                    public String sound() {
                        return super.sound();
                    }
                };
        }

        return null;
    }
}
