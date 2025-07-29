package com.kodilla;

public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[5];
        books[0] = "Jak być smiesznym";
        books[1] = "Grube wiory";
        books[2] = "Ostatni snieg";
        books[3] = "Komik dookoła swiata";
        books[4] = "Komik dookoła swiata 2";

        String book = books[2];

        System.out.println(book);

        int numberOfElements = books.length;
        System.out.println(numberOfElements);

    }
}
