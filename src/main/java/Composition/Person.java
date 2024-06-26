package Composition;

public class Person {
    private Address address;
    private  String name;
    private String lastname;
    private int year;

    public Person(Address adress, String name, String lastname, int year) {
        this.address = adress;
        this.name = name;
        this.lastname = lastname;
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
