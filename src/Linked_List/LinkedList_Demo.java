/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Linked_List;
//One Question for 22 Jan 2025





/**
 *
 * @author SIOW HAN BIN
 */
// Main.java
class Contact {
    String name;
    String phone;
    Contact next;

    // Constructor to initialize the contact
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.next = null;
    }
}

class ContactBook {
    private Contact head;

    public ContactBook() {
        this.head = null;
    }

    // Function to add a new contact to the end of the contact book
    public void addContact(String name, String phone) {
        Contact newContact = new Contact(name, phone);
        if (head == null) {
            head = newContact; // If the list is empty, the new contact becomes the head
        } else {
            Contact temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the last contact
            }
            temp.next = newContact; // Link the new contact at the end
        }
    }

    // Function to display all contacts in the contact book
    public void displayContacts() {
        if (head == null) {
            System.out.println("Contact book is empty.");
        } else {
            Contact temp = head;
            while (temp != null) {
                System.out.println("Name: " + temp.name + ", Phone: " + temp.phone);
                temp = temp.next; // Move to the next contact
            }
        }
    }

    // Function to search for a contact by name
    public boolean searchContact(String name) {
        Contact temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Contact found: Name: " + temp.name + ", Phone: " + temp.phone);
                return true; // Contact found
            }
            temp = temp.next;
        }
        System.out.println("Contact not found.");
        return false; // Contact not found
    }

    // Function to count the total number of contacts
    public int countContacts() {
        int count = 0;
        Contact temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Function to delete all contacts in the contact book
    public void deleteAllContacts() {
        head = null; // Breaking the link to all contacts
        System.out.println("All contacts have been deleted.");
    }
}

public class LinkedList_Demo {
    public static void main(String[] args) {
        ContactBook myContacts = new ContactBook();

        // Adding contacts
        myContacts.addContact("Alice", "1234567890");
        myContacts.addContact("Bob", "9876543210");
        myContacts.addContact("Charlie", "5555555555");

        // Displaying contacts
        System.out.println("Contacts in the contact book:");
        myContacts.displayContacts();

        // Searching for a contact
        myContacts.searchContact("Bob");

        // Counting contacts
        int totalContacts = myContacts.countContacts();
        System.out.println("Total number of contacts: " + totalContacts);

        // Deleting all contacts
        myContacts.deleteAllContacts();
        myContacts.displayContacts(); // Should show that the contact book is empty
    }
}
