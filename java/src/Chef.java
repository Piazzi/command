import java.util.ArrayList;
import java.util.List;

public class Chef {

    private List<Order> orders = new ArrayList<Order>();

    public void prepareOrder(Order order) {
        this.orders.add(order);
        order.exec();
    }

    public void cancelLastOrder() {
        if (orders.size() != 0) {
            Order order = this.orders.get(this.orders.size() - 1);
            order.cancel();
            this.orders.remove(this.orders.size() - 1);
        }
    }

}
