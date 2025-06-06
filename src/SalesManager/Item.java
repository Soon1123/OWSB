package SalesManager;

import java.time.LocalDate;

public class Item {
    private String itemID;
    private String itemName;    
    private double price;
    private String category;
    private LocalDate expiredDate;
    private String supplierID;
    private int totalStock;
    private LocalDate updatedDate;
    
    // Constructor
    public Item(String itemID, String itemName, double price, String category,
                LocalDate expiredDate, String supplierID, int totalStock, LocalDate updatedDate) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.expiredDate = expiredDate;
        this.supplierID = supplierID;
        this.totalStock = totalStock;
        this.updatedDate = updatedDate;
    }
    
    public Item(String itemID, String itemName, double price,int totalStock) {
    this.itemID = itemID;
    this.itemName = itemName;
    this.price = price;
    this.totalStock = totalStock;
    }
    
    public Item(String itemID, String itemName, double price,String supplierID) {
    this.itemID = itemID;
    this.itemName = itemName;
    this.price = price;
    this.supplierID = supplierID;
    }
    
    // Getters
    public String getItemID() {
        return itemID; 
    }
    
    public String getItemName() { 
        return itemName; 
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getCategory() { 
        return category; 
    }
    
    public LocalDate getExpiredDate() { 
        return expiredDate; 
    }
    
    public String getSupplierID() { 
        return supplierID; 
    }
    
    public int getTotalStock() { 
        return totalStock; 
    }
    
    public LocalDate getUpdatedDate() {
        return updatedDate; 
    }

    // Setters
    
    public void setPrice(double price) { 
        this.price = price; 
    }
    
    public void setCategory(String category) { 
        this.category = category; 
    }
    
    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }
    
    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }
    
    public void setUpdatedDate(LocalDate updatedDate) { 
        this.updatedDate = updatedDate;
    }
    
    @Override
    public String toString() {
        return "Item{" +
                "itemID='" + itemID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", expiredDate=" + expiredDate +
                ", supplierID='" + supplierID + '\'' +
                ", totalStock=" + totalStock +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
