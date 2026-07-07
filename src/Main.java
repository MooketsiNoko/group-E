// Main prototype demo
public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD-1001");

        order.addObserver(new EmailNotifier());
        order.addObserver(new SMSNotifier());

        UpdateController controller = new UpdateController();
        controller.processOrder(order);
    }
}
