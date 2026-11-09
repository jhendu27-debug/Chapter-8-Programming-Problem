public class FlameMonster extends DigitalMonster {

    public FlameMonster(String name, int level) {
        super(name, level, "Fire");
    }

    @Override
    public void performAttack() {
        System.out.println(name + " uses Fire Blast! Level: " + level);
    }
}