public class Beverage implements Items{

    private String name;
    private double price;
    private double discount;

    public Beverage(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Beverage " +
                "name = " + name +
                ", price = " + price +
                ", discount = " + discount +
                ", rewardPoints = " + price * Items.rewardPointMultiplier;
    }
}
