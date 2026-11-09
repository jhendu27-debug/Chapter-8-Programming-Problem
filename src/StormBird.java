public class StormBird extends DigitalMonster implements Flyable, Electric {

    public StormBird(String name, int level) {
        super(name, level, "Electric");
    }

    @Override
    public void performAttack() {
        System.out.println(name + " uses Thunder Strike! Level: " + level);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying through the digital sky!");
    }

    @Override
    public void shock() {
        System.out.println(name + " releases an electric shock!");
    }
}