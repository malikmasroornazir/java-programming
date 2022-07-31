package com.masroor15;
//Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”

// Replace <|name|> with a string (some name)
public class Tempelate {
    public static void main(String[] args) {

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "javid");
        System.out.println(letter);

    }
}