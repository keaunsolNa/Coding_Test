class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        int arrayLength = arr.length;
      
        int minDifference = 1 << 30;
      
        for (int i = 0; i < arrayLength - 1; i++) {
            int currentDifference = arr[i + 1] - arr[i];
            minDifference = Math.min(minDifference, currentDifference);
        }
      
        List<List<Integer>> result = new ArrayList<>();
      
        for (int i = 0; i < arrayLength - 1; i++) {
            if (arr[i + 1] - arr[i] == minDifference) {
                result.add(List.of(arr[i], arr[i + 1]));
            }
        }
      
        return result;
    }
}