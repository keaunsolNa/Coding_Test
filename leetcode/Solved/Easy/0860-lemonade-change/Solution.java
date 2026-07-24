class Solution {
    public boolean lemonadeChange(int[] bills) {

        int charg = 0;

        for (int pay : bills) {
            System.out.println(charg + " : " + pay);
            if (pay == 5) charg += pay;
            else {

                if (charg - pay > 0) {
                    charg = charg - pay;
                }
                else return false;
            }


        }   

        return true;
    }
}