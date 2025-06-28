package task10;

public class OrderService {
    private PaymentGateway gateway;
    private int id  = 0;

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderService{" +
                "gateway=" + gateway +
                ", id=" + id +
                '}';
    }

    public OrderService(PaymentGateway gateway) {
        this.gateway = gateway;
    }



}
