/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Arrays;

/**
 *
 * check given string is possible to make as palindrome,if possible make it into palindrome
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String Str1 = "ababgkyigkyipwqpwq";
        String Str2 = "aab";
        
        String passString = Str2;
        
        // If the input string is a palindrome it will print on the if statement otherwise will go to else
        
        if (myReverse(passString)) {
            System.out.println(passString+" is Palindrome");
        } else {
        frequencycount(passString);
        }
      

    }
    // This method is checking whether given string is palindrome or not

    static boolean myReverse(String myText) {
        String copyText = "";
        for (int i = myText.length() - 1; i >= 0; i--) {
            copyText = copyText + myText.charAt(i);
        }
        return copyText.equals(myText);
    }

    // this method is to check whether palindrome is possible or not if possible print a palindrome
    static void frequencycount(String s) {
        int w, i, j, k, c;
        int evenCount = 0;
        int oddCount = 0;
        //Could be string 
        Character middlePart = null;
        char[] z = new char[s.length()];
        for (w = 0; w < s.length(); w++) {
            z[w] = s.charAt(w);
        }
        for (i = 0; i < w; i++) {
            char ch = z[i];
            for (j = i + 1; j < w; j++) {
                if (z[j] == ch) {
                    for (k = j; k < (w - 1); k++) {
                        z[k] = z[k + 1];
                    }
                    w--;
                    j = i;
                }
            }
        }

        int[] t = new int[w];
        for (i = 0; i < w; i++) {
            for (j = 0, c = 0; j < s.length(); j++) {
                if (z[i] == s.charAt(j)) {
                    c++;
                }
            }
            t[i] = c;
            if (c % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
                middlePart = z[i];
            }
        }
        if (oddCount == 0) {

            System.out.println("\nPalindrome Possible - even number of characters");
            String sorted = sortAll(s);
            String partOne = "";

            for (int l = 0; l < sorted.length(); l += 2) {
                partOne += sorted.charAt(l);
            }
            String partTwo = new StringBuilder(partOne).reverse().toString();

            System.out.println("\n\nOne of the Possible palindrome is " + partOne + partTwo +"\n\n");

        } else if (oddCount == 1) {
            System.out.println("\nPalindrome is Possible - odd number of characters");
            
            String newSubString = "";
            int flagCount = 0;
            for (int iCount = 0; iCount < s.length(); iCount++) {                
                if (middlePart == s.charAt(iCount)) {
                    if (flagCount == 0) {
                        flagCount++;
                    }
                } else {
                    newSubString += s.charAt(iCount);
                }
                
            }            
            String sortedOdd = sortAll(newSubString);
            String partOneOdd = "";

            for (int l = 0; l < sortedOdd.length(); l += 2) {
                partOneOdd += sortedOdd.charAt(l);
            }
            String partTwoOdd = new StringBuilder(partOneOdd).reverse().toString();

            System.out.println("\n\nOne of the Possible palindrome is " + partOneOdd + middlePart + partTwoOdd +"\n\n");

        } else {
            System.out.println("\nPalindrome not possible");
        }

    }

    static String sortAll(String myString) {
        char[] chars = myString.toCharArray();
        Arrays.sort(chars); // Sorts all the characters in the string.
        String sorted = new String(chars);
        return sorted;
    }
}
