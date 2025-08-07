public class L2 {
  public static void main(String[] args) {
    String[] Arr = { "Dosa","Idly","Samber","Chatni" };
    String Key="Samber";

    String res = LSearch(Arr, Key);
    if (res.equals("Not Found")) {
      System.err.println("Not Found");
    } else
      System.out.println("You're lookin for " + res);

  }

  static String LSearch(String[] Arr, String key) {
    for (String Dis:Arr) {
      if (Dis == key) {
        return Dis;
      }
    }
    return "Not Found";
  }
}
