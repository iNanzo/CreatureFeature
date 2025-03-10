// Newton Hoang

public class Hero extends Creature {
    private String name;
    private String character;
    private int gold;

    public Hero(String name, String character, int hitPoints, int attackPoints) {
        super(hitPoints, attackPoints, "Hero");
        this.name = name;
        this.character = character;
        this.gold = 0;
    }

    @Override
    public String toString() {
        String myReturn = getClass().getSimpleName();
        myReturn += " [";
        myReturn += "name=" + name;
        myReturn += ", character=" + character;
        myReturn += ", hitPoints=" + getHitPoints();  // Fix: Use getter
        myReturn += ", attackPoints=" + getAttackPoints();
        myReturn += ", gold=" + gold;
        myReturn += ", alive=" + isAlive() + "]";
        return myReturn;
    }
}
