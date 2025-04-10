// Luqman Kabiru
// 3/24/2025
// CSC111
// Problem Set #4
//
// This program will

// MAKE SURE TO COMMIT AND WRITE COMMENTS AFTER EVERY LINE OF CODE

import java.util.*;
public class MyStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // menu for the store
        System.out.println("LUCKY'S SHOP");
        System.out.println("Menu Items: ");
        System.out.println("Item: Milk      Price: $5.99");
        System.out.println("Item: Eggs      Price: $7.99");
        System.out.println("Item: Chicken   Price: $8.99\n");

        // prices for each product that i sell in my store
        double milk = 5.99;
        double eggs = 7.99;
        double chicken = 8.99;
        // created a boolean to use for my while loop so that the customer can keep shopping until they're done
        boolean shop = true;
        // the subtotal starts at zero since the customer hasn't bought anything yet
        double subtotal = 0;

        while (shop) {
            // asking the customer what they wish to buy
            System.out.println("What item do you wish to buy? enter 'done' to finish shopping: ");
            String item = sc.nextLine();

            // if they say milk then i ask the quantity and the program will then calculate the cost of the quantity of milk.
            if (item.equalsIgnoreCase("Milk")) {
                System.out.println("What quantity of the item? ");
                int quantityM = sc.nextInt();
                // the subtotal is added on by the multiplication of the quantity of the item and the price
                subtotal += (milk * quantityM);
                sc.nextLine();
            }
            // the same situation for milk will repeat for eggs and chicken
            else if (item.equalsIgnoreCase("Eggs")) {
                System.out.println("What quantity of the item? ");
                int quantityE = sc.nextInt();
                // the subtotal is added on by the multiplication of the quantity of the item and the price
                subtotal += (eggs * quantityE);
                sc.nextLine();
            }
            else if (item.equalsIgnoreCase("Chicken")) {
                System.out.println("What quantity of the item? ");
                int quantityCh = sc.nextInt();
                // the subtotal is added on by the multiplication of the quantity of the item and the price
                subtotal += (chicken * quantityCh);
                sc.nextLine();
            }
            // when the customer says done, the loop ends
            else if (item.equalsIgnoreCase("done")) {
                shop = false;
            }
        }
        // the subtotal is shown after the loop ends
        System.out.printf("Your subtotal is: $%.2f\n", subtotal);
        // the tax is calculated by multiplying it by the subtotal
        double tax = subtotal * 0.05;
        System.out.printf("Your tax is: $%.2f\n", tax);
        // total price adds the subtotal and the tax of the subtotal
        double total = subtotal + tax;
        System.out.printf("Your total is: $%.2f\n", total);
    }
}
