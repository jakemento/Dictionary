import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordTest {

  // @Rule
  // public ClearRule clearRule = new ClearRule();

  @Test
  public void Word_instantiatesCorrectly() {
    Word testWord = new Word("dog");
    assertEquals(true, testWord instanceof Word);
  }
//
//   @Test
//   public void getFirstName_returnsFirstName_test() {
//     Contact testContact = new Contact("test", "test2", "August");
//     assertEquals("test", testContact.getFirstName());
//   }
//
//   @Test
//   public void getLastName_returnsLastName_test2() {
//     Contact testContact = new Contact("test", "test2", "August");
//     assertEquals("test2", testContact.getLastName());
//   }
//
//   @Test
//   public void getFullName_returnsFullName_test() {
//     Contact testContact = new Contact("test", "test2", "August");
//     assertEquals("test test2", testContact.getFullName());
//   }
//
//   @Test
//   public void getBirthMonth_returnsBirthMonth_August() {
//     Contact testContact = new Contact("test", "test2", "August");
//     assertEquals("August", testContact.getBirthMonth());
//   }
//
//   @Test
//   public void all_returnsAllContacts() {
//     Contact testContact = new Contact("test", "test2", "August");
//     Contact testContact2 = new Contact("test2", "test3", "October");
//     assertTrue(Contact.all().contains(testContact));
//     assertTrue(Contact.all().contains(testContact2));
//   }
//
//   @Test
//   public void getId_returnsIdOfContact_id() {
//     Contact testContact = new Contact("test", "test2", "August");
//     assertEquals(Contact.all().size(), testContact.getId());
//   }
//
//   @Test
//   public void find_returnsContactByItsID_testContact() {
//     Contact testContact = new Contact("test", "test2", "August");
//     Contact testContact2 = new Contact("test2", "test3", "October");
//     assertEquals(testContact2, Contact.find(testContact2.getId()));
//   }
//
//   @Test
//   public void find_throwsExceptionWhenIDIsOutOfBounds() {
//     Contact testContact = new Contact("test", "test2", "August");
//     Contact testContact2 = new Contact("test2", "test3", "October");
//     assertTrue(Contact.find(999) == null);
//   }
//
//   @Test
//   public void clear_clearsMemoryOfContact(){
//     Contact testContact = new Contact("test", "test2", "August");
//     Contact testContact2 = new Contact("test2", "test3", "October");
//     Contact.clear();
//     assertEquals(Contact.all().size(), 0);
//   }
//
//   @Test
//   public void getPhones_initiallyReturnsEmptyArrayList() {
//     Contact testContact = new Contact("test2", "test3", "October");
//     assertTrue(testContact.getPhones() instanceof ArrayList);
//   }
//
//   @Test
//   public void addPhone_addsPhoneObjectToPhoneArrayList() {
//     Contact testContact = new Contact("test2", "test3", "October");
//     Phone testPhone = new Phone("cell", "505", "555-5555");
//     testContact.addPhone(testPhone);
//     assertTrue(testContact.getPhones().contains(testPhone));
//   }
//
//   @Test
//   public void getEmails_initiallyReturnsEmptyArrayList() {
//     Contact testContact = new Contact("test2", "test3", "October");
//     assertTrue(testContact.getEmails() instanceof ArrayList);
//   }
//
//   @Test
//   public void addEmail_addsEmailObjectToEmailArrayList() {
//     Contact testContact = new Contact("test2", "test3", "October");
//     Email testEmail = new Email("personal", "test@gmail.com");
//     testContact.addEmail(testEmail);
//     assertTrue(testContact.getEmails().contains(testEmail));
//   }
//
//   @Test
//   public void getAddresses_initiallyReturnsEmptyArrayList() {
//     Contact testContact = new Contact("test2", "test3", "October");
//     assertTrue(testContact.getAddresses() instanceof ArrayList);
//   }
//
//   @Test
//   public void addAddress_addsAddressObjectToAddressArrayList() {
//     Contact testContact = new Contact("test2", "test3", "October");
//     Address testAddress = new Address("home", "123 E Burnside", "Portland", "OR", 97219);
//     testContact.addAddress(testAddress);
//     assertTrue(testContact.getAddresses().contains(testAddress));
//   }
}
