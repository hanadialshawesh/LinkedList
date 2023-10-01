package org.example;

import java.util.Scanner;

public class circular<E>{
    public static void run() {
        Scanner san = new Scanner(System.in);

        CircularLinkedList <Integer> sll = new CircularLinkedList();

        System.out.print("Please enter the size of the node ");
        int size  = san.nextInt();
        System.out.print("please enter values separated by space:");

        int b = 0;

        do {
            int input1 = san.nextInt();
            sll.addFirst(input1);
            b++;
        } while (b < size);


        boolean exitCode = true;
        while (exitCode) {
            int mainchoice;

            System.out.println(" ");
            System.out.println("Please enter the service");
            System.out.println(" 1. Size 2. isEmpty 3. getFirst. 4. getLast 5. rotate 6.addFirst. 7. addLast 8. remove First one" +
                    " 9. print  10.split  11. Exit");
            mainchoice = san.nextInt();
            switch (mainchoice) {
                case 1 -> {
                    sll.size();
                    System.out.println(sll.size);
                }
                case 2 -> sll.isEmpty();
                case 3 -> {
                    b = sll.getFirst();
                    System.out.println(b);
                }
                case 4 -> {
                    b = sll.getLast();
                    System.out.println(b);
                }
                case 5 -> {
                    sll.rotate();
                    System.out.println("these are the numbers");
                    sll.printLinkedList();
                }
                case 6 -> {
                    int key;
                    System.out.println("please enter the number to add it ");
                    key = san.nextInt();
                    sll.addFirst(key);
                    System.out.println("these are the numbers after delete it");
                    sll.printLinkedList();
                }
                case 7 -> {
                    int k;
                    System.out.println("please enter the number to add it ");
                    k = san.nextInt();
                    sll.addLast(k);
                    System.out.println("these are the numbers after delete it");
                    sll.printLinkedList();
                }
                case 8 -> {
                    sll.removeFirst();
                    System.out.println("these are the numbers after remove it");
                    sll.printLinkedList();
                }
                case 9 -> sll.printLinkedList();
                case 10 -> sll.splitprint();
                case 11 -> {
                    System.out.println("Thank you. Code exit done");

                    exitCode = false;
                }
            }
        }
    }
}
