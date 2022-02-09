public class CloseOrder implements Order {

    private Kitchen kitchen;

    public CloseOrder(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void exec() {
        this.kitchen.close();
    }

    public void cancel() {
        this.kitchen.open();
    }
}
