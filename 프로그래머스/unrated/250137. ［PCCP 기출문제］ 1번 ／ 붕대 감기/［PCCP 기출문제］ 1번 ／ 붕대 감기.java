class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int time = 0;
        int index = 0;
        int maintainSec = 0;
        int currentHealth = health;
        
        do {

            time++;

            if (attacks[index][0] == time) {

                currentHealth = Math.max(currentHealth - attacks[index][1], 0);
                if (currentHealth == 0) return -1;
                maintainSec = 0;

                index++;

            } else {
                currentHealth = Math.min(currentHealth + bandage[1], health);
                maintainSec++;

                if (maintainSec == bandage[0]) {
                    currentHealth = Math.min(currentHealth + bandage[2], health);
                    maintainSec = 0;
                }
            }

        } while (index != attacks.length);

        return currentHealth;
    }
}