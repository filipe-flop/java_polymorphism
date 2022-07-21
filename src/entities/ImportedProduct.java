package entities;

public class ImportedProduct  extends Product {

    private Double customsFee;

    public ImportedProduct(){
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.getName() + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")";
    }

    public double totalPrice(){
        return super.getPrice() + customsFee;
    }
}
