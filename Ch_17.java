package com.practiceeveryday;
//Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

public class Ch_17 {
    public static void main(String[] args) {
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        //asus.ring();

    }
}