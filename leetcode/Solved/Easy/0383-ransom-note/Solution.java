class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int index = 0;
        int cnt = ransomNote.length();
        for (char c : ransomNote.toCharArray()) {

            for (int i = index; i < magazine.length(); i++) {
                
                index++;
                if (magazine.charAt(i) == c) {
                    cnt--;
                    break;
                }                
            }
        }

        return cnt == 0;
    }
}