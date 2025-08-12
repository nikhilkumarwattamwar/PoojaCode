package ExceptionHandling;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class OutofStockException extends Exception{
	OutofStockException(String msg){
		super(msg);
	}
}
public class Shoppingveggies {

	static List<String>productsAvailable = new ArrayList<>();
    static List<Integer>inventory = new ArrayList<>();

	public static void main(String[] args) {
        productsAvailable.addAll(Arrays.asList("apple", "banana", "orange", "grapes","dragon"));
  //System.out.println(productsAvailable.toString());
        inventory.addAll(Arrays.asList(0,20,25,8,90));
        
//        for (int i = 0; i < productsAvailable.size(); i++) {
//            System.out.println(productsAvailable.get(i) + ": " + inventory.get(i));
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product to order: ");
        String orderedItems = scanner.nextLine().toLowerCase();
        String[] order = orderedItems.split("\\s+");

        for (String item : order) {
            if (productsAvailable.contains(item)) {  
                int index = productsAvailable.indexOf(item); 
                int UpdatedInventory= inventory.get(index);

                try {
                    if (UpdatedInventory > 0) {
                        inventory.set(index, UpdatedInventory - 1);
                        System.out.println("Order placed for: " + item); 
                    } else {
                        throw new OutofStockException(item+" not in stock");
                    }
                } catch (OutofStockException e) {
                    System.out.println(e.getMessage());
                } finally {
                        scanner.close();
                    }
                }
             else {
                System.out.println(item + " is not available in our store.");
                
            }
           
        }
        System.out.println("Updated inventory:");

        for (int i = 0; i < productsAvailable.size(); i++) {
            System.out.println(productsAvailable.get(i) + ": " + inventory.get(i));}
        
    }
}