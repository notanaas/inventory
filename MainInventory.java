/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class MainInventory {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        int choice;
        Scanner obj = new Scanner(System.in);
        while(true){
            System.out.println("1. List Inventory");
            System.out.println("2. Search for a product");
            System.out.println("3. Add new product");
            System.out.println("4. Sort inventory");
            System.out.println("5. Quit");
            System.out.println("");
            System.out.println("Enter your choice: ");
            choice = obj.nextInt();
            if(choice == 1){
                System.out.println("==============================================");
                System.out.println("          Listing all product.....");
                System.out.println("==============================================");
                inventory.listAllItems();
                //PRINT FROM FILE
                System.out.println("");
                System.out.println("");
            }
            if(choice == 2){
                System.out.println("==============================================");
                System.out.println("          searching for product.....");
                System.out.println("==============================================");
                System.out.println("");
                System.out.println("Enter item name: ");
                String search = obj.next();
                int loc = inventory.seqSearch(search);
                //SEARCH FROM FILE
                inventory.displayProduct(loc);
                System.out.println("");
                System.out.println("");
            }
            if(choice == 3){
                System.out.println("==============================================");
                System.out.println("          Adding new product.....");
                System.out.println("==============================================");
                inventory.inputProduct();
                System.out.println("");
                System.out.println("");
            }
            if(choice == 4){
                inventory.selectionSort();
                System.out.println("==============================================");
                System.out.println("          Inventory has been sorted!");
                System.out.println("==============================================");
            }
            if(choice == 5){
                break;
            }
        }
    }
    
}
