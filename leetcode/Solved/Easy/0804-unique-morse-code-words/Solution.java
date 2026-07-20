class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] alp = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {

            char[] arr = words[i].toCharArray();
            String word = "";
            for (int j = 0; j < arr.length; j++) {

                int idx = arr[j] - 'a';
                word += alp[idx];
            }

            set.add(word);

        }       

        return set.size();
    }
}