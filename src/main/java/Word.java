import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> instances = new ArrayList<Word>();
  // private ArrayList<Definition> mDefinitions;

  private String mNameOfWord;
  private int mId;

  public Word(String wordName) {
    mNameOfWord = wordName;
    instances.add(this);
    mId = instances.size();
    // mDefinitions = new ArrayList<Definition>();
  }
//
  public String getWordName() {
    return mNameOfWord;
  }
//
//
//
  public static ArrayList<Word> all() {
    return instances;
  }
//
  public int getId() {
    return mId;
  }
//
  public static Word find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
//
//   public static void clear() {
//     instances.clear();
//   }
//
//   public ArrayList<Phone> getPhones() {
//     return mPhones;
//   }
//
//   public void addPhone(Phone phone) {
//     mPhones.add(phone);
//   }
}
