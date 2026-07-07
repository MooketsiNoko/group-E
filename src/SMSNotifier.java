public class SMSNotifier implements OrderObserver {
    public void update(String orderId, String newState) {
        System.out.println("SMS: Order " + orderId + " is now " + newState);
    }
}
