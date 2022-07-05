import java.util.ArrayList;
import java.util.List;

public class Receipt {

    private List<Item> purchasedItems;
    private double totalCostWithDiscount;
    private double totalCostWithoutDiscount;
    private double totalDiscount;
    private double additionalCustomerRewardPoints;
    private Customer customer;

    public Receipt(Customer customer, List<Item> items) {
        this.customer = customer;
        this.purchasedItems = items;

        process();
        if(customer.getBalance() < this.totalCostWithDiscount) {
            throw new IllegalStateException("Your balance of " + customer.getBalance() + " is not enough. " + "It cost: " + totalCostWithDiscount);
        }
    }

    private double getTotalCostWithoutDiscount() {
        purchasedItems.forEach(
                i -> totalCostWithoutDiscount += i.getPrice()
        );
        return totalCostWithoutDiscount;
    }

    private double getTotalCostWithDiscount() {
         return this.totalCostWithoutDiscount - this.totalDiscount;
    }

    private double getTotalDiscount() {
        purchasedItems.forEach(
                i -> totalDiscount += i.getDiscount()
        );
        return totalDiscount;
    }

    private double getAdditionalCustomerRewardPoints() {
        return totalCostWithDiscount * Item.REWARD_POINT_MULTIPLIER;
    }

    private void process() {
        this.totalDiscount = getTotalDiscount();
        this.totalCostWithoutDiscount = getTotalCostWithoutDiscount();
        this.totalCostWithDiscount = getTotalCostWithDiscount();
        this.additionalCustomerRewardPoints = getAdditionalCustomerRewardPoints();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        purchasedItems.forEach(
                i -> sb.append(i).append("\n")
        );
        sb.append("Total cost with no discounts: " + this.totalCostWithoutDiscount + " Total Cost: " + this.totalCostWithDiscount + " Total Discount: " + this.totalDiscount + " Total Reward Points: " + this.additionalCustomerRewardPoints);
        return sb.toString();
    }
}
