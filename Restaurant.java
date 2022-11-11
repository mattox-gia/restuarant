import java.util.Scanner;
import java.util.ArrayList;

public class Restaurant {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Food> menu = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

//table = num of people, 
//takeout = prints menu, ask what they want from menu, add those things to the order, create order object and add to list of orders
    public static void main(String[] args) {
        int ans = -1;

        
        while(ans != 0){
            System.out.println("1.) Eat In");
            System.out.println("2.) Place Takeout");
            System.out.println("3.) Place Delivery Order");
            System.out.println("4.) List Orders");
            System.out.println("5.) Update Status");
            System.out.println("0.) Exit");


            System.out.println();
            System.out.println("Choice: ");
            ans = sc.nextInt();
            sc.nextLine();

            if(ans == 1){
                System.out.println("Eat In");
            }

            if(ans == 2){
                System.out.println("Place Takeout");
            }

            if(ans == 3){
                System.out.println("Place Delivery Order");
            }

            if(ans == 4){
                System.out.println("List Orders");
            }

            if(ans == 5){
                System.out.println("Update Status");
            }

            if(ans == 0){
                System.out.println("Exit");
            }
    }

    
    }
    public static String getType(Order o){
        if(o instanceof TakeoutOrder){
            return "Takeout Order";
        }
        else if(o instanceof DeliveryOrder){
            return "Delivery Order";
        }
        else if(o instanceof TableOrder){
            return "Table Order";
        }
        else{
            return "";
        }
    }

    public static ArrayList printMenu(){
        return menu;
    }

    public static ArrayList printOrders(int n){
        return orders;
    }
}
