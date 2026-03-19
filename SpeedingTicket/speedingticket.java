import java.io.*;
import java.util.*;

public class speedingticket {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("speeding.in"));
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] road = new int[100];
        int[] bessie = new int[100];

        int mile = 0;

        for (int i = 0; i < N; i++) {
            int length = sc.nextInt();
            int speedLimit = sc.nextInt();

            for (int j = 0; j < length; j++) {
                road[mile] = speedLimit;
                mile++;
            }
        }

        mile = 0;
        for (int i = 0; i < M; i++) {
            int length = sc.nextInt();
            int speed = sc.nextInt();

            for (int j = 0; j < length; j++) {
                bessie[mile] = speed;
                mile++;
            }
        }

        int maxOver = 0;
        for (int i = 0; i < 100; i++) {
            int over = bessie[i] - road[i];
            if (over > maxOver) {
                maxOver = over;
            }
        }

        PrintWriter out = new PrintWriter(new File("speeding.out"));
        out.println(maxOver);
        out.close();
        sc.close();
    }
}