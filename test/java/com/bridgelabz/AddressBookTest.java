//package com.bridgelabz;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//
//public class AddressBookTest {
//
//
//            private AddressBook addressBook;
//
//
//            @Test
//            public void testUpdateContactInformation() {
//                // Create a sample contact
//                Contact contact = new Contact("John Doe", "john@example.com", "1234567890");
//                // Add the contact to the address book
//                addressBook.addContact(contact);
//
//                // Update the contact information
//                contact.setEmail("john.doe@example.com");
//                contact.setPhoneNumber("9876543210");
//                addressBook.updateContact(contact);
//
//                // Retrieve the contact information from the database
//                Contact updatedContact = addressBook.getContact(contact.getId());
//
//                // Check if the contact information in memory is in sync with the database
//                assertEquals(contact, updatedContact);
//            }
//
//
//        }
//
//
//
//
