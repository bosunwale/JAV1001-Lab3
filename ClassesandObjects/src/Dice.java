import java.util.Random;

public class Dice {
    private int countSides;
    private Random generateRandomNumber;
    private String diceName;
    private int currentSideUp;

    /*
    In the below code, there are three
    constructors, first constructor has
    no argument, second constructor has
    one argument, and the third constructor
    has two arguments. These constructors are
    used to set the internal state of the object
    and perform necessary initialization
     */

    //First Constructor
    public Dice(){
        countSides = 6;
        this.diceName="d6";
        generateRandomNumber = new Random();
        currentSideUp = RollDice();
    }
    //Second Constructor
    public Dice(int numberOfSidesCount){
        this.countSides = numberOfSidesCount;
        this.diceName="d8";
        generateRandomNumber = new Random();
        currentSideUp = RollDice();
    }
    //Third Constructor
    public Dice(int secondNumberOfSidesCount, String name){
        this.countSides = secondNumberOfSidesCount;
        this.diceName = name;
        generateRandomNumber = new Random();
        currentSideUp = RollDice();
    }
    //getter method to return number of count sides
    public int getCountSides(){
        return countSides;
    }
    /*Roll method that generates a random number from
    one to the number of specified dice sides
     */
    public int RollDice(){
        currentSideUp = generateRandomNumber.nextInt(countSides) + 1;
        return currentSideUp;
    }

    //Override the toString() Method
    public String toString(){
        return "Rolling "+ diceName+ " with "+ countSides +" sides";
    }
    public String CurrentSideUp(){
        return "The current side that is up is for "+ diceName+ " dice is: " + currentSideUp;
    }
}
