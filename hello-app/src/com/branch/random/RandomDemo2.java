package com.branch.random;

import java.util.Random;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int data = r.nextInt(10) + 1;
            System.out.println(data);
        }
    }
}
