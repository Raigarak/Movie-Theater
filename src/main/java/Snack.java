public class Snack extends Item{

    public Snack(String name, double price, double discount) {
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
        return "Snack " +
                "name = " + name +
                ", price= " + price +
                ", discount= " + discount +
                ", rewardPoints= " + price * Item.REWARD_POINT_MULTIPLIER;

    }
}
