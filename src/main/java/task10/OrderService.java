package task10;

public class OrderService {
    PaymentGateway gateway;

    @Override
    public String toString() {
        return "OrderService{" +
                "gateway=" + gateway +
                '}';
    }

    public OrderService(PaymentGateway gateway) {
        this.gateway = gateway;
    }
}
