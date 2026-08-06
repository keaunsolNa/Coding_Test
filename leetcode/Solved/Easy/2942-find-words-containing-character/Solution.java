class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            // indexOf(int) 를 쓰면 단어마다 String 을 새로 만들지 않아도 된다.
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }

        return list;
    }
}
