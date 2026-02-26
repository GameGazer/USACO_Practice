import java.util.*;
import java.io.*;

public class WatchingMooloo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();

        long totalCost = 0;
        long lastActiveDay = -1;

        for (int i = 0; i < N; i++) {
            long today = sc.nextLong();

            if (lastActiveDay == -1) {
                totalCost += K + 1;

            } else {
                long gap = today - lastActiveDay;
                totalCost += Math.min(gap, K + 1);
            }

            lastActiveDay = today;
        }

        System.out.println(totalCost);
        sc.close();

    }
}