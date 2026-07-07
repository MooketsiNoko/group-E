public class DeliveredState implements OrderState {
    public void allocate(Order order) {
        System.out.println("Cannot allocate. Order already delivered.");
    }

    public void ship(Order order) {
        System.out.println("Cannot ship. Order already delivered.");
    }

    public void deliver(Order order) {
        System.out.println("Order is already delivered.");
    }

    public String getStateName() {
        return "Delivered";
    }
}
