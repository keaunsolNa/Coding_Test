class Solution {
    public boolean lemonadeChange(int[] bills) {

        int[] charg = new int[] {0, 0, 0};

        for (int pay : bills) {


            switch (pay) {

                case 5 : charg[0]++; break;
                case 10 : {
                    if (charg[0] == 0) return false;
                    charg[1]++;
                    charg[0]--;
                    break;
                }

                case 20 : {

                    if (charg[0] > 0 && charg[1] > 0) {

                        charg[0]--;
                        charg[1]--;
                        charg[2]++;
                    }
                    else if (charg[0] > 1 && charg[1] == 0) {

                        charg[0] -= 2;
                        charg[2]++;    
                    }
                    else return false;

                }
            }

            return true;

        }   

        return true;
    }
}