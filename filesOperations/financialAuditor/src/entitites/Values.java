package entitites;

import java.time.LocalDate;

public class Values {
    private String date;
    private String description;
    private Double amount;

    public Values(String date, String description, Double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }


    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Date: " + date +
                " | Description: " + description +
                " | Amount: $" + String.format("%.2f", amount);
    }


}
