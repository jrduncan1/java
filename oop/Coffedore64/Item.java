public class Item{
    private String name;
    private double price;
    private int index;

    // constructors
    public Item(String name, double price){
        this.name = name;
        this.price = price;
        this.index = 0;
    }

    // getters
    public String getItemName(){
        return this.name;
    }

    public double getItemPrice(){
        return this.price;
    }

    public int getItemIndex() {
        return this.index;
    }

    // setters
    public void setItemName(String name){
        this.name = name;
    }

    public void setItemPrice(double price){
        this.price = price;
    }

    public void setItemIndex(int newIndex) {
        this.index = newIndex; // *** May not require "this", will confirm in testing ***
    }
}
