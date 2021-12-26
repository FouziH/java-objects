import java.io.Console;
import java.io.File;

public class Example {
    public static void main(String[] args) {
        Console console = System.console();
        // This is where you write your code....
        System.out.println("We are making a new PEX Dispenser");
        System.out.printf("Fun Fact: There are %d Pez allowed in every dispenser %n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Donatello");

        if (dispenser.isEmpty()) {
            System.out.println("The dispenser is empty");
        }

        System.out.printf("filling dispenser with delicious PEZ....%n");
        dispenser.fill();

        if (!dispenser.isEmpty()) {
            System.out.println("The dispenser is not empty.");
        }
        // dispenser.characterName ="Darth Vader";
        System.out.printf("This dispenser is %s %n", dispenser.getCharacterName());

        while (dispenser.dispense()) {
            System.out.println("Chomp!");
        }
        dispenser.fill(4);
        dispenser.fill(2);
        while (dispenser.dispense()) {
            System.out.println("Chomp!!");
        }

        try {
            dispenser.fill(400);
            System.out.println("This will never happen");

        } catch (IllegalArgumentException iae) {
            System.out.println("Whoa there!");
             System.out.printf("There error was %s", iae.getMessage());
        }

        if (dispenser.isEmpty()) {
            System.out.println("Ate all the penz");
        }
        // GoKart kart = new GoKart("red");
        // // kart.color = "grey";
        // String formatPrint = "This color of the goKart is %s %n";
        // System.out.printf( formatPrint , kart.getGoKart());
    }

}