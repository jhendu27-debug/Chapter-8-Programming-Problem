import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create the Cyber-Dex catalog
        ArrayList<DigitalMonster> cyberDex = new ArrayList<>();

        // Add four monsters
        cyberDex.add(new FlameMonster("Blazemon", 10));
        cyberDex.add(new AquaMonster("Aquamon", 8));
        cyberDex.add(new StormBird("Thunderwing", 15));
        cyberDex.add(new EarthMonster("Terramon", 12));

        // Display monster attacks
        System.out.println("=== Cyber-Dex Monster Attacks ===");

        for (DigitalMonster monster : cyberDex) {
            monster.performAttack();
        }

        // Ability scanner
        System.out.println("\n=== Ability Scanner ===");

        for (DigitalMonster monster : cyberDex) {

            if (monster instanceof Flyable) {

                System.out.println(monster.name +
                        " is capable of flight!");

                ((Flyable) monster).fly();
            }
        }

        // Test electric ability
        System.out.println("\n=== Electric Ability Test ===");

        for (DigitalMonster monster : cyberDex) {

            if (monster instanceof Electric) {
                ((Electric) monster).shock();
            }
        }
    }
}