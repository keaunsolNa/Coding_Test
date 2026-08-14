class Solution {
    public String predictPartyVictory(String senate) {
        
        char[] arr = senate.toCharArray();
        List<Character> list = new ArrayList<>();

        for (char c : arr) list.add(c);

        while (list.size() == 1) {

            for (int i = 0; i < list.size(); i++) {

                boolean isRadiant = list.get(i) == 'R';

                for (int j = i + 1; j < list.size(); j++) {

                    if ((isRadiant && list.get(j) == 'D') || (!isRadiant && list.get(j) == 'R'))  {
                        list.remove(j);
                        break;
                    }
                }
                
            }
        }

        return (list.get(0) == 'R' ? "Radiant" : "Dire");
    }
}