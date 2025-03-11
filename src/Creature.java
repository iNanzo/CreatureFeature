// Newton Hoang

import java.util.Random;

public abstract class Creature {
    private int hitPoints;
    private int attackPoints;
    private boolean alive;
    private String creatureType;
    private int gold;

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

    public void setGold(int gold) {
        this.gold = gold;
    }

    // Generates random attack damage (between 1 and attackPoints)
    public int attacks() {
        Random rand = new Random();
        return rand.nextInt(attackPoints) + 1;
    }

    // Calls assessDamage() to update hitPoints and return alive status
    public boolean defends(int damage) {
        assessDamage(damage);
        return alive;
    }

    // New assessDamage() method that ensures HP does not go below zero
    private void assessDamage(int damage) {
        hitPoints -= damage;
        if (hitPoints <= 0) {
            hitPoints = 0;
            alive = false;
        }
    }

    public abstract String toString();
}
