
//https://usaco.org/index.php?page=viewproblem2&cpid=639

import java.io.*;
import java.util.*;

public class diamonds { // class name matches file name exactly
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // Read input file
        BufferedReader br = new BufferedReader(new FileReader("diamond.in"));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] diamonds = new int[N];
        for (int i = 0; i < N; i++) {
            diamonds[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        // Sort diamonds
        Arrays.sort(diamonds);

        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            int x = diamonds[i];
            int count = 0;
            
            for (int j = 0; j < N; j++) {
                if (diamonds[j] >= x && diamonds[j] <= x + K) {
                    count++;
            }
        }

         ans = Math.max(ans, count);

    }

   

    File outfile = new File("diamond.out");
    FileWriter fw = new FileWriter(outfile); 
    fw.write(ans + "\n");
    fw.close();
}
}