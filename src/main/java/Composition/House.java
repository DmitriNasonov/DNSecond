package Composition;

public class House {
    private Address address;
    private Person owner;
    private int bedroom;
    private int bathroom;
    private int year;

    public House(Address address, Person owner, int bedroom, int bathroom, int year) {
        this.address = address;
        this.owner = owner;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
