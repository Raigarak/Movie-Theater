import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer gary = new Customer("Gary", 555);

        List<Item> purchaseItems = List.of(
                new Movie("Avengers", 50, 20, 20),
                new Snack("Doritios", 15,1),
                new Snack("Pretzel", 10,8),
                new Beverage("Coke Zero",2,0),
                new Beverage("Sprite",2,0.50)
        );

        Receipt garyReceipt = new Payment().process(gary, purchaseItems);

        System.out.println(garyReceipt);

        // Output
        /*
        Movie name = Avengers, price = 50.0, duration = 20.0, discount = 20.0, rewardPoints = 500.0
        Snack name = Doritios, price= 15.0, discount= 1.0, rewardPoints= 150.0
        Snack name = Pretzel, price= 10.0, discount= 8.0, rewardPoints= 100.0
        Beverage name = Coke Zero, price = 2.0, discount = 0.0, rewardPoints = 20.0
        Beverage name = Sprite, price = 2.0, discount = 0.5, rewardPoints = 20.0
        Total cost with no discounts: 79.0 Total Cost: 49.5 Total Discount: 29.5 Total Reward Points: 495.0
        */
    }
}
