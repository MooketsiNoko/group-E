public class EmailNotifier implements OrderObserver {
    public void update(String orderId, String newState) {
        System.out.println("Email: Order " + orderId + " is now " + newState);
    }
}
