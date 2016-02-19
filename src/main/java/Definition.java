import java.util.ArrayList;

public class Definition {
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private String mMeaning;
  private int mId;
//
  public Definition(String meaning) {
    mMeaning = meaning;
    instances.add(this);
    mId = instances.size();
  }
//
//   public String getType() {
//     return mType;
//   }
//
//   public String getAreaCode() {
//     return mAreaCode;
//   }
//
//   public String getPhoneNumber() {
//     return mPhoneNumber;
//   }
//
//   public static ArrayList<Phone> all() {
//     return instances;
//   }
//
//   public int getId() {
//     return mId;
//   }
//
//   public static Phone find(int id) {
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
}
