class Solution {
    public int addDigits(int num) {
        
        int target = num;
        int hab = 0;

        while(true) {

            while (target >= 10) {

                hab += target % 10;
                target /= 10;
            }

            hab += target;

            if (hab < 10) return hab;

            target = hab;
            hab = 0;

        }

    }
}