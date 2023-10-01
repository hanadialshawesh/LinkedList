package org.example;

import java.util.Scanner;

public class double1<E> {
    public static void run () {
        Scanner san = new Scanner(System.in);

        DoublyLinkedList<Integer> linked = new DoublyLinkedList<>();
       System.out.print("Please enter the size of the node ");
        int size  = san.nextInt();
        System.out.print("please enter values separated by space:");

        int c = 0;


        do {
            int input1 = san.nextInt();
            linked.addFirst(input1);
            c++;
        } while (c < size);


        boolean exitCode = true;
        while (exitCode) {
            int mainchoice;

            System.out.println(" ");
            System.out.println("Please enter the service");
            System.out.println(" 1. Size 2. isEmpty 3. AddFirst. 4. AddLast 5. Remove first one  6. Remove last one 7. Print it  8.Traverse 9. Exit");
            mainchoice = san.nextInt();
            switch (mainchoice) {
                case 1 -> {
                    linked.size();
                    System.out.println(linked.size);
                }
                case 2 -> linked.isEmpty();
                case 3 -> {
                    int key;
                    System.out.println("please enter the number to add it ");
                    key = san.nextInt();
                    linked.addFirst(key);
                    System.out.println("these are the numbers after add it");
                    linked.printLinkedList();
                }
                case 4 -> {
                    int k;
                    System.out.println("please enter the number to add it ");
                    k = san.nextInt();
                    linked.addLast(k);
                    System.out.println("these are the numbers after add it");
                    linked.printLinkedList();
                }
                case 5 -> {
                    linked.removeFirst();
                    System.out.println("these are the numbers after remove it");
                    linked.printLinkedList();
                }
                case 6 -> {
                    linked.removeLast();
                    System.out.println("these are the numbers after remove it");
                    linked.printLinkedList();
                }
                case 7 -> linked.printLinkedList();
                case 8 -> linked.traverse();
                case 9 -> {
                    System.out.println("Thank you. Code exit done");
                    exitCode = false;
                }
            }
        }
    }
}
