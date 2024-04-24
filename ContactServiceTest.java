/*Thomas Martin
 * CS-320-R4844 Software Test Automation& QA 24EW4
 * 3-2 Milestone: Contact Service Test
 * March 23, 2024
 */

package CS320MobileApplication;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;	
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	// Test cases for adding a contact
	@Test
    void addContact() {
        Contact contact = new Contact("001", "Kathy", "Martin", "123456789", "111 Address");
        assertTrue(contact.getFirstName().equals("Kathy"));
        assertTrue(contact.getId().equals("001"));
    }

	// Test cases for deleting a contact
	@Test
    void testDeleteContact() {
        Contact contact = new Contact("002", "Jeff", "Mathews", "234567890", "222 Address");
        
        // Assuming ContactService.deleteContact() returns a boolean indicating success or failure
        boolean deleted = ContactService.deleteContact(contact, "002");
        
        // Verify that the contact was successfully deleted
        assertTrue(deleted);
    }

	// Test cases for updating first name
	@Test
    void testFirstName() {
        Contact contact = new Contact("003", "Koda", "Martin", "3456789123","333 Address");
        ContactService.updateFirstName(contact, "Jobs");
        assertTrue(contact.getFirstName().equals("Jobs"));
        assertTrue(contact.getId().equals("003"));
    }

	// Test cases for updating last name
	@Test
    void testLastName() {
        Contact contact = new Contact("004", "Jack", "Whitman", "4567891234", "444 Address");
        ContactService.updateLastName(contact, "004", "Whitman", "James");
        assertTrue(contact.getLastName().equals("James"));
        assertTrue(contact.getId().equals("004"));
    }

	// Test cases for updating phone number
    @Test
    void testPhoneNumber() {
        Contact contact = new Contact("005", "Carl", "Whitman", "567891234", "555 Address");
        // Assuming "id" is the identifier of the contact to update and "PhoneNumber" is the current phone number
        ContactService.updatePhoneNumber(contact, "005", "567891234", "5555555555");
        assertTrue(contact.getPhoneNumber().equals("5555555555"));
        assertTrue(contact.getId().equals("005"));
    }
	
	// Test cases for updating address
    @Test
    void testAddress() {
        Contact contact = new Contact("006", "Belinda", "Jobs", "678912345", "666 Address");
        // Assuming "Address" is the new address to update
        ContactService.updateAddress(contact, "NewAddress");
        // Checking if the address is updated correctly
        assertTrue(contact.getAddress().equals("NewAddress")); 
     // Checking if the contact ID remains unchanged
        assertTrue(contact.getId().equals("006")); 
    }

    }
