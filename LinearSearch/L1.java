public class L1 {
  public static void main(String[] args) {
    int[] Arr = { 1, 2, 3, 4, 5, 6 };
    int key = 5;
    int idx = LSearch(Arr, key);
    if (idx == -1) {
      System.err.println("Not Found");
    } else
      System.out.println("Found At " + idx);

  }

  static int LSearch(int[] Arr, int key) {
    for (int i = 0; i < Arr.length; i++) {
      if (Arr[i] == key) {
        return i;
      }
    }
    return -1;
  }
}