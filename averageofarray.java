package com.practiceeveryday;
//Calculate the average marks from an array containing marks of all students
// in physics using a for-each loop.
public class ch_12 {
    public static void main(String[] args) {
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);

    }

}
