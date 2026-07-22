class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) return false;
        
        char[] sArr = s.toCharArray();
        char[] goalArr = goal.toCharArray();

        char[] temp = new char[sArr.length + 1];

        
        int loop = 0;
        while (true) {

            boolean check = true;

            for (int i = 0; i < sArr.length; i++) {

                if (sArr[i] != goalArr[i]) {
                    check = false;
                    break;
                }
            }

            if (check) return check;
            
            for (char c : sArr) System.out.print(c);
            System.out.println();

            for (char c : temp) System.out.print(c);
            System.out.println();

            break;
            // temp[sArr.length - 2] = sArr[sArr.length - 1];
            // for (int i = 1; i < sArr.length; i++) {
            //     temp[i - 1] = sArr[i];
            // }

            // for (int i = 0; i < sArr.length; i++) sArr[i] = temp[i];

            // loop++;

            // if (loop > goal.length()) return false;


        }

        return false;
    }
}