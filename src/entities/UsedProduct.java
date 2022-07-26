package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufacturedDate;

    public UsedProduct(){
    }

    public UsedProduct(String name, Double price, Date manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag(){
        return super.getName() + " (used) $ " + super.getPrice() + " (Manufactured date: " + sdf.format(manufacturedDate) + ")";
    }
}
