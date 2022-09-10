package Bike;

public class Bike {
    //The variables for the program
    private int numOfWheels;
    private String manufacturer;
    private int year;
    //no-arg constructor for the variables
    public Bike(){
        this(2,"Schwinn",2014);
    }
    //three-arg constructor in the program
    public Bike(int numOfWheels, String manufacturer, int year){
        this.numOfWheels = numOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }
    //getters and setters method for numOfWheels
    public int getNumOfWheels(){
        return numOfWheels;
    }
    public void setNumOfWheels(int numOfWheels){
        this.numOfWheels = numOfWheels;
    }
    //getters and setters method for manufacturer
    public String getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    //getters and setters methods for the year of release
    public int getYear(){
        return year;
    }
    public void SetYear(int year){
        this.year = year;
    }
    //A method to put into the tester class
    @Override
    public String toString(){
        return "Number of wheels: " + numOfWheels + "\n" + "manufacturer: " + manufacturer + "\n" + "year: " + year;
    }
}
