import java.util.*;

public class Order{
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    // constructors
    public Order(){
        this.name = "Guest";
        this.items.clear();
    }

    public Order(String name){
        this.name = name;
    }

    // getters
    public String getOrderName(){
        return this.name;
    }

    public boolean getOrderReady(){
        return this.ready;
    }

    public ArrayList<Item> getOrderItems(){
        return this.items;
    }

    // setters
    public void setOrderName(String name){
        this.name = name;
    }

    public void setOrderReady(boolean ready){
        this.ready = ready;
    }

    public void setOrderItems(ArrayList<Item> items){
        this.items = items;
    }

    // methods
    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0;
        ArrayList<Item> prices = getOrderItems();
        for(int i = 0; i < prices.size(); i++){
            total += prices.get(i).getItemPrice();
        }
        return total;
    }

    public void displayOrder(){
        System.out.println("Customer Name: " + this.name);
        for(Item i : items){
            System.out.println(i.getItemName() + " - $" + i.getItemPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
        System.out.println("***End of order. Thank you for choosing Cafe Dojo.***");
    }
}