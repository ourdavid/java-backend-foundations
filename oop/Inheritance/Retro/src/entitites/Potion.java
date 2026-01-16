package entitites;

public class Potion extends Item{
    double healing;

    public Potion(String name, Double price, double healing) {
        super(name, price);
        this.healing = healing;
    }

    public double getHealing() {
        return healing;
    }

    public void setHealing(double healing) {
        this.healing = healing;
    }

    @Override
    public void use() {
        System.out.println("You drink the " + getName() + " and heal for " + healing + " HP!");
    }
}
