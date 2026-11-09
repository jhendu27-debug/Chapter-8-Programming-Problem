public abstract class DigitalMonster {

    protected String name;
    protected int level;
    protected String element;

    public DigitalMonster(String name, int level, String element) {
        this.name = name;
        this.level = level;
        this.element = element;
    }

    public abstract void performAttack();
}