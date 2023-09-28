class Solution {
    public int solution(String myString, String pat) {

        char[] carr = myString.toCharArray();
        myString = "";
        for(int i = 0; i < carr.length; i++) {
            carr[i] = carr[i] == 'A' ? 'B' : carr[i] == 'B' ? 'A' : carr[i];
            myString += carr[i];
        }
        
        return myString.contains(pat) ? 1 : 0;
    }
}