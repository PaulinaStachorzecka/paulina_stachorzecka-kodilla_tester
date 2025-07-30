package com.kodilla;

import java.awt.color.ICC_ColorSpace;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <=1000){
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 700 && this.weight < 1300){
            System.out.println("The notebook isn't very heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkValue() {
        if (this.price == 1500 && this.year == 2025) {
            System.out.println("This notebook is expensive but it is a good investment.");
        } else if (this.price ==1000 && this.year == 2018) {
            System.out.println("Decent device at a reasonable price.");
        } else {
            System.out.println("Old and cheap notebook – suitable for basic tasks.");
        }
    }
}

