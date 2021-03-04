package com.techreturners.exercise001;

import java.io.Console;
import java.util.List;
import java.util.ArrayList;

import jdk.javadoc.internal.doclets.toolkit.taglets.UserTaglet;

public class Exercise001 {

    public String capitalizeWord(String word) {
        // Add your code here
         return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        String initials = firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
        //System.out.print(initials);
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double newPrice = originalPrice + ((originalPrice / 100) * vatRate );
        
        //System.out.print(newPrice);
        newPrice = Math.round(newPrice * 100);
        newPrice = newPrice/100;
        return newPrice;
    }

    public String reverse(String sentence) {
        // Add your code here
        String newString = "";  
        for (int i = sentence.length()-1; i >= 0 ; i--) {
             newString += sentence.charAt(i);
        }
        //System.out.print(sentence);
        //System.out.print(newString);
        return newString;
    }

     public int countLinuxUsers(List<User> users) {

       int count = 0;
        // iterate over list of user objects and check if each users type is Linux
        for (User u : users) {
            //System.out.println(u);
            //System.out.println(u.getType().toUpperCase());
            if (u.getType().toUpperCase().equals("LINUX")) {
                count ++;
            }
        }
        return count;
    }

} // end of class




       


  