package Composition;

public class App {
    public static void main(String[] args) {


        Address dimaaddress = new Address("1200 Hollywood Blvd", "Miami", State.FL, "33021");
        Person dima = new Person(dimaaddress, "Dima", "Bomba", 1970);
        String streetAddress = dima.getAddress().getAddressLine();
        System.out.println(streetAddress);


        House house = new House(dimaaddress, dima,3,3,2021);
        String dimaZip = house.getAddress().getZip();
        System.out.println(dimaZip);

    }
}
