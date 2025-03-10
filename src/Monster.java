// Newton Hoang

public class Monster extends Creature {
    private String mode; // "fierce", "timid", "chaotic"

    public Monster(String creatureType, int hitPoints, int attackPoints, int gold, String mode) {
        super(hitPoints, attackPoints, creatureType);
        this.mode = mode;
        this.setGold(gold); // Set gold properly using setter
    }

    @Override
    public String toString() {
        String myReturn = this.getClass().getSimpleName();
        myReturn += " [creatureType=" + this.getCreatureType();
        myReturn += ", hitPoints=" + this.getHitPoints();
        myReturn += ", attackPoints=" + this.getAttackPoints();
        myReturn += ", gold=" + this.getGold();
        myReturn += ", mode=" + this.mode;
        myReturn += ", alive=" + this.isAlive() + "]";
        return myReturn;
    }
}
