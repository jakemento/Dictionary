import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {
  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void definition_instantiatesCorrectly() {
    Definition testDefinition = new Definition("a person who writes computer programs.");
    assertEquals(true, testDefinition instanceof Definition);
  }
//
//   @Test
//   public void getType_instantiatesCorrectly_cell() {
//     Phone testPhone = new Phone("cell", "503", "555-5555");
//     assertEquals("cell", testPhone.getType());
//   }
//
//   @Test
//   public void getAreaCode_returnsAreaCode_503() {
//     Phone testPhone = new Phone("cell", "503", "555-5555");
//     assertEquals("503", testPhone.getAreaCode());
//   }
//
//   @Test
//   public void getPhoneNumber_returnsPhoneNumber_555_5555() {
//     Phone testPhone = new Phone("cell", "503", "555-5555");
//     assertEquals("555-5555", testPhone.getPhoneNumber());
//   }
//
//   @Test
//   public void all_returnsAllPhoneEntries() {
//     Phone testPhone = new Phone("cell", "503", "555-5555");
//     Phone testPhone2 = new Phone("home", "555", "555-5555");
//     assertTrue(Phone.all().contains(testPhone));
//     assertTrue(Phone.all().contains(testPhone2));
//   }
//
//   @Test
//   public void getId_returnsId_Id() {
//     Phone testPhone = new Phone("cell", "503", "555-5555");
//     assertEquals(Phone.all().size(), testPhone.getId());
//   }
//
//   @Test
//   public void find_returnsPhoneObjectWithId_testPhone() {
//     Phone testPhone = new Phone("cell", "503", "555-5555");
//     assertEquals(testPhone, Phone.find(testPhone.getId()));
//   }
//
//   @Test
//   public void find_throwsExceptionWhenIdIsNotFound() {
//     Phone testPhone = new Phone("cell", "503", "555-5555");
//     assertTrue(Phone.find(999) == null);
//   }
//
//   @Test
//   public void clear_removesAllPhoneObjects() {
//     Phone testPhone = new Phone("cell", "503", "555-5555");
//     Phone testPhone2 = new Phone("home", "555", "555-5555");
//     Phone.clear();
//     assertEquals(0, Phone.all().size());
//   }
}
