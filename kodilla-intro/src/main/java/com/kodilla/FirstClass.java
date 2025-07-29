package com.kodilla;

import java.sql.SQLOutput;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 2018);
        System.out.println("Notebook weight: " + notebook.weight + " price: " + notebook.price + " year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkValue();

        Notebook heavyNotebook = new Notebook(2000, 1500,2025);
        System.out.println("Heavy Notebook weight: " + heavyNotebook.weight + " price: " + heavyNotebook.price + " year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkValue();

        Notebook oldNotebook = new Notebook(1200, 500,2000);
        System.out.println("Old Notebook weight: " + oldNotebook.weight + " price: " + oldNotebook.price + " year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkValue();
    }
}
