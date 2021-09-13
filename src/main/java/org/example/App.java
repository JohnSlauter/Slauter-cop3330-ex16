package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner s = new Scanner(System.in);

        String out, temp;

        int age;

        System.out.print("What is your age? ");

        temp = s.nextLine();

        age = String_to_int(temp);

        System.out.print(age < 16 ? "You are not old enough to legally drive." : "You are old enough to legally drive.");

        s.close();

    }

    private static int String_to_int(String s){

        int res = 0;

        for(int i = 0; i < s.length(); i++){

            res += (s.charAt(i)-'0')*pow(10, s.length()-1-i);

        }

        return res;

    }

    private static int pow(int base, int exponent){

        int res = 1;

        for(int i = 0; i < exponent; i++){

            res *= base;

        }

        return res;

    }

}
