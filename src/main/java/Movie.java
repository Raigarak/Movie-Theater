public class Movie extends Item {

    private double duration;

    public Movie(String name, double price, double discount, double duration) {
        super(name, price, discount);
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Movie " +
                "name = " + name +
                ", price = " + price +
                ", duration = " + duration +
                ", discount = " + discount +
                ", rewardPoints = " + price * Item.REWARD_POINT_MULTIPLIER;
    }
}
