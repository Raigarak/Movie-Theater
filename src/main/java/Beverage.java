public class Beverage extends Item{


    public Beverage(String name, double price, double discount) {
        super(name, price, discount);
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
                ", rewardPoints = " + price * Item.REWARD_POINT_MULTIPLIER;
    }
}
