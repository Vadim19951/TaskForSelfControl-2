package task10;

/*
10
Dependency Injection (лайт)

Класс OrderService принимает в конструкторе PaymentGateway gateway.
В main создайте OrderService и передайте туда new PaypalGateway().

 */


public class Main10 {
    public static void main(String[] args) {

        PaypalGateway paypalGateway = new PaypalGateway(1);

        OrderService orderService = new OrderService(paypalGateway);

        System.out.println(orderService);
    }

}
