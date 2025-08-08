public class Smallest {
  static int findLarget(int[] Arr) {
    int currentMax =Integer.MIN_VALUE;
    int currentMin =Integer.MAX_VALUE;
    for (int i = 1; i < Arr.length; i++) {
      if (currentMax < Arr[i]) {
        currentMax = Arr[i];
      }
      if(currentMin>Arr[i]) currentMin = Arr[i];
    }
    System.out.println("Smallest Value is :"+currentMin);
    return currentMax;

  }

  public static void main(String[] args) {
    int[] Arr = { 23, 45, 6, 424, 88, 76, 56 };
    System.out.println("Largest Value Is : "+findLarget(Arr));

  }
}
