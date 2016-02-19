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

  @Test
  public void getMeaning_instantiatesCorrectly_aPersonWhoWritesComputerPrograms() {
    Definition testDefinition = new Definition("a person who writes computer programs.");
    assertEquals("a person who writes computer programs.", testDefinition.getMeaning());
  }
  @Test
  public void all_returnsAllDefinitionEntries() {
    Definition testDefinition = new Definition("a person who writes computer programs.");
    Definition testDefinition2 = new Definition("a device that automatically controls the operation of something in accordance with a prescribed program.");
    assertTrue(Definition.all().contains(testDefinition));
    assertTrue(Definition.all().contains(testDefinition2));
  }

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
