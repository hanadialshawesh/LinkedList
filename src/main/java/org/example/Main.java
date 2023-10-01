package org.example;
/*
  Hanadi Al-shawesh
   443011994
 Data Structure (Lab3)
Double & Circular linked list
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);

         boolean exit = false;
         while(!exit ){
             System.out.print("1 for DoublyLinkedList || 2  for CircularLinkedList || 3 for  Exit  ");
             int b = san.nextInt();
             switch (b) {
                 case 1 -> double1.run();
                 case 2 -> circular.run();
                 case 3 -> {
                     exit = true;
                     System.out.println(" exit ");
                 }
                 default -> System.out.println(" Invalid option, please try again ");
             }

         }
         san.close();

         CircularLinkedList <Integer> sll = new CircularLinkedList();
        sll.addLast(20);
        sll.addLast(30);
        sll.addLast(60);
        sll.addLast(50);
        sll.printLinkedList();
        System.out.println(" Large element in the nodes"+sll.FindMax());

    }
}
