class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (Math.abs(arr[i] - arr[j]) > a) continue;
                
                for (int k = j + 1; k < arr.length; k++) {

                    if (Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[i] - arr[k]) <= c)
                    {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        ans++;
                    }   
                }
            }
        }       

        return ans;
    }
}