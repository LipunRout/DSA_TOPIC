public class B1 {
  static int binarySearch(int[] Arr, int key) {
    int st = 0;
    int end = Arr.length - 1;
    while (st <= end) {
      int mid = (st + end) / 2;
      if (Arr[mid] == key) {
        return mid;
      } else if (Arr[mid] < key) {
        st = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] Arr = { 1, 2, 3, 4, 5, 6, 7 };
    int key = 5;
    System.out.println("Found At index: " + binarySearch(Arr, key));
  }

}
