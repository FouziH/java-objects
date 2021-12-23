import java.io.Console;

public class Example {
    public static void main(String[] args) {
        Console console = System.console();
        // This is where you write your code....
        System.out.println("We are making a new PEX Dispenser");
        PezDispenser dispenser = new PezDispenser();
        dispenser.characterName ="Darth Vader";
        System.out.printf("This dispenser is %s %n", dispenser.characterName);


        GoKart kart = new GoKart();
        String formatPrint = "This color of the goKart is %s %n";
        System.out.printf( formatPrint , kart.color);
    }

}