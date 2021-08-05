package org.launchcode.java.studios.restaurant;
import java.util.*;
public class MenuItem {
    private String itemName;
    private Double price;
    private String description;
    private String category;
    private String lastUpdatedDate;

    public void setItemName(String aItemName){
        this.itemName = aItemName;
    }

    public void setPrice(Double aPrice){
        this.price = aPrice;
    }

    public void setDescription(String aDescription){
        this.description = aDescription;
    }

    public void setCategory(String aCategory){
        this.category = aCategory;
    }

    public void setLastUpdatedDate(String inputDate){
        this.lastUpdatedDate = inputDate;
    }

    public String getItemName(){
        return itemName;
    }
    public String getDescription(){
        return description;
    }
    public Double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public String getLastUpdatedDate(){
        return lastUpdatedDate;
    }


}
