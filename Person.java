package Person;

public class Person {
    //The data types
    private String name;
    private int age;
    private String eyeColor;
    //no-arg constructor
    public Person(){
        this("Joseph",20,"brown");
    }
    //3-arg constructor
    public Person(String name, int age, String eyeColor){
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }
    //getter and setter methods for the name variable
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name = name;
    }
    //getter and setter methods for the age variable
    public int getAge(){
        return age;
    }
    public void SetAge(int age){
        this.age = age;
    }
    //getter and setter methods for the eye color variable
    public String getEyeColor(){
        return eyeColor;
    }
    public void SetEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
    //A method to print out the information throughout the class
    public void talk(){
        System.out.println("Welcome, coders! I am " + name);
        System.out.println("Age: " + age);
        System.out.println("Eye color: " + eyeColor);
    }
    //A toString method for the class
    @Override
    public String toString(){
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Eye color: " + eyeColor;
    }

}
