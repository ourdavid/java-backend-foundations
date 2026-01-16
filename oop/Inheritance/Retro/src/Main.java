import entitites.Item;
import entitites.Player;
import entitites.Potion;
import entitites.Weapon;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("David",100,1000);

        p1.buy(new Potion("Potion Heal",10.00,100));
        p1.buy(new Potion("Poison",40.00,100));
        p1.buy(new Weapon("Magic Sword", 50.00,100.00));

        for (Item item : p1.getInventory()){
            System.out.println(item.getName());
        }

        for (Item item : p1.getInventory()) {
            item.use();
            if(item instanceof Weapon){
                Weapon weapon = (Weapon) item;
                weapon.sharpen();
                System.out.println(weapon.getDamage());
            }
        }

    }
}
