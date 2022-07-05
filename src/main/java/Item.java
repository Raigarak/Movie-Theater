public abstract class Item {
    public static final double REWARD_POINT_MULTIPLIER = 10;
    protected String name;
    protected double price;
    protected double discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    protected abstract double getDiscount();
    protected abstract double getPrice();
}
