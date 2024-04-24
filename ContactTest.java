/*Thomas Martin
 * CS-320-R4844 Software Test Automation& QA 24EW4
 * 3-2 Milestone: Contact Test
 * March 23, 2024
 */

package CS320MobileApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;	
import org.junit.jupiter.api.Test;

public class ContactTest {

	// Create a new Contact object with sample data
    @Test
    public void testContactConstructor() {
        Contact contact = new Contact("001", "FirstName", "LastName", "0000000001", "SampleAddress");

        assertEquals("001", contact.getId());
        assertEquals("FirstName", contact.getFirstName());
        assertEquals("LastName", contact.getLastName());
        assertEquals("0000000001", contact.getPhoneNumber());
        assertEquals("SampleAddress", contact.getAddress());
    }

 // Create a new Contact object with sample data
    @Test
    public void testContactSetters() {
        Contact contact = new Contact("002", "2FirstName", "2LastName", "002", "2SampleAddress");
     // Set new values using setter methods
        contact.setFirstName("FirstName");
        contact.setLastName("LastName");
        contact.setPhoneNumber("0000000000");
        contact.setAddress("sampleAddress");
     // Assert that the contact attributes are updated correctly
        assertEquals("FirstName", contact.getFirstName());
        assertEquals("LastName", contact.getLastName());
        assertEquals("0000000000", contact.getPhoneNumber());
        assertEquals("SampleAddress", contact.getAddress());
    }
}

