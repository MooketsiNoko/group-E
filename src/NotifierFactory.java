// Factory Pattern - creates the right notifier without the caller knowing the concrete class
public class NotifierFactory {
    public static OrderObserver create(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotifier();
            case "SMS":
                return new SMSNotifier();
            default:
                throw new IllegalArgumentException("Unknown notifier type: " + type);
        }
    }
}
