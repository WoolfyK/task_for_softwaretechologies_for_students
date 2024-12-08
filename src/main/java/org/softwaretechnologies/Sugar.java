package org.softwaretechnologies;

public class Sugar implements CofeInterface {
    public CofeInterface cofe;
    public Sugar(CofeInterface cofe){
        this.cofe = cofe; ///получаем объъект cofe
    }

    @Override
    public int getCost() {
        return cofe.getCost() + 20;
    }

    @Override
    public String description() {
        return cofe.description() + " + sugar";
    }
    /**
     * Создайте класс MilkCofe, поддерживающий интерфейс CofeIntrface
     * к стоимости базового напитка добавьте 20.
     * к описанию добавьте " + sugar"
     */
}
