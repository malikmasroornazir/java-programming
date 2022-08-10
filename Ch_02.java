package com.practiceeveryday;

import java.util.Scanner;

public class Ch_02 {
    public static void main(String[] args ){
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
        float  a = sc.nextInt();
        System.out.println("enter total  marks");
        Scanner s = new Scanner(System.in);
        float b = s.nextInt();
        float c = (a*100)/b;
        System.out.println(c);
    }
}
