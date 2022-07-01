public class Customer {

    private String name;
    private double balance;
    private double customerRewardPoints;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void addRewardPoints(double rewardPoints) {
        this.customerRewardPoints += rewardPoints;
    }

    public double getCustomerRewardPoints() {
        return customerRewardPoints;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
