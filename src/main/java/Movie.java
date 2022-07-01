public class Movie implements Items {

    private String name;
    private double price;
    private double duration;
    private double discount;

    public Movie(String name, double price, double duration, double discount) {
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.discount = discount;
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
                ", rewardPoints = " + price * Items.rewardPointMultiplier;
    }
}
