// State Pattern
public interface OrderState {
    void allocate(Order order);
    void ship(Order order);
    void deliver(Order order);
    String getStateName();
}
