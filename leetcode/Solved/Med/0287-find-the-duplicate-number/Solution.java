class Solution {
    public int findDuplicate(int[] nums) {
        
        boolean[] arr = new boolean[1000000];

        for (int i : nums) {

            System.out.println(i + " " + arr[i]);
            if (!arr[i]) arr[i] = true;
            else return i;
        }

        return 0;
    }
}