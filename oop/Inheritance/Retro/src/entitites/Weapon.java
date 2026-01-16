package entitites;

public class Weapon extends Item{
    private Double damage;


    public Weapon(String name, Double price, Double damage) {
        super(name, price);
        this.damage = damage;
    }

    public Double getDamage() {
        return damage;
    }

    public void setDamage(Double damage) {
        this.damage = damage;
    }

    public void sharpen() { damage += 5; }

    @Override
    public void use() {
        System.out.println("You swing the " + getName() + " for " + damage + " damage!");

    }
}
