package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;


public class SimpleInventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_inventory);
    //login
        String username="admin";
        String password="123";

        System.out.println("You've successfully logged in");
    }
    //product manager inventory list
    public static void productManager(){
        ArrayList productInfo = new ArrayList();
        productInfo.add("ProdID");
        productInfo.add("ProdName");
        productInfo.add("ProdQTY");
        productInfo.add("ProdDesc");
        productInfo.add("ProdCategory");
        productInfo.add("Price");

    }
    //input
    public static void productId () {
        ArrayList  itemId = new ArrayList();
        itemId.add("01");
        itemId.add("02");

    }
    public static void prodName () {
        ArrayList itemName = new ArrayList();
        itemName.add("Bread");
        itemName.add("Pizza");
    }
    public static void prodQty () {
        ArrayList itemQty = new ArrayList();
        itemQty.add("10");
        itemQty.add("20");
    }
    public static void prodDesc () {
        ArrayList itemDesc = new ArrayList();
        itemDesc.add("10");
        itemDesc.add("20");
    }
    public static void prodCategory () {
        ArrayList itemCategory = new ArrayList();
        itemCategory.add("10");
        itemCategory.add("20");
    }
    public static void prodPrice () {
        ArrayList itemPrice= new ArrayList();
        itemPrice.add("10");
        itemPrice.add("20");
    }

    //inventory notifier feature
    public static void inventoryListFeature (){
        ArrayList inventoryList = new ArrayList();
        inventoryList.add("Bread");
        inventoryList.add("Cake");
        inventoryList.add("Pizza");
        inventoryList.add("Burger");
        inventoryList.add("Donut");
        inventoryList.remove("Bread");
        inventoryList.remove("Cake");
        inventoryList.remove("Pizza");
        inventoryList.remove("Burger");
        inventoryList.remove("Donut");
        System.out.println(inventoryList);

        if (inventoryList==null);
        System.out.println("Inventory should not be empty!, need restock");
    }


    //customers
    public static void customerList(){
        ArrayList customers = new ArrayList();
        customers.add("Charles");
        customers.add("Rae");

        ArrayList customerContact = new ArrayList();
        customerContact.add("09550486488");
        customerContact.add("09217818010");
    }
    //suppliers
    public static void supplierList() {
        ArrayList suppliers = new ArrayList();
        suppliers.add("Bob");


        ArrayList supplierContact = new ArrayList();
        supplierContact.add("09950486488");
    }


    //calculator feature
    public static void discountPrice(){
        int productPrice= 100;
        int percentageDiscount= 10;
        //formula for discounted price
        int totalPrice= productPrice-(productPrice*percentageDiscount)/100;
        System.out.println(totalPrice);
    }
    public static void sellingPrice() {
        int productPrice = 100;
        int shippingPrice = 10;
        int taxPrice=10;
        //formula for discounted price
        int totalPrice = productPrice+shippingPrice+taxPrice;
        System.out.println(totalPrice);
    }

    public static void taxPrice(){
        int pretaxPrice= 100;
        int taxRate= 10;
        //formula for tax
        int totalTax= (pretaxPrice*taxRate)/100;
        //formula for total price w/ tax
        int totaltaxedPrice= totalTax+pretaxPrice;
        System.out.println(totaltaxedPrice);
    }
    public static void profit(){
        int totalSales = 10000;
        int totalCost = 11000;
        //formula for total profit
        int totalProfit = totalSales - totalCost;
        System.out.println(totalProfit);

        if (totalProfit<=0);
        System.out.println("Insufficient funds, no profit!");
    }
    public static void materialCost(){
        int rawMaterialCost= 550000;
        int taxCost=70000;
        int packingCost= 5000;
        int shippingCost= 7000;
        //formula
        int totalMaterialCost= rawMaterialCost+taxCost+packingCost+shippingCost;
        System.out.println(totalMaterialCost);
    }





}
