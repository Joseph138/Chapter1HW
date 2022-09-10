package Person;

public class PersonTester {
    public static void main(String [] args){
        Person person1 = new Person();
        //The change the name to Howard Roark
        person1.SetName("Howard Roark");
        //Get the variables from the no-arg constructor
        person1.getAge();
        person1.getEyeColor();
        // Pull the talk method from the Person class into the tester
        person1.talk();
        //From the toString method from the Person class
        System.out.println(person1.toString());
    }


}
