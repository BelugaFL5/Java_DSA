/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linked_List;

/**
 *
 * @author SIOW HAN BIN
 */
public class CircularDoublyLinkedList {
    // Node class representing each element in the list
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = this;
            this.prev = this;
        }
    }

    // Head of the list
    private Node head;

    // Insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Delete a node from the front of the list
    public void deleteFromFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == head) {
            head = null; // Only one node in the list
        } else {
            Node tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    // Display the list in forward direction
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Display the list in reverse direction
    public void displayReverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head.prev;
        do {
            System.out.print(current.data + " ");
            current = current.prev;
        } while (current != head.prev);
        System.out.println();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Original List:");
        list.displayForward();

        System.out.println("List in reverse direction:");
        list.displayReverse();

        list.deleteFromFront();
        System.out.println("After deleting from front:");
        list.displayForward();
    }
}

