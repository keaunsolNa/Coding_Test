class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {

            int diff = Math.abs(arr[i + 1] - arr[i]);
            minDiff = Math.min(diff, minDiff);
        }   

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] - arr[i] == minDiff) {
                    
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[j]);
                    temp.add(arr[i]);
                    ans.add(temp);                    
                }
            }
        }

        return ans;
    }
}