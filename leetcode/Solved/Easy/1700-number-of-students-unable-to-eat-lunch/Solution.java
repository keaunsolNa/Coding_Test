class Solution {

    public int countStudents(int[] students, int[] sandwiches) {
        
        int[] count = new int[2];
      
        for (int preference : students) {
            count[preference]++;
        }
      
        for (int sandwichType : sandwiches) {
            if (count[sandwichType] == 0) {
                return count[sandwichType ^ 1];
            }
            count[sandwichType]--;
        }
      
        return 0;
    }
}