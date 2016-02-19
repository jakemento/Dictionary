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
//   public String getFirstName() {
//     return mFirstName;
//   }
//
//   public String getLastName() {
//     return mLastName;
//   }
//
//   public String getFullName() {
//     return mFirstName + " " + mLastName;
//   }
//
//   public String getBirthMonth() {
//     return mBirthMonth;
//   }
//
//   public static ArrayList<Contact> all() {
//     return instances;
//   }
//
//   public int getId() {
//     return mId;
//   }
//
//   public static Contact find(int id) {
//     try {
//       return instances.get(id - 1);
//     } catch (IndexOutOfBoundsException e) {
//       return null;
//     }
//   }
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
//
//   public ArrayList<Email> getEmails() {
//     return mEmails;
//   }
//
//   public void addEmail(Email email) {
//     mEmails.add(email);
//   }
//
//   public ArrayList<Address> getAddresses() {
//     return mAddresses;
//   }
//
//   public void addAddress(Address address) {
//     mAddresses.add(address);
//   }
}
