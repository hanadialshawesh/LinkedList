package org.example;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Original Form of String
        CircularLinkedList<Integer> original = new CircularLinkedList<>();
        System.out.print("Please enter the size of the node ");
        int size  = sc.nextInt();

        System.out.print("Enter a numbers  : ");


        for (int i = 0; i < size; i++)
            original.addLast( sc.nextInt());


        CircularLinkedList<Integer> original2= new CircularLinkedList<>();
        System.out.print("Enter a number ");

        for (int i = 0; i < size; i++)
            original2.addLast( sc.nextInt());


        // create a head node for Original Linked List
        CircularLinkedList<Integer>.Node<Integer> currentOriginal = original.tail.next; //1 2 3 4 5

        // create a head node for original2 Linked List
        CircularLinkedList<Integer>.Node<Integer> currentoriginal2 = original2.tail;//  2 3 4 5 1
        //  2 3 4 5 1


        boolean isSequence = true;

        do {
            if (currentOriginal.data != currentoriginal2.data) {
               isSequence = false;
                break;
            }
            currentOriginal = currentOriginal.next;
            currentoriginal2 = currentoriginal2.next;
        } while (currentOriginal.next !=  original.tail.next || currentoriginal2.next != original2.tail );


        System.out.println(isSequence ? " yes it's" : "No it's not");
    }
}