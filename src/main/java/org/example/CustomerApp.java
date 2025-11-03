//Robert Rachar Otieno
//G00440528
//3/11/2025
//Quiz


package org.example;
import java.util.Scanner;
import java.util.ArrayList;


public class CustomerApp {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many customers would you like to add?");
        int customerCount = sc.nextInt();
        sc.nextLine();

        int i = 0;
        while (i < customerCount) {
            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter email:");
            String email = sc.nextLine();

            System.out.println("Enter phone:");
            int phoneNumber = sc.nextInt();

            int customerId;
            while(true){
                System.out.println("Enter customerId:");
                customerId = sc.nextInt();

                boolean duplicate = false;
                for (Customer c:customers) {
                    if(c.getCustomerId()==(customerId)){
                        System.out.println("CustomerID already exists!");
                        duplicate = true;
                        break;
                    }
                }
                if(!duplicate)break;
            }

            Customer customer = new Customer(name,customerId,email,phoneNumber);
            customers.add(customer);
            i++;
        }
        System.out.println("\nCustomer list");
        for (Customer c: customers){
            System.out.println(c);
        }
      sc.close();
    }
}



