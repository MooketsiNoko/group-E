public class AllocatedState implements OrderState {
    public void allocate(Order order) {
        System.out.println("Order is already allocated.");
    }

    public void ship(Order order) {
        System.out.println("Order " + order.getOrderId() + " has shipped.");
        order.setState(new ShippedState());
    }

    public void deliver(Order order) {
        System.out.println("Cannot deliver. Order has not shipped yet.");
    }

    public String getStateName() {
        return "Allocated";
    }
}
