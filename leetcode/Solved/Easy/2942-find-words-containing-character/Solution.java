class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            String str = words[i];
            int idx = str.indexOf(x + "");

            if (idx != -1) list.add(i);
        }

        return list;
    }
}