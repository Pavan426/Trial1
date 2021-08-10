package com.mindtree.entity;

public class Dish {
 private int id;
 private String name;
 private double rating;
 private int price;

 public Dish(int id, String name, double rating, int price) {
  super();
  this.id = id;
  this.name = name;
  this.rating = rating;
  this.price = price;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public double getRating() {
  return rating;
 }

 public void setRating(double rating) {
  this.rating = rating;
 }

 public int getPrice() {
  return price;
 }

 public void setPrice(int price) {
  this.price = price;
 }

 @Override
 public String toString() {
  return this.id + " " + this.name + " " + this.rating + " " + this.price;
 }

}
