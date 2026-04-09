import java.io.*;
import java.util.Arrays;

public class OutOfPlace {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("outofplace.in"));

        int N = Integer.parseInt(br.readLine());
        int[] cows = new int[N];
        int[] sortedCows = new int[N];
        for (int i = 0; i < N; i++) {
            cows[i] = Integer.parseInt(br.readLine());
            sortedCows[i] = cows[i];
        }
        
        Arrays.sort(sortedCows);

        int outofPlace = 0;
        for (int i = 0; i < N; i++) {
            if (cows[i] != sortedCows[i]) {
                outofPlace++;
            }
        }

        PrintWriter pw = new PrintWriter(new FileWriter("outofplace.out"));
        pw.println(Math.max(outofPlace - 1,0));

        pw.close();
        br.close();
    }
}
