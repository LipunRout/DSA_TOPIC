public class PairsInArray {
  static void pair(int[] Arr){
    int sa=0;
    int sum=0;
    for(int i=0;i<Arr.length;i++){
      for(int j=i;j<Arr.length;j++){
        for(int k=i;k<=j;k++){
          System.out.print(Arr[k]+" ");
          sum+=Arr[k]; 
        }
        System.out.println();
        System.out.println("Total Sum Of this Sub arry  is"+sum);
        sum=0;
        sa++;
        System.out.println();
      }
      
      System.out.println();
    }
    System.out.println("Total Sub Arrays : "+sa);
  }
  public static void main(String[] args) {
    int[] Arr = { 1, 2, 3, 4, 5 };
    pair(Arr);
    
  }
}

