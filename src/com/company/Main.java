package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(year(2020));

            }
            private static boolean year(int y){
        return (y%4==0 && y%100!=0) || y%400==0;

}

}