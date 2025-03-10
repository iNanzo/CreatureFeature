// Newton Hoang

public class Hero extends Creature {
    private String name;
    private String character; // Class type like "Barbarian", "Wizard"

    public Hero(String creatureType, int hitPoints, int attackPoints, int gold, String name, String character) {
        super(hitPoints, attackPoints, creatureType);
        this.name = name;
        this.character = character;
        this.setGold(gold); // Now works because setGold() exists in Creature
    }

    @Override
    public String toString() {
        String myReturn = this.getClass().getSimpleName();
        myReturn += " [creatureType=" + this.getCreatureType();
        myReturn += ", hitPoints=" + this.getHitPoints();
        myReturn += ", attackPoints=" + this.getAttackPoints();
        myReturn += ", gold=" + this.getGold();
        myReturn += ", name=" + this.name;
        myReturn += ", character=" + this.character;
        myReturn += ", alive=" + this.isAlive() + "]";
        return myReturn;
    }
}
