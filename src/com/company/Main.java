/*Tanner Gragg
CSCI 1660
1/16/2020
*/
package com.company;

public class Main {
    public static void main(String[] args) {
        float[] temps = {32, 25, 27, 40, 45};
        String cityName= "Columbus";
        int zipCode = 43215;
        float averageTemp;
        averageTemp= (temps[0]+ temps[1]+ temps[2]+temps[3]+temps[4])/5;
        System.out.println("City: " + cityName + " Zip Code: " + zipCode + " Average High Temperature: " +averageTemp);
    }
}