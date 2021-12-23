import java.io.Console;

public class Example {
    public static void main(String[] args) {
        Console console = System.console();
        // This is where you write your code....
        System.out.println("We are making a new PEX Dispenser");
        System.out.printf("Fun Fact: There are %d Pez allowed in every dispenser %n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Donatello");
        // dispenser.characterName ="Darth Vader";
        System.out.printf("This dispenser is %s %n", dispenser.getCharacterName());


        GoKart kart = new GoKart("red");
        // kart.color = "grey";
        String formatPrint = "This color of the goKart is %s %n";
        System.out.printf( formatPrint , kart.getGoKart());
    }

}