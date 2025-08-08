public class ReverseArray {
  static void reverseArray(int[] Arr) {
    int st = 0, end = Arr.length - 1;
    while (st < end) {
      int temp = Arr[st];
      Arr[st] = Arr[end];
      Arr[end] = temp;
      st++;
      end--;
    }
    for (int x : Arr) {
      System.out.print(x + " ");
    }
  }

  public static void main(String[] args) {
    int[] Arr = { 1, 2, 3, 4, 5 };
    reverseArray(Arr);
  }

}
