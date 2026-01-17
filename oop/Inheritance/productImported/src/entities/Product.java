package entities;

public class Product {
    private String name;
    protected Double price;


    public Product(String name, double price){
        this.name = name;
        this.price = price;
    };


    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public String priceTag(){
        return getName() + " $ " +getPrice();
    }
}
