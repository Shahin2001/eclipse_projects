package com.sep13;

public class Reverse {
    public static void main(String[] args) {
        String str = "Java By Kiran";
        String a[] = str.split(" ");
        String rev = "";

        // Loop through each word in reverse order
        for (int i = a.length - 1; i >= 0; i--) {  // Reversed word order
            String word = a[i];
            String reve = "";

            // Reverse each word's characters
            for (int j = word.length() - 1; j >= 0; j--) {
                reve += word.charAt(j);
            }

            rev += reve + " ";  // Append reversed word
        }

        rev = rev.trim();  // Remove trailing space

        System.out.println(rev);  // Print the final result
    }
}

