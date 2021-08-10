package com.mindtree.service;

import com.mindtree.client.ClientDish;
import com.mindtree.entity.Dish;

public class ServiceDish {
 ClientDish cs = new ClientDish();

 public void displayDetails(Dish ds[]) {
  for (int i = 0; i < ds.length; i++) {
   System.out.println(ds[i]);
  }
 }

 public void getDetailsByPrice(Dish ds[], int price) {
  for (int i = 0; i < ds.length; i++) {
   if (ds[i].getPrice() <= price) {
    System.out.println(ds[i]);
   }
  }

 }

 public void sortInDescendingOrder(Dish ds[]) {
  for (int i = 1; i < ds.length; i++) {
   Dish key = ds[i];
   int j = i - 1;
   while (j >= 0 && ds[j].getName().compareTo(key.getName()) < 0) {
    ds[j + 1] = ds[j];
    j--;
   }
   ds[j + 1] = key;
  }
  for (int i = 0; i < ds.length; i++) {
   System.out.println(ds[i]);
  }
 }

 public void displayDishesRatingWise(Dish ds[], double from, double to) {
  for (int i = 0; i < ds.length; i++) {
   if (ds[i].getRating() >= from && ds[i].getRating() <= to) {
    System.out.println(ds[i]);
   }
  }
 }
}
