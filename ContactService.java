/*Thomas Martin
 * CS-320-R4844 Software Test Automation& QA 24EW4
 * 3-2 Milestone: Contact Service
 * March 23, 2024
 */

package CS320MobileApplication;

import java.util.ArrayList;

public class ContactService {
	
	// List to store contacts
	private static ArrayList<Contact> ContactList;
	// List to store contact IDs
	private static ArrayList<String> Ids;
	
	// Constructor to initialize lists
	public ContactService() {
		ContactList = new ArrayList<Contact>();
		Ids = new ArrayList<String>();
	}
	// Method to add a new contact
	public void addContact (String id, String firstName, String lastName, String phoneNumber, String address) {
	// Check if the contact ID is invalid or already exists	
		if (Ids.contains(id) || (id == null)) {
			throw new IllegalArgumentException("Contact ID is invaild");
		}
		else {
	// Create a new contact and add it to the lists		
			Contact newOne = new Contact(id, firstName, lastName, phoneNumber, address);
			Ids.add(id);
			ContactList.add(newOne);
		}
	}
	// Method to delete a contact
	public static boolean deleteContact(Contact contact, String id) {
	// Check if the contact ID exists    
		if (Ids.contains(id)) {
	        int index = Ids.indexOf(id);
	// Remove contact from list  
	        ContactList.remove(index);
	        Ids.remove(id);
	// Return true to indicate successful deletion
	        return true; 
	    } else {
	        throw new IllegalArgumentException("Contact ID is invalid");
	    }
	}

	// Method to update contact information
	public void updateContact(String id, String field, String value) {
	// Check if the contact ID exists and the field is not null	
		if(Ids.contains(id) && field != null) {
	// Update contact information based on the specified field
			switch (field) {
			case "FirstName": ContactList.get(Ids.indexOf(id)).setFirstName(value);
			break;
			case "LastName": ContactList.get(Ids.indexOf(id)).setLastName(value);
			break;
			case "PhoneNumber": ContactList.get(Ids.indexOf(id)).setPhoneNumber(value);
			break;
			case "Address": ContactList.get(Ids.indexOf(id)).setAddress(value);
			default: throw new IllegalArgumentException("Field not valid");
			}
		}
	}
	// Method to update the first name of a contact
	public static void updateFirstName(Contact contact, String newFirstName) {
		    // Check if contact and new first name are not null
		    if (contact != null && newFirstName != null) {
		        // Update the first name of the contact
		        contact.setFirstName(newFirstName);
		    } else {
		        // Handle null parameters, throw an exception, or log an error message
		        throw new IllegalArgumentException("Contact or new first name cannot be null");
		    }
		}
	public static void updateLastName(Contact contact, String id, String currentLastName, String newLastName) {
	    // Check if contact, ID, and new last name are not null
	    if (contact != null && id != null && newLastName != null) {
	        // Check if the provided ID matches the contact's ID
	        if (contact.getId().equals(id)) {
	            // Update the last name of the contact
	            contact.setLastName(newLastName);
	        } else {
	            // Handle mismatched IDs, throw an exception, or log an error message
	            throw new IllegalArgumentException("ID does not match the contact's ID");
	        }
	    } else {
	        // Handle null parameters, throw an exception, or log an error message
	        throw new IllegalArgumentException("Contact, ID, or new last name cannot be null");
	    }
	}
	public static void updatePhoneNumber(Contact contact, String id, String currentPhoneNumber, String newPhoneNumber) {
	    // Check if contact, ID, and new phone number are not null
	    if (contact != null && id != null && newPhoneNumber != null) {
	        // Check if the provided ID matches the contact's ID
	        if (contact.getId().equals(id)) {
	            // Update the phone number of the contact
	            contact.setPhoneNumber(newPhoneNumber);
	        } else {
	            // Handle mismatched IDs, throw an exception, or log an error message
	            throw new IllegalArgumentException("ID does not match the contact's ID");
	        }
	    } else {
	        // Handle null parameters, throw an exception, or log an error message
	        throw new IllegalArgumentException("Contact, ID, or new phone number cannot be null");
	    }
	}
	public static void updateAddress(Contact contact, String newAddress) {
	    // Check if contact and new address are not null
	    if (contact != null && newAddress != null) {
	        // Update the address of the contact
	        contact.setAddress(newAddress);
	    } else {
	        // Handle null parameters, throw an exception, or log an error message
	        throw new IllegalArgumentException("Contact or new address cannot be null");
	    }
	}
	
}

