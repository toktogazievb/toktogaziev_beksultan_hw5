public class Main {
    public static void main(String[] args) {
        Boss myBoss = new Boss();
        myBoss.setHealth(700);
        myBoss.setDamage(50);
        myBoss.setBossDefence("Physical");
        System.out.println("Boss health: " + myBoss.getHealth() + ", damage: " + myBoss.getDamage()
                + ", defence: " + myBoss.getBossDefence());
        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealth() + ", damage: " + hero.getDamage()
                    + ", ability: " + (hero.getheroAbility() == null ? "None" : hero.getheroAbility()));
        }
    }

    public static Hero[] createHeroes() {
        Hero knight = new Hero(350, 35);
        Hero magic = new Hero(300, 10, "Magical");
        Hero golem = new Hero(400, 5, "Stone");
        Hero[] heroes = {knight, magic, golem};
        return heroes;
    }
}

