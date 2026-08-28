class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int total = 0;
        while (mainTank >= 5) {
            
            total += Math.min(mainTank, 5);
            mainTank = Math.max(0, mainTank - 5);
            if (additionalTank > 0) 
            {
                mainTank++;
                additionalTank--;
            }

            System.out.println(mainTank + " " + additionalTank + " " + total);
        }

        total += mainTank;

        return total * 10;

    }
}