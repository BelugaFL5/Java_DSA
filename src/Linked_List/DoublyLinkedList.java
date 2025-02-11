/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linked_List;

/**
 *
 * @author SIOW HAN BIN
 */
public class DoublyLinkedList {
    // Node class representing each element in the list
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Head and tail of the list
    private Node head;
    private Node tail;

    // Insert a node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Delete a node from the end of the list
    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Display the list in forward direction
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display the list in reverse direction
    public void displayReverse() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);

        System.out.println("List in forward direction:");
        list.displayForward();

        System.out.println("List in reverse direction:");
        list.displayReverse();

        list.deleteFromEnd();
        System.out.println("After deleting from end:");
        list.displayForward();
    }
}
