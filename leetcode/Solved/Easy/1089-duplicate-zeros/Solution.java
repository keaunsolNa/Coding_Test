class Solution {
    public void duplicateZeros(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        int length = arr.length;

        for (int i = 0; i < length; i++) {

            if (arr[i] == 0) {

                list.add(0);
                list.add(0);
                length--;

            }   
            else {
                list.add(arr[i]);
            } 
        }
    }
}