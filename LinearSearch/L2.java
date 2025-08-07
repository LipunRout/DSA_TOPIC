public class L2 {
  public static void main(String[] args) {
    String[] Arr = { "Dosa","Idly","Samber","Chatni" };
    String Key="Samber";

    String res = LSearch(Arr, Key);
    if (res=="Not Found") {
      System.err.println("Not Found");
    } else
      System.out.println("You're lookin for " + res);

  }

  static String LSearch(String[] Arr, String key) {
    for (int i = 0; i < Arr.length; i++) {
      if (Arr[i] == key) {
        return Arr[i];
      }
    }
    return "Not Found";
  }
}
