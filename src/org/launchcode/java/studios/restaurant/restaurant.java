package org.launchcode.java.studios.restaurant;
import java.util.*;
import java.time.*;

public class restaurant {
    static ArrayList<MenuItem> menuList = new ArrayList<>();
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
       // Scanner input5 = new Scanner(System.in);

        Menu menus = new Menu();

        LocalDate currentDate = LocalDate.now();

        int userSelection;


        while(true){
            System.out.println("\n 1. View Menu \n 2. Add an item to menu \n 3. Exit");
            userSelection = input.nextInt();
            if(userSelection == 3){
                break;
            }
            else if (userSelection == 1){
                menus.displayMenu();
            }
            else {
                System.out.println("Enter the item name : ");
                String menuName = input1.nextLine();
                System.out.println("Enter the description : ");
                String description = input2.nextLine();
                System.out.println("Enter the price : ");
                double price = input3.nextDouble();
                System.out.println("Enter the category (Appetizer/Main Course/Dessert) :");
                String category = input4.nextLine();
                menus.addMenu(menuName,description,price,category,currentDate.toString());
            }
        }

    }





}
