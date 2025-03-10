// Newton Hoang

public class Monster extends Creature {
    private String mode; // "fierce", "timid", "chaotic"

    public Monster(String mode, int hitPoints, int attackPoints) {
        super(hitPoints, attackPoints, "Monster");
        this.mode = mode;
    }

    @Override
    public String toString() {
        String myReturn = getClass().getSimpleName();
        myReturn += " [";
        myReturn += "mode=" + mode;
        myReturn += ", hitPoints=" + getHitPoints();
        myReturn += ", attackPoints=" + getAttackPoints();
        myReturn += ", alive=" + isAlive() + "]";
        return myReturn;
    }
}
