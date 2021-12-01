import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 3.47);
        Item item2 = new Item("latte", 3.96);
        Item item3 = new Item("drip coffee", 1.23);
        Item item4 = new Item("cappuccino", 4.77);

        // **Create 2 orders for unspecified guests**
        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item1);
        order1.addItem(item3);
        order1.setOrderReady(false);
        // System.out.println(order1.getOrderTotal());
        System.out.println(order1.getStatusMessage());
        order1.displayOrder();

        Order order2 = new Order();
        order2.addItem(item2);
        order2.addItem(item1);
        order2.addItem(item3);
        order2.addItem(item4);
        order2.setOrderReady(true);
        System.out.println(order2.getStatusMessage());
        order2.displayOrder();

        // **Create 3 orders using the overloaded constructor**
        Order order3 = new Order("Jake");
        order3.addItem(item4);
        order3.addItem(item4);
        order3.addItem(item1);
        order3.setOrderReady(true);
        System.out.println(order3.getStatusMessage());
        order3.displayOrder();

        Order order4 = new Order("Steve");
        order4.addItem(item2);
        order4.addItem(item1);
        order4.addItem(item1);
        order4.addItem(item3);
        order4.setOrderReady(false);
        System.out.println(order4.getStatusMessage());
        order4.displayOrder();

        Order order5 = new Order("Bobby");
        order5.addItem(item4);
        order5.addItem(item1);
        order5.setOrderReady(true);
        System.out.println(order5.getStatusMessage());
        order5.displayOrder();
    }
}