// Newton Hoang

public abstract class Creature {
    private int hitPoints;
    private int attackPoints;
    private boolean alive;
    private String creatureType;
    private int gold; // Add gold property

    public Creature(int hitPoints, int attackPoints, String creatureType) {
        this.hitPoints = hitPoints;
        this.attackPoints = attackPoints;
        this.alive = true;
        this.creatureType = creatureType;
        this.gold = 0; // Default gold amount
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public boolean isAlive() {
        return alive;
    }

    public String getCreatureType() {
        return creatureType;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) { // Fix: Add setGold() method
        this.gold = gold;
    }

    public abstract String toString();
}
