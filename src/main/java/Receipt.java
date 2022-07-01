import java.util.ArrayList;
import java.util.List;

public class Receipt {

    private List<Items> purchasedItems;
    private double totalCostWithDiscount;
    private double totalCostWithDiscountWithoutDiscount;
    private double totalDiscount;
    private double additionalCustomerRewardPoints;
    private double totalItems;
    private Customer customer;

    public Receipt(Customer customer, List<Items> items) {
        this.customer = customer;
        this.purchasedItems = items;

        process();
        if(customer.getBalance() < this.totalCostWithDiscount) {
            throw new IllegalStateException("Your balance of " + customer.getBalance() + " is not enough. " + "It cost: " + totalCostWithDiscount);
        }
    }

    private double getTotalItems() {
        return purchasedItems.size();
    }

    private double gettotalCostWithDiscount() {
         purchasedItems.forEach(
                 i -> totalCostWithDiscount += i.getPrice() - i.getDiscount()
         );
         return totalCostWithDiscount;
    }

    private double getTotalDiscount() {
        purchasedItems.forEach(
                i -> totalDiscount += i.getDiscount()
        );
        return totalDiscount;
    }

    private double getAdditionalCustomerRewardPoints() {
        purchasedItems.forEach(
                i -> additionalCustomerRewardPoints += i.getPrice() * Items.rewardPointMultiplier
        );
        customer.addRewardPoints(additionalCustomerRewardPoints);
        return additionalCustomerRewardPoints;
    }

    private void process() {
        this.totalItems = getTotalItems();
        this.totalCostWithDiscount = gettotalCostWithDiscount();
        this.totalDiscount = getTotalDiscount();
        this.totalCostWithDiscountWithoutDiscount = this.totalCostWithDiscount + this.totalDiscount;
        this.additionalCustomerRewardPoints = getAdditionalCustomerRewardPoints();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        purchasedItems.forEach(
                i -> sb.append(i).append("\n")
        );
        sb.append("Total cost with no discounts: " + this.totalCostWithDiscountWithoutDiscount + " Total Cost: " + this.totalCostWithDiscount + " Total Discount: " + this.totalDiscount + " Total Reward Points: " + this.additionalCustomerRewardPoints);
        return sb.toString();
    }
}