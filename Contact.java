/*Thomas Martin
 * CS-320-R4844 Software Test Automation& QA 24EW4
 * 3-2 Milestone: Contact
 * March 23, 2024
 */

package CS320MobileApplication;

public class Contact {
	
	//unique contact ID string that cannot be longer than 10 characters
	private String contactID;				
	
	//firstName String field that cannot be longer than 10 characters
	private String firstName;		
	
	//lastName String field that cannot be longer than 10 characters
	private String lastName;		
	
	//phone number String field that must be exactly 10 digits 
	private String phoneNumber;	
	
	//address string field that must be no longer than 30 characters
	private String contactAddress;		
	
	/**
     * Constructs a new Contact object with the provided information.
     * @param id The unique identifier for the contact.
     * @param fName The first name of the contact.
     * @param lName The last name of the contact.
     * @param pNumber The phone number of the contact.
     * @param conAddress The address of the contact.
     * @throws IllegalArgumentException If any of the provided parameters are invalid.
     */
	public Contact(String id, String fName, String lName, String pNumber, String conAddress) {
				
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(pNumber == null || pNumber.length() > 10 || pNumber.length() < 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(conAddress == null || conAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.contactID = id;
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNumber = pNumber;
		this.contactAddress = conAddress;
		
	}
	// Getters
    /**
     * Retrieves the unique identifier of the contact.
     * @return The unique identifier of the contact.
     */
	public String getId() {
		return this.contactID;
	}
	/**
     * Retrieves the first name of the contact.
     * @return The first name of the contact.
     */
	public String getFirstName() {
		return this.firstName;
	}
	 /**
     * Retrieves the last name of the contact.
     * @return The last name of the contact.
     */
	public String getLastName() {
		return this.lastName;
	}
	/**
     * Retrieves the phone number of the contact.
     * @return The phone number of the contact.
     */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	/**
     * Retrieves the address of the contact.
     * @return The address of the contact.
     */
	public String getAddress() {
		return this.contactAddress;
	}
	// Setters
    /**
     * Sets the unique identifier of the contact.
     * @param newID The new unique identifier for the contact.
     * @throws IllegalArgumentException If the new ID is invalid.
     */
	
	public void setContactID(String newID) {
		
		if(newID == null || newID.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		contactID = newID;
		}
	/**
     * Sets the first name of the contact.
     * @param newFirstName The new first name for the contact.
     * @throws IllegalArgumentException If the new first name is invalid.
     */
	public void setFirstName(String newFirstName) {
		if(newFirstName == null || newFirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		firstName = newFirstName;
		}
	/**
     * Sets the last name of the contact.
     * @param newLastName The new last name for the contact.
     * @throws IllegalArgumentException If the new last name is invalid.
     */
	public void setLastName (String newLastName){
		if(newLastName == null || newLastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		lastName = newLastName;
		}
	 /**
     * Sets the phone number of the contact.
     * @param newPhoneNumber The new phone number for the contact.
     * @throws IllegalArgumentException If the new phone number is invalid.
     */
	public void setPhoneNumber (String newPhoneNumber) {
		if(newPhoneNumber == null || newPhoneNumber.length() > 10 || newPhoneNumber.length() < 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		phoneNumber = newPhoneNumber;
		}
	/**
     * Sets the address of the contact.
     * @param newAddress The new address for the contact.
     * @throws IllegalArgumentException If the new address is invalid.
     */
	public void setAddress(String newAddress) {
		if(newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		contactAddress = newAddress;
		}
	}


