package dukkan;
import java.util.Scanner; 
/**
 *
 * @author Ammar
 */
public class Dukkan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int price;
        int quantity;
        
        items myitem1 = new items("alwtania" , 300, 500);
        items myitem2 = new items("almoshrf" , 200, 200);
        items myitem3 = new items("alrawdaa" , 100, 400);
        items myitem4 = new items("brkaBisc" , 250, 100);
        items myitem5 = new items("royalBis" , 150, 150);
        
        use_item.add_items(myitem1 );
        use_item.add_items(myitem2 );
        use_item.add_items(myitem3 );
        use_item.add_items(myitem4 );
        use_item.add_items(myitem5 );
        
        System.out.println("How Can We Help You ?(Select The number from 1 to 8 :)");
        System.out.println("1.Add new items to the stock");
        System.out.println("2.Searching about specific item in the supermarket");
        System.out.println("3.Inquiry about price");
        System.out.println("4.Inquiry about the quantity of specific item");
        System.out.println("5.sell items");
        System.out.println("6.buy items");
        System.out.println("7.Report about all items in the system ");
        System.out.println("8.exit the system");
        
        Scanner sc = new Scanner(System.in);
        Scanner forname = new Scanner(System.in);
        int user_input = 1;
        while (user_input != 8) {            
           
            System.out.print("Select Number : ");
            user_input = sc.nextInt();
            
            
            switch (user_input) {
                case 1:
                    System.out.println("Enter New items details :");
                    System.out.print("Name : ");
                    name = forname.nextLine();
                    System.out.print("Price : ");
                    price = sc.nextInt();
                    System.out.print("Quantity : ");
                    quantity = sc.nextInt();
                    items new_item = new items(name, price, quantity);
                    use_item.add_items(new_item);
                    System.out.println("Added");
                    break;
                case 2:
                    System.out.println("Enter Nemae of item to search for :");
                    System.out.print("Name : ");
                    name = forname.nextLine();
                    use_item.find_item(name);
                    break;
                case 3:
                    System.out.println("Enter Nemae of item to search for the price :");
                    System.out.print("Name : ");
                    name = forname.nextLine();
                    use_item.price_of_items(name);
                    break;
                case 4:
                    System.out.println("Enter Nemae of item to search for the quantity :");
                   System.out.print("Name : ");
                    name = forname.nextLine();
                    use_item.quantity_of_items(name);
                    break;
                case 5:
                    System.out.println("Enter details of items to sell :");
                    System.out.print("Name : ");
                    name = forname.nextLine();
                    System.out.print("Quantity : ");
                    quantity = sc.nextInt();
                    use_item.sale_items(name, quantity);
                    break;
                case 6:
                    System.out.println("Enter details of items to buy :");
                    System.out.print("Name : ");
                    name = forname.nextLine();
                    System.out.print("Quantity : ");
                    quantity = sc.nextInt();
                    use_item.buy_items(name, quantity);
                    break;
                case 7:
                    System.out.println("The Current Stock");
                    System.out.println("Name        Price       Quantity");
                    System.out.println("---------------------------------");
                    use_item.all_items();
                    break;
                case 8:
                    System.out.println("Byyyyyyye");
                    break;
                }
        }
    }
}
