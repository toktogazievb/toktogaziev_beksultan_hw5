public class Hero {
    private int health;
    private int damage;
    private String heroAbility;


    public Hero( int health, int damage,String ability) {
        this.health = health;
        this.damage = damage;
        this.heroAbility = ability;

    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public String getheroAbility() {
        return heroAbility;
    }

    public int getDamage() {
        return damage;
    }
}