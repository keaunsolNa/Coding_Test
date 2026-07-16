class Solution {
    public int[] sortByBits(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            
            int count = Integer.bitCount(arr[i]);
            arr[i] = arr[i] + (count * 100000);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i] % 100000;
        }

        return arr;
    }
}