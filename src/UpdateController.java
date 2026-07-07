// Controller class
public class UpdateController {
    public void processOrder(Order order) {
        System.out.println("\nStarting order: " + order.getOrderId());
        System.out.println("Current state: " + order.getCurrentState());

        order.allocate();
        order.ship();
        order.deliver();

        System.out.println("Final state: " + order.getCurrentState());
    }
}
