public class Item{
    private String name;
    private double price;

    // constructors
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    // getters
    public String getItemName(){
        return this.name;
    }

    public double getItemPrice(){
        return this.price;
    }

    // setters
    public void setItemName(String name){
        this.name = name;
    }

    public void setItemPrice(double price){
        this.price = price;
    }
}
