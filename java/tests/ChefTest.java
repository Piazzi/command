import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChefTest {

    Chef chef;
    Kitchen kitchen;

    @BeforeEach
    void setUp() {
        chef = new Chef();
        kitchen = new Kitchen( 4);
    }

    @Test
    void shouldOpenKitchen() {
        Order order = new PrepareOrder(kitchen);
        chef.prepareOrder(order);

        assertEquals("Kitchen Opened", kitchen.getStatus());
    }

    @Test
    void shouldCloseKitchen() {
        Order order = new CloseOrder(kitchen);
        chef.prepareOrder(order);

        assertEquals("Kitchen Closed", kitchen.getStatus());
    }

    @Test
    void shouldCancelLastOrder() {
        Order openKitchen = new PrepareOrder(kitchen);
        Order closeKitchen = new CloseOrder(kitchen);

        chef.prepareOrder(openKitchen);
        chef.prepareOrder(closeKitchen);

        chef.cancelLastOrder();

        assertEquals("Kitchen Opened", kitchen.getStatus());
    }

}