package Bike;
import java.util.ArrayList;
public class BikeTester {
    public static void main(String [] args){
        //New variable in the package
        Bike bike1 = new Bike();
        //Print out information from the toString method in the bike class
        System.out.println(bike1.toString());
        Bike bike2 = new Bike();
        //Using the setter methods to change the values of the bike packages
        bike2.setNumOfWheels(4);
        bike2.setManufacturer("Trek");
        bike2.SetYear(2017);
        //print out the new information
        System.out.println(bike2);
        //Making an Arraylist for the bike object
        ArrayList<Object> bikeList = new ArrayList<>();
        //adding the new objects into the bikes Arraylist
        bikeList.add(bike1);
        bikeList.add(bike2);
        //printing the Arraylist
        System.out.println(bikeList);

    }

}
