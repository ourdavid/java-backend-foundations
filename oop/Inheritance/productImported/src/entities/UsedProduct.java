package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate ;

    public UsedProduct(String name, double price, LocalDate manucfactureDate) {
        super(name, price);
        this.manufactureDate = manucfactureDate;
    }


    public LocalDate getManucfactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + manufactureDate.format(fmt)
                + ")";
    }
}
