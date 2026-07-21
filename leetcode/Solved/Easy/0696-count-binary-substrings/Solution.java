class Solution {
    public int countBinarySubstrings(String s) {
        
        int idx = 0;
        int length = s.length();
      
        List<Integer> list = new ArrayList<>();
      
        while (idx < length) {
            int count = 1;
          
            while (idx + 1 < length && s.charAt(idx + 1) == s.charAt(idx)) {
                idx++;
                count++;
            }
          
            list.add(count);
            idx++;
        }
      
        int result = 0;
      
        for (int i = 1; i < list.size(); i++) {
            result += Math.min(list.get(i - 1), list.get(i));
        }
      
        return result;
    }
}