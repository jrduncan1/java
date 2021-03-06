import java.util.*;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double orderTotal = 0;
        for(int i = 0; i < prices.length; i++) {
            orderTotal += prices[i];
        }
        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        String menu = "";
        for(int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i);
            System.out.println(i + " - " + item);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        ArrayList<String> customer = customers;
        System.out.println("Please enter your name:"); // 1
        String userName = System.console().readLine(); // 2
        System.out.printf("Hello, %s!", userName); // 3
        System.out.printf("    There are %s people in front of you.", customer.size()); // 4
        customers.add(userName); // 5
        System.out.println(customer); // 5
    }
}