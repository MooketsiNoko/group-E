// Main prototype demo
public class Main {
    public static void main(String[] args) {
        System.out.println("========== ORDER DEMO ==========\n");

        Order order = new Order("ORD-1001");
        order.addObserver(new EmailNotifier());
        order.addObserver(new SMSNotifier());

        System.out.println("-- Happy path: ORD-1001 --");
        UpdateController controller = new UpdateController();
        controller.processOrder(order);

        System.out.println("\n-- Invalid transitions: ORD-1002 --");
        Order orderTwo = new Order("ORD-1002");
        orderTwo.addObserver(new EmailNotifier());
        orderTwo.addObserver(new SMSNotifier());

        System.out.println("Attempting to ship before allocating...");
        orderTwo.ship();          // blocked: must allocate first

        System.out.println("Attempting to deliver before shipping...");
        orderTwo.deliver();       // blocked: must ship first

        System.out.println("Now allocating, shipping, delivering correctly...");
        orderTwo.allocate();
        orderTwo.ship();
        orderTwo.deliver();

        System.out.println("\nFinal state of ORD-1001: " + order.getCurrentState());
        System.out.println("Final state of ORD-1002: " + orderTwo.getCurrentState());
        System.out.println("\n========== DEMO COMPLETE ==========");
    }
}
