package Inharitage;

public class App {
    public static void main(String[] args){

        Car myCar = new Car("Omega", "Opel", 2000, Color.red);

//        myCar.start(myCar.getBrand());
        myCar.start(myCar.brand);
        myCar.stop();
        myCar.move();
        myCar.total();
        myCar.inf();
        myCar.start();
        System.out.println("<<<<<<<Bike>>>>>>>>>>>");

        Bicycle myBike = new Bicycle(" Marlin 4 ", " Trek ",2021, Color.green);

        myBike.start();
        myBike.stop();
        myBike.move();
        myBike.myBike();
        myBike.start(myBike.brand + myBike.model);
        myBike.breake();
    }



}
