public class Increasing {
  static void buubleSort(int[] Arr){
    
    for(int i=0;i<Arr.length-1;i++){
      int swap=0;
      for(int j=0;j<Arr.length-1-i;j++){
        if(Arr[j]>Arr[j+1]){
          int temp=Arr[j];
          Arr[j]=Arr[j+1];
          Arr[j+1]=temp;
          swap++;
        }
      }
      if(swap==0) {
        System.out.println("The Array IS sorted!");
        break; }
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
    buubleSort(Arr);
  }
  
}
