import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void Word_instantiatesCorrectly() {
    Word testWord = new Word("dog");
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void getWordName_returnsWordsName_test() {
    Word testWord = new Word("dog");
    assertEquals("dog", testWord.getWordName());
  }

  @Test
  public void all_returnsAllWords() {
    Word testWord = new Word("dog");
    Word testWord2 = new Word("cat");
    assertTrue(Word.all().contains(testWord));
    assertTrue(Word.all().contains(testWord2));
  }

  @Test
  public void getId_returnsIdOfWord_id() {
    Word testWord = new Word("dog");
    assertEquals(Word.all().size(), testWord.getId());
  }

  @Test
  public void find_returnsWordByItsID_testWord() {
    Word testWord = new Word("dog");
    Word testWord2 = new Word("cat");
    assertEquals(testWord2, Word.find(testWord2.getId()));
  }

  @Test
  public void find_throwsExceptionWhenIDIsOutOfBounds() {
    Word testWord = new Word("dog");
    Word testWord2 = new Word("cat");
    assertTrue(Word.find(999) == null);
  }

  @Test
  public void clear_clearsMemoryOfWord(){
    Word testWord = new Word("dog");
    Word testWord2 = new Word("cat");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

  @Test
  public void getDefinitions_initiallyReturnsEmptyArrayList() {
    Word testWord = new Word("dog");
    assertTrue(testWord.getDefinitions() instanceof ArrayList);
  }

  @Test
  public void addDefinition_addsDefinitinoObjectToDefinitionArrayList() {
    Word testWord = new Word("otter");
    Definition testDefinition = new Definition("a playful river-dwelling creature");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }
}
