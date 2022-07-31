package com.masroor15;
//Write a Java program to replace spaces with underscores.

public class Underscores {
    public static void main(String[] args) {
        String text = " Malik     m   a  sr  oor ";
        text = text.replace(" ", "_");
        System.out.println(text);
    }
}
