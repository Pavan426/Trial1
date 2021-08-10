package com.mindtree.client;

import com.mindtree.service.*;
import java.util.Scanner;
import com.mindtree.entity.Dish;

public class ClientDish {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of Dishes");
  int n = sc.nextInt();
  Dish dish[] = new Dish[n];
  for (int i = 0; i < n; i++) {
   System.out.println("Enter the Dish id");
   int id = sc.nextInt();
   System.out.println("Enter the Dish name");
   String name = sc.next();
   System.out.println("Enter the Rating upto 10");
   double rat = sc.nextDouble();
   System.out.println("Enter the Price");
   int price = sc.nextInt();
   if (id > 0 && name != null && rat > 0 && price > 0) {
    dish[i] = new Dish(id, name, rat, price);
    System.out.println(dish[i]);
   } else {
    System.out.println("Enter the all correct details");
   }
  }
  ServiceDish sd = new ServiceDish();
  int choice = 0;
  do {
   System.out.println("< Press 1 to display all Dishes >" + " " + "\n" + "< press 2 to get the dishes by price >"
+ " " + "\n" + "< Press 3 to get Dishes in Sorted Manner >" + " " + "\n"+ "< Press 4 to get Dishes By Rating >" + " " + "\n" + "< press 5 to Exit >");
   choice = sc.nextInt();
   switch (choice) {
   case 1:
    sd.displayDetails(dish);
    break;
   case 2:
    System.out.println("Enter the price");
    int prz = sc.nextInt();
    sd.getDetailsByPrice(dish, prz);
    break;
   case 3:
    sd.sortInDescendingOrder(dish);
    break;
   case 4:
    System.out.println("Enter the ratings between");
    double from = sc.nextDouble();
    double to = sc.nextDouble();
    sd.displayDishesRatingWise(dish, from, to);
    break;
   default:
    System.out.println("User Exited");
   }
  } while (choice >= 1 && choice <= 4);
  sc.close();
 }
}
