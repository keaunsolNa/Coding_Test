class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int total = 0;
        while (mainTank >= 5) {
            
            total += Math.max(mainTank, 5);
            mainTank = Math.max(0, mainTank - 5);
            if (additionalTank > 0) 
            {
                mainTank++;
                additionalTank--;
                total++;
            }

            System.out.println(mainTank + " " + additionalTank + " " + total);
        }

        return total * 10;

    }
}