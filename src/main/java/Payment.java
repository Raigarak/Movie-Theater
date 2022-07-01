import java.util.List;

public class Payment {

    public Receipt process(Customer customer, List<Items> items) {
        return new Receipt(customer, items);
    }
}
