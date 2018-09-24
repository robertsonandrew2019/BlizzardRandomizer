import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Random rand = new Random();
        Scanner s = new Scanner(System.in);

        System.out.print("Name: ");
        String name = s.next();
        System.out.print("Class: ");
        String charClass = s.next();

        int utility = 17;
        int strengthRand = rand.nextInt(17);
        utility = 17 - strengthRand;
        int dexterityRand = rand.nextInt(utility);
        utility = utility - dexterityRand;
        int intelligenceRand = utility;

        int strength = 11 + strengthRand;
        int dexterity = 11 + dexterityRand;
        int intelligence = 11 + intelligenceRand;

        System.out.println();
        System.out.println("Attributes");
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);


    }
}
