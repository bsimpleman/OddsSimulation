import java.util.Random;

public class Main {

    public static void main (String[] args) {
        final int TRADES_OFFERED = 263; // Number of trades Dream performed
        final int TRADES_REQUIRED = 42; // 42 was what Dream acquired
        int pearlTrades;
        int randNum;
        int attemptsTried = 0;
        boolean tradesMet = false;
        long startTime = System.currentTimeMillis();
        long estimatedTime;

        Random random = new Random();

        while (!tradesMet) {
            attemptsTried++;
            pearlTrades = 0;
            for (int i = 0; i < TRADES_OFFERED; i++) {
                randNum = random.nextInt(109) + 1;
                if (randNum <= 5) {
                    pearlTrades++;
                }
            }
            if (pearlTrades >= TRADES_REQUIRED) {
                System.out.println("Trades met!");
                System.out.print("Attempts taken: ");
                System.out.printf("%,d", attemptsTried);
                tradesMet = true;
            } else {
                System.out.println("Attempt failed!");
                System.out.print("Current Attempt: ");
                System.out.printf("%,d\n", attemptsTried);
            }
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("\nTime taken: " + estimatedTime + " milliseconds");
        System.out.println("Time taken: " + estimatedTime / 1000.0 + " seconds");
    }
}
