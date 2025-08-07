public class Largest {
  static int findLarget(int[] Arr) {
    int currentMax = Arr[0];
    for (int i = 1; i < Arr.length; i++) {
      if (currentMax < Arr[i]) {
        currentMax = Arr[i];
      }
    }
    return currentMax;

  }

  public static void main(String[] args) {
    int[] Arr = { 23, 45, 6, 424, 88, 76, 56 };
    int MaxNumber = findLarget(Arr);
    System.out.println(MaxNumber);

  }
}
