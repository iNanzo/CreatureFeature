// Newton Hoang

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero", 120, 10, 0, "Rowan Lonestag", "Paladin");
        Monster monster = new Monster("Dragon", 400, 15, 200, "Fierce");

        System.out.println("⚔️ The battle begins! ⚔️");
        System.out.println(hero);
        System.out.println(monster);
        System.out.println("-------------------------------------");

        int round = 1;

        while (hero.isAlive() && monster.isAlive()) {
            System.out.println("🌀 Round " + round + " 🌀");

            // Hero attacks
            int heroDamage = hero.attacks();
            System.out.println(hero.getCreatureType() + " attacks for " + heroDamage + " damage!");
            boolean monsterStillAlive = monster.defends(heroDamage);
            System.out.println(monster);

            if (!monsterStillAlive) {
                System.out.println("🏆 The hero has defeated the monster!");
                break;
            }

            // Monster attacks
            int monsterDamage = monster.attacks();
            System.out.println(monster.getCreatureType() + " attacks for " + monsterDamage + " damage!");
            boolean heroStillAlive = hero.defends(monsterDamage);
            System.out.println(hero);

            if (!heroStillAlive) {
                System.out.println("💀 The monster has defeated the hero!");
                break;
            }

            System.out.println("-------------------------------------");
            round++;
        }

        System.out.println("🏁 The battle is over! 🏁");
    }
}
