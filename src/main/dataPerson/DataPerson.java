package main.dataPerson;

public class DataPerson {
    private String name;
    private String surname;
    private String patronymic;
    private String phoneNumber;
    private String email;
    private String deliveryAddress;

    public DataPerson(String name, String surname, String patronymic, String phoneNumber, String email, String deliveryAddress) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
    }
}
