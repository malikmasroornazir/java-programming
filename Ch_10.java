package com.practiceeveryday;
//Create an array of 5 floats and calculate their sum.
public class Ch_10 {
    public static void main(String[] args) {
//        float[] arrayy = new float[5];
        float[] arrayy = {10,25,25,664,55};
        float sum = 0;
        for ( int i = 0; i< arrayy.length -1; i++)
        {
            sum = sum + arrayy[i];
        }
        System.out.println(sum);

    }
}
