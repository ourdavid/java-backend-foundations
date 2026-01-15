package introduction.product.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return this.price * this.quantity;
    }

    public void addProducts(int quantity){
        if(quantity > 0 ){
            this.quantity += quantity;
        }else{
            System.out.println("Value not accept");
        }
    }
    public void removeProducts(int quantity){
        if(quantity > 0 ){
            this.quantity -= quantity;
        }else{
            System.out.println("Value not accept");
        }
    }

    public String toString(){
        return name
                + ", $ "
                + price
                + ", Quantity: "
                + quantity
                + ", Total value in stock: "
                + totalValueInStock();
    }


}
