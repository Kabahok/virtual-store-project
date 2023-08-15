package order;

import dataPerson.DataPerson;

public class Order {
    private int id;
    private DataPerson dataPerson;

    public Order(int id, DataPerson dataPerson) {
        this.id = id;
        this.dataPerson = dataPerson;
    }
}
