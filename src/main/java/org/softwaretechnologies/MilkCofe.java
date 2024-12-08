package org.softwaretechnologies;

public class MilkCofe implements CofeInterface  {
    public CofeInterface cofe;
    public MilkCofe(CofeInterface cofe){
        this.cofe = cofe; ///получаем объъект cofe
    }

    @Override
    public int getCost() {
        return cofe.getCost() + 10;
    }

    @Override
    public String description() {
        return cofe.description() + " + milk";
    }
    /**
     * Создайте класс MilkCofe, поддерживающий интерфейс CofeIntrface
     * к стоимости базового напитка добавьте 10.
     * к описанию добавьте " + milk"
     */
}
