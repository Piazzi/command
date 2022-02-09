public class PrepareOrder implements Order {

    private Kitchen kitchen;

    public PrepareOrder(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void exec() {
        this.kitchen.open();
    }

    public void cancel() {
        this.kitchen.close();
    }
}
