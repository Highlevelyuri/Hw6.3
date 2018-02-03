package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 2, b = 8, h = 0;
        do {
            h += 2;
            System.out.println(h + "\t" + ((2 * Math.cos(h))-1));
        }
        while (h < 8);
    }
}

