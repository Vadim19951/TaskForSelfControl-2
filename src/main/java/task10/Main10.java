package task10;

/*
10
Dependency Injection (лайт)

Класс OrderService принимает в конструкторе PaymentGateway gateway.
В main создайте OrderService и передайте туда new PaypalGateway().


10) FIX - нет модификатора доступа
FIX - PaypalGateway принимает id в конструкторе, хотя в задании это не требовалось
FIX - Отсутствует какая-либо бизнес-логика, демонстрирующая использование внедренной зависимости

 */


public class Main10 {
    public static void main(String[] args) {

        PaypalGateway paypalGateway = new PaypalGateway();
        OrderService orderService = new OrderService(paypalGateway);
        initOrder(orderService);

    }

    public static void initOrder(OrderService order){
        order.setId(GeneratrId.INSTANCE.generate());
        System.out.println(order);
    }

}
