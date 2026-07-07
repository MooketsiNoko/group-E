public class ShippedState implements OrderState {
    public void allocate(Order order) {
        System.out.println("Cannot allocate. Order already shipped.");
    }

    public void ship(Order order) {
        System.out.println("Order is already shipped.");
    }

    public void deliver(Order order) {
        System.out.println("Order " + order.getOrderId() + " has been delivered.");
        order.setState(new DeliveredState());
    }

    public String getStateName() {
        return "Shipped";
    }
}
