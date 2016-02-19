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

  @Test
  public void getId_returnsId_Id() {
    Definition testDefinition = new Definition("a person who writes computer programs.");
    assertEquals(Definition.all().size(), testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionObjectWithId_testDefinition() {
    Definition testDefinition = new Definition("a person who writes computer programs.");
    assertEquals(testDefinition, Definition.find(testDefinition.getId()));
  }

  @Test
  public void find_throwsExceptionWhenIdIsNotFound() {
    Definition testDefinition = new Definition("a person who writes computer programs.");
    assertTrue(Definition.find(999) == null);
  }

  @Test
  public void clear_removesAllDefinitionObjects() {
    Definition testDefinition = new Definition("a person who writes computer programs.");
    Definition testDefinition2 = new Definition("a device that automatically controls the operation of something in accordance with a prescribed program.");
    Definition.clear();
    assertEquals(0, Definition.all().size());
  }
}
