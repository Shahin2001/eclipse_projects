package com.sep13;

public class CountRepeat {
    public static void main(String[] args) {
        String str = "abbcccdd";
        int count = 1; 

        for (int i = 0; i < str.length() - 1; i++) { 
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++; 
            } else {
                if (count > 1) { 
                    System.out.println(str.charAt(i) + "=" + count);
                }
                count = 1; 
            }
        }

       
        if (count > 1) {
            System.out.println(str.charAt(str.length() - 1) + "=" + count);
        }
    }
}
