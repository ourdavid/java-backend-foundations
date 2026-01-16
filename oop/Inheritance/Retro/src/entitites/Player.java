package entitites;


import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private double gold;
    private double xp;

    private List<Item> inventory = new ArrayList<>();

    public Player(String name, double gold, double xp) {
        this.name = name;
        this.gold = gold;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void buy(Item item){
        if (gold >= item.getPrice()){
            gold -= item.getPrice();
            inventory.add(item);
        }else{
            System.out.println("Not enough gold");
        }

    }
}
