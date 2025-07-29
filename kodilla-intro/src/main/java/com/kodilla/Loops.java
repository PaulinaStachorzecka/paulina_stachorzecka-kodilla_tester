package com.kodilla;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma = suma + numbers[i];
            System.out.println( "Suma: " + suma);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }



}