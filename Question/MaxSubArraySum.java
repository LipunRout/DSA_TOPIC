public class MaxSubArraySum {
  static void kadenAlgo(int[] Arr){
    int cs=0;
    int ms=Integer.MIN_VALUE;
    for (int i = 0; i < Arr.length; i++) {
      cs+=Arr[i];
      if(cs>=0){
        ms=Math.max(cs, ms);
      }
      else{
        cs=0;
      }
        
    }
    System.out.println(ms);

  }
  static void maxSumSubArray(int[] Arr){
    int maxSum = 0;
    int[] prefixSum = new int[Arr.length];
    prefixSum[0]=Arr[0];
    //PrefixSum Calculated Here!!
    for(int i=1;i<Arr.length;i++){
      prefixSum[i]=prefixSum[i-1]+Arr[i];
    }

    for (int i = 0; i < Arr.length; i++) {
      for (int j = i; j < Arr.length; j++) {
        int curSum = i == 0?prefixSum[j]:prefixSum[j]-prefixSum[i-1];
        
        if (curSum > maxSum) {
          maxSum = curSum;
        }
      }
    }
    System.out.println(maxSum);

  }

  
  public static void main(String[] args) {
    int[] Arr = { 1, 2, 3, 4 };
    maxSumSubArray(Arr);
    kadenAlgo(Arr);
    
  }

}
