import java.util.ArrayList;
public class TestOrder {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.47;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.96;
        
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 1.23;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 4.77;

        Order order1 = new Order();
        order1.name = "Cindhuri";

        // Cindhuri's order is now ready. Update her status.
        order1.ready = true;

        Order order2 = new Order();
        order2.name = "Jimmy";

        // Add item1 to order2's item list and increment the order's total
        order2.items.add(item1);
        order2.total += item1.price;

        // Jimmy's order is now ready. Update his status.
        order2.ready = true;


        Order order3 = new Order();
        order3.name = "Noah";

        // order3 ordered a cappucino. Add the cappucino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;


        Order order4 = new Order();
        order4.name = "Sam";

        // order4 added a latte. Update accordingly.
        order4.items.add(item2);

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price * 3);

        System.out.println("Order 2 Total: $" + order2.total);
        System.out.println("Order 3 Total: $" + order3.total);
        System.out.println("Order 4 Total: $" + order4.total);
    }
}
