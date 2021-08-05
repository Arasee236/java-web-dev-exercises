package org.launchcode.java.studios.restaurant;
import javax.swing.*;
import java.util.*;

public class Menu {

    ArrayList<MenuItem> menu = new ArrayList<>();

    public void addMenu(String name,String description,Double price,String category,String date){

        MenuItem objMenu = new MenuItem();
        objMenu.setItemName(name);
        objMenu.setDescription(description);
        objMenu.setCategory(category);
        objMenu.setPrice(price);
        objMenu.setLastUpdatedDate(date);

        //  menuList.add(objMenu);
        this.menu.add(objMenu);
    }

    public void removeMenu(String menuName) {
        boolean removeItem = false ;
        if (this.menu.isEmpty()) {
            System.out.println("The menu is empty!");
        } else {
            //System.out.println("Removing item...");
            this.menu.removeIf(objMenu -> objMenu.getItemName().equalsIgnoreCase(menuName));

                    System.out.println("Item Removed!");
                    displayMenu();

            }

    }

    public void displayMenu() {

        if(this.menu.isEmpty()){
            System.out.println("The menu is empty!");
        }
        else {
            for (MenuItem objMenu : this.menu){
                System.out.println("************");
                System.out.println(" Name: " + objMenu.getItemName());
                System.out.println(" Price: " + objMenu.getPrice());
                System.out.println(" Description: " + objMenu.getDescription());
                System.out.println(" Category : " + objMenu.getCategory());
                System.out.println(" Last Updated date : " + objMenu.getLastUpdatedDate());
                System.out.println("*******\n");
            }
        }
    }

}
