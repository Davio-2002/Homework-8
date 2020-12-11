package com.company.StringHelper;

public class Main{

    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        stringHelper.setText("Hello");

        System.out.println();

        stringHelper.reverse();
        System.out.println(stringHelper.length());
    }
}