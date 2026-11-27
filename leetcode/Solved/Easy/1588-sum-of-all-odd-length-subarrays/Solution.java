class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int length = arr.length;

        int[] odd = new int[length];
      
        int[] even = new int[length];
      
        odd[0] = arr[0];
        int totalSum = odd[0];
      
        for (int i = 1; i < length; ++i) {

            odd[i] = even[i - 1] + arr[i] * (i / 2 + 1);
            even[i] = odd[i - 1] + arr[i] * ((i + 1) / 2);
          
            totalSum += odd[i];
        }
      
        return totalSum;
    }
}