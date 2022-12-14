import java.util.ArrayList;


public class Order {
    private ArrayList<Food> dishes;
    private int orderNumber;
    private static int totalOrders = 0;
    private String status;

    public Order(ArrayList<Food> dishes) {
        this.dishes = dishes;
        totalOrders++;
        this.orderNumber =totalOrders;
        status = "Placed";
    }
    public Order(){
        totalOrders++;
        this.orderNumber =totalOrders;
        dishes = new ArrayList<>();
        status = "Placed";
    }
    public void setStatus(String s){
        status = s; 
    }

    public String getStatus(){
        return status;
    }

    public ArrayList<Food> getDishes() {
        return dishes;
    }
    public void setDishes(ArrayList<Food> dishes) {
        this.dishes = dishes;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public boolean equals(Order o){
        return orderNumber == o.orderNumber;
    }

    public void addDish(Food f){
        dishes.add(f);

    }

    public void removeDish(Food d){
        dishes.remove(d);
    }

    public double getTotal(){
        int total = 0;
        for(Food f: dishes){
            total += f.getPrice();
        }
        return total; //TODO
    }

    public String[] getPOssibleStatuses(){
        String[] a = {"Created, Done"};
        return a;
    }

    public String toString(){
        return "Order No:"+orderNumber+" Status: "+status+" Number of Dishes:"+dishes.size()+" Total: "+getTotal()+" ";
    }
    
}