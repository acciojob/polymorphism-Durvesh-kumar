package com.driver;

public class Main {
      static class Product {
          private static int count=101;
          int productId;
          String name;
          String category;
          String description;
          double price;
          int storeId;

          // Constructor of product class
          public Product(String name, String category, String description, double price, int storeId){
              this.productId = count++;
              this.name = name;
              this.category=category;
              this.description=description;
              this.price=price;
              this.storeId=storeId;
          }

          public int product(int x, int y){
              return x*y;
          }

          public int product(int x, int y, int z) {
              return x*y*z;
          }
          public double product(double x, double y) {
              return  x*y;
          }
      }

    // main method of main class
    public static void main(String[] args) {
        Product product1 = new Product(
                "Samsung Galaxy S24",
                "Smartphone",
                "128GB Storage, 8GB RAM, 50MP camara",
                59999.00,
                203
        );

        System.out.println("product x,y int: "+product1.product(3,6));
        System.out.println("product x,y,z: "+ product1.product(5,2,7));
        System.out.println("product x,y double: "+ product1.product(100.00, 50.00));
    }
}