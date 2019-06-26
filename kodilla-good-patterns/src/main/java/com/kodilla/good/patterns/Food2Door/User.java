package com.kodilla.good.patterns.Food2Door;

public class User {
    private String name;
    private String lastName;
    private int telephoneNumber;
    private String adress;
    private String eMail;

    public User(String name, String lastName, int telephoneNumber, String adress, String eMail) {
        this.name = name;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.adress = adress;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public String geteMail() {
        return eMail;
    }
}
