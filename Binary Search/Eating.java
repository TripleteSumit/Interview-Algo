import java.util.Arrays;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Broute force approch

        int minBanana = 1;

        while (true) {
            long totalTime = 0;
            for (int x : piles) {
                totalTime += (x / minBanana) + (x % minBanana != 0 ? 1 : 0);
            }
            if (totalTime > h)
                minBanana++;
            return minBanana;
        }

        // Optimal Approch solution;

        int minSpeed = 1, maxSpeed = Arrays.stream(piles).max().getAsInt();

        while (minSpeed < maxSpeed) {
            int midSpeed = (minBanana + maxSpeed) / 2;

            int totalTime = 0;

            for (int x : piles) {
                totalTime += x / midSpeed + (x % midSpeed != 0 ? 1 : 0);
            }

            if (totalTime > h)
                minBanana = midSpeed + 1;
            else
                maxSpeed = midSpeed;
        }
        return maxSpeed;
    }
}