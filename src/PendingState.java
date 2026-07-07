public class PendingState implements OrderState {
    public void allocate(Order order) {
        System.out.println("Inventory allocated for order " + order.getOrderId());
        order.setState(new AllocatedState());
    }

    public void ship(Order order) {
        System.out.println("Cannot ship. Order must be allocated first.");
    }

    public void deliver(Order order) {
        System.out.println("Cannot deliver. Order has not shipped yet.");
    }

    public String getStateName() {
        return "Pending";
    }
}
