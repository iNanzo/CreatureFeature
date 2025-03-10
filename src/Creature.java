// Newton Hoang

public abstract class Creature {
    private int hitPoints;
    private int attackPoints;
    private boolean alive;
    private String creatureType;

    public Creature(int hitPoints, int attackPoints, String creatureType) {
        this.hitPoints = hitPoints;
        this.attackPoints = attackPoints;
        this.alive = true;
        this.creatureType = creatureType;
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

    public void takeDamage(int damage) {
        hitPoints -= damage;
        if (hitPoints <= 0) {
            hitPoints = 0;
            alive = false;
        }
    }

    public abstract String toString();
}
