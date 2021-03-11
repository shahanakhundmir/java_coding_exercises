package com.techreturners.exercise001;

import java.io.Console;
import java.util.List;
import java.util.ArrayList;

import jdk.javadoc.internal.doclets.toolkit.taglets.UserTaglet;

public class Exercise001 {

    public String capitalizeWord(String word) {
         return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        String initials = firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        double newPrice = originalPrice + ((originalPrice / 100) * vatRate );
        newPrice = Math.round(newPrice * 100);
        newPrice = newPrice/100;
        return newPrice;
    }

    public String reverse(String sentence) {
        String newString = "";  
        for (int i = sentence.length()-1; i >= 0 ; i--) {
             newString += sentence.charAt(i);
        }
        return newString;
    }

     public int countLinuxUsers(List<User> users) {

       int count = 0;
        for (User u : users) {
            if (u.getType().equals("Linux")) {
                count ++;
            }
        }
        return count;
    }
} 




       


  