import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Items item1 = new Items();
        item1.name = "mocha";
        item1.price = 3.47;

        Items item2 = new Items();
        item2.name = "latte";
        item2.price = 3.96;
        
        Items item3 = new Items();
        item3.name = "drip coffee";
        item3.price = 1.23;

        Items item4 = new Items();
        item4.name = "capuccino";
        item4.price = 4.77;

        Orders order1 = new Orders();
        order1.name = "Cindhuri";
        order1.ready = true;

        Orders order2 = new Orders();
        order2.name = "Jimmy";
        order2.items.add(item1);
        order2.total += item1.price;
        order2.ready = true;
        System.out.println("Order 2 Total: $" + order2.total);

        Orders order3 = new Orders();
        order3.name = "Noah";
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println("Order 3 Total: $" + order2.total);

        Orders order4 = new Orders();
        order4.name = "Sam";
        order4.items.add(item2);
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price * 3);
        System.out.println("Order 4 Total: $" + order4.total);
    }
}
