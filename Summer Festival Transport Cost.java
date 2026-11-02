
public class Summer Festival Transport Cost{
    public static int transportCost(int N, int P, int Q) {
        int minCost = Integer.MAX_VALUE;

        int buses = (N + 79) / 80;

        for (int b = 0; b <= buses; b++) {
            int remaining = Math.max(0, N - b * 80);
            int shuttles = (remaining + 7) / 8;

            int cost = (b * P + shuttles * Q) * 75;

            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    public static void main(String[] args) {
        System.out.println(transportCost(240, 50, 8));
        System.out.println(transportCost(95, 60, 10));
    }
}
