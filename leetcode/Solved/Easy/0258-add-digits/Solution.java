class Solution {
    public int addDigits(int num) {
        
        int target = num;
        int hab = 0;

        while(true) {

            System.out.println(target + "  : " + hab);

            while (target > 10) {

                hab += target % 10;
                target /= 10;
            }

            System.out.println("AFTER : " + target + "  : " + hab);
            if (hab < 10) return target;

            target = hab;
            hab = 0;

        }

    }
}