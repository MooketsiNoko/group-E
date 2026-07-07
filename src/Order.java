import java.util.ArrayList;
import java.util.List;

// Context class
public class Order {
    private String orderId;
    private OrderState state;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String orderId) {
        this.orderId = orderId;
        this.state = new PendingState();
    }

    public String getOrderId() {
        return orderId;
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void setState(OrderState state) {
        this.state = state;
        notifyObservers();
    }

    public void allocate() {
        state.allocate(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void deliver() {
        state.deliver(this);
    }

    public String getCurrentState() {
        return state.getStateName();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(orderId, state.getStateName());
        }
    }
}
