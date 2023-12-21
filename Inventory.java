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
public class Inventory{
    static int Index = 0;
    Scanner keyboard = new Scanner(System.in);
    private final Product[] inv = new Product[30];
    public void inputProduct() {
        
        int choice;
        System.out.println("Choose product type: 1)Cable 2)Device");
        choice = keyboard.nextInt();
        while((choice != 1) && (choice != 2)){
        try {
            if (choice != 1 && choice != 2) {
                throw new IllegalArgumentException();
            }
            }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please enter a valid choice.");
            choice = keyboard.nextInt();
        }
        }
        if (choice == 1) {
            inv[Index] = new Cable();
        }
        if (choice == 2) {
            inv[Index] = new Device();
        }
        
        System.out.println("Enter product ID:");
        String id;
        id = keyboard.next();
        inv[Index].setID(id);
        System.out.println("Enter product name: ");
        String name;
        name = keyboard.next();
        inv[Index].setName(name);
        System.out.println("Enter product brand: ");
        String brand;
        brand = keyboard.next();
        inv[Index].setBrand(brand);
        if(choice == 1){
            System.out.println("Enter product length: ");
            int length;
            length = keyboard.nextInt();
            inv[Index].setLength(length);
        }
        System.out.println("Enter product price: ");
        float price;
        price = keyboard.nextFloat();
        inv[Index].setPrice(price);
        System.out.println("Enter available quantity: ");
        int quantity;
        quantity = keyboard.nextInt();
        inv[Index].setQuantity(quantity);
        System.out.println("=================================================");
        System.out.println("          Product added successfully!");
        System.out.println("=================================================");
        Index++;
    }

    public void displayProduct(int location) {
        if(location >= 0 )
            System.out.println(inv[location]);
        else
            System.out.println("Product not found!");
    }
    
    public void selectionSort(){
        int index;
        int smallestIndex;
        int location;
        for (index = 0; index < Index - 1; index++){
            smallestIndex = index;
            for (location = index + 1; location < Index; location++)
                if(inv[location].getName().compareTo(inv[smallestIndex].getName())< 0)
                    smallestIndex = location;
            Product temp = inv[smallestIndex];    
            inv[smallestIndex] = inv[index];
            inv[index] = temp;
        }
    }
    
    public int seqSearch(String str){
        int loc = 0;
        boolean found = false;
        while(loc < Index && !found){
            String name = inv[loc].getName();
            if(name.equals(str))
                found=true;
            else
                loc++;
        }
        
        if(found == true)
            return loc;
        else
            return -1;
    }
    
    public void listAllItems() {
        for(int i = 0; i < Index; i++) {
            displayProduct(i);
        }
    }
}
