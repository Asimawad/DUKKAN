/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dukkan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
/**
 *
 * @author Ammar
 */
public class use_item {
    static List<items> stock = new ArrayList<>();
    
    static void add_items(items item) {
        stock.add(item);
    }
    
    
    static void find_item (String name){
        boolean  missing = true;
        for (int counter = 0; counter < stock.size(); counter++) {
            items iteritem = stock.get(counter);
            if (iteritem.item_name.equalsIgnoreCase(name)){
                missing = false;
                System.out.println("Itme found! details :");
                System.out.println("Name : " + iteritem.item_name );   
            }
        } 
        if (missing){
            System.out.println("Item Not Found");
        }        
    }
    
    static void price_of_items (String name){
        boolean  missing = true;
        for (int counter = 0; counter < stock.size(); counter++) {
            items iteritem = stock.get(counter);
            if (iteritem.item_name.equalsIgnoreCase(name)){
                missing = false;
                System.out.println("Itme found! Price :");
                System.out.println("Price : " + iteritem.item_price);   
            }
        } 
        if (missing){
            System.out.println("Item Not Found");
        }
    }
    
    static void quantity_of_items (String name){
        boolean  missing = true;
        for (int counter = 0; counter < stock.size(); counter++) {
            items iteritem = stock.get(counter);
            if (iteritem.item_name.equalsIgnoreCase(name)){
                missing = false;
                System.out.println("Itme found! Quantity :");
                System.out.println("Quantity : " + iteritem.item_quantity);   
            }
        } 
        if (missing){
            System.out.println("Item Not Found");
        }
    }
    
    static void sale_items (String name , int quantity){
        boolean  missing = true;
        for (int counter = 0; counter < stock.size(); counter++) {
            items iteritem = stock.get(counter);
            if (iteritem.item_name.equalsIgnoreCase(name)){
                missing = false;
                if (quantity < iteritem.item_quantity){
                    System.out.println("Sale Succecful");
                    System.out.println("old quantity : " +iteritem.item_quantity );
                    iteritem.item_quantity = iteritem.item_quantity - quantity;
                    System.out.println("new quantity : " +iteritem.item_quantity );
                    
                }else{
                    System.out.println("Not enough Quantity");
                    System.out.println("available : " + iteritem.item_quantity);
                    System.out.println("required : " + quantity);
                }
            }
        } 
        if (missing){
            System.out.println("Item Not Found");
        }
    }
    
    
    static void buy_items (String name , int quantity){
        boolean missing = true;
        for (int counter = 0; counter < stock.size(); counter++) {
            items iteritem = stock.get(counter);
            if (iteritem.item_name.equalsIgnoreCase(name)){
                missing = false;
                System.out.println("Item alredy exits and will add to existing quantitiy");
                System.out.println("old quantity : " +iteritem.item_quantity );
                iteritem.item_quantity = iteritem.item_quantity + quantity;
                System.out.println("new quantity : " +iteritem.item_quantity );
            }
        } 
        if (missing){
            Scanner sc = new Scanner(System.in);
            System.out.println("Will add new item to the list , please enter price ...");
            System.out.print("Price : ");
            int price = sc.nextInt();
            stock.add(new items(name , price , quantity));
            System.out.println("Succful!");
            
        }
    }
    
    
    static void all_items() {
            stock.forEach(iteritem -> {
                System.out.println("" + iteritem.item_name + "  " + iteritem.item_price + "     " + iteritem.item_quantity);
            });
        }    
}
