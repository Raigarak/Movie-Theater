import java.util.List;

public class Payment {

    public Receipt process(Customer customer, List<Item> items) {
        return new Receipt(customer, items);
    }
}
