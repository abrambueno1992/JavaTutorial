import java.util.Scanner;
import java.util.*;
public class Animal {
    public static final double FAVNUMBER = 1.6180;
    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner userInput = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;

        this.uniqueID = minNumber + (long) (Math.random()* ((maxNumber - minNumber) + 1 ));

        String stringNumber = Long.toString(maxNumber);
        int numberString = Integer.parseInt(stringNumber);
        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    public void setFavoriteColor(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }

    public void setFavoriteColor() {
        int randomNumber = (int) (Math.random() * 126) + 1;

        this.favoriteChar = (char) randomNumber;

        if (randomNumber == 32) {
            System.out.println("Favorite character set to Space");
        } else if (favoriteChar == 10) {
            System.out.println("Favorite character set to Newline");
        } else {
            System.out.println("Favorite character set to " + this.favoriteChar);
        }

        if (((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
            System.out.println("Favorite character is a letter");
        }

        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

        switch (randomNumber) {
            case 8:
                System.out.println("Favorite character set to backspace");
                break;
            case 10:
                System.out.println("Favorite character set to backspace");
                break;
            case 11:
                System.out.println("Favorite character set to backspace");
                break;
            case 12:
                System.out.println("Favorite character set to backspace");
                break;
                default:
                    System.out.println();
                    break;
        }

    }

    public Animal() {
        numberOfAnimals++;

        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers);

        int diffOfNumbers = 5 - 1;
        System.out.println("5 - 1 = " + diffOfNumbers);

        int multOfNumbers = 5 * 1;
        System.out.println("5 * 1 = " + multOfNumbers);

        int divOfNumbers = 5 / 1;
        System.out.println("5 / 1 = " + divOfNumbers);

        int modOfNumbers = 5 % 3;
        System.out.println("5 % 3 = " + modOfNumbers);

        System.out.print("Enter the name: \n");

        if(userInput.hasNextLine()) {
            this.setName(userInput.nextLine());
        }
        this.setFavoriteColor();
        this.setUniqueID();

    }

        public static void main(String[] args) {
        Animal theAnimal = new Animal();

    }
}
