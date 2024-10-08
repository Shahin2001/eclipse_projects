package com;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        
        List<Integer> link = new LinkedList<>();
        
       
        link.add(11);
        link.add(12);
        link.add(13);
        link.add(14);
        link.add(15);
        link.add(16);
        
        System.out.println("Initial List: " + link);
        
        
        ListIterator<Integer> itr = link.listIterator();
        
       
//        System.out.println("\nForward Iteration:");
//        while (itr.hasNext()) {
//            Integer i = itr.next();
//            System.out.println("Element: " + i + ", Next Index: " + itr.nextIndex());
//        }
        
       
        System.out.println("\nBackward Iteration:");
        while (itr.hasPrevious()) {
            Integer i = itr.previous();
            System.out.println("Element: " + i + ", Previous Index: " + itr.previousIndex());
        }

       
//        itr.add(20);
//        System.out.println("\nAfter adding 17 using add() method: " + link);
//        
//        itr.add(21);
//        System.out.println("\nAfter adding 17 using add() method: " + link);

        
//        if (itr.hasPrevious()) {
//            Integer lastElement = itr.previous();
//            System.out.println("Modifying element: " + lastElement);
//            itr.set(18); 
//        }
//        System.out.println("After setting element to 18 using set() method: " + link);

//        
        while(itr.hasPrevious()) {
            if(itr.previous()==13) {
            	itr.remove(); 
            }
            
        }
        System.out.println("After removing an element using remove() method: " + link);
//        
//       
        link.add(3, 10);
        System.out.println("After adding 10 at the beginning: " + link);
    }
}

