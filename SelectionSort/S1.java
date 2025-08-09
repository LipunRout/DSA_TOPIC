public class S1 {
  public static void selectionSort(int[] Arr) {
    for (int i = 0; i < Arr.length - 1; i++) {
      int small = i;
      int swap=0;
      for (int j = i + 1; j < Arr.length; j++) {
        if (Arr[small] > Arr[j]) {
          small = j;
          swap++;
        }
      }
      if(swap==0) break;
      int temp=Arr[small];
      Arr[small]=Arr[i];
      Arr[i]=temp; 

    }
    printArr(Arr);

  }
  static void printArr(int[] Arr){
    for(int i =0 ;i<Arr.length;i++){
      System.out.print(Arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] Arr={1,2,3,4,5};
    selectionSort(Arr);
  } 
}
