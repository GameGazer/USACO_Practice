import java.io.*;
import java.util.*;

public class promotioncounting {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("promote.in"));
        
        int[] before = new int[4];
        int[] after = new int[4];

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            before[i] = Integer.parseInt(st.nextToken());
            after[i] = Integer.parseInt(st.nextToken());
        }

        /*

        Three promotions:
        1. Bronze --> Silver
        2. Silver --> Gold
        3. Gold --> Platinum

        */

        int goldtoplatinum = after[3] - before[3];
        int silvertogold = (after[2] - before[2]) + goldtoplatinum;
        int bronzetosilver = (after[1] - before[1]) + silvertogold;

        PrintWriter out = new PrintWriter(new FileWriter("promote.out"));
        out.println(bronzetosilver);
        out.println(silvertogold);
        out.println(goldtoplatinum);

        br.close();
        out.close();

    }
}
