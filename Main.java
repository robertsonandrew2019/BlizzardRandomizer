import java.util.Random;
import java.util.Scanner;
public class Main {

    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Class: ");
        String charClass = sc.next(); */
        randomization();
    }
    public static void randomization(){
        double percent1 = rand.nextDouble(); double percent2 = rand.nextDouble();
        double max = Math.max(percent1, percent2); double min = Math.min(percent1, percent2);

        int strength = (int)Math.round(10 + (min * 20));
        int dexterity = (int)Math.round(10 + ((max - min) * 20));
        int intelligence = (int)Math.round(10 + ((1 - max) * 20));

        if(strength + dexterity + intelligence == 50){
            System.out.printf("\nStrength: %d\nDexterity: %d\nIntelligence: %d\n", strength, dexterity, intelligence);
        }
        else{
            randomization();
        }
    }
}
