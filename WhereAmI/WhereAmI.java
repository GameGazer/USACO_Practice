import java.io.*;
import java.util.*;

public class WhereAmI{
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("whereami.in"));
        PrintWriter out = new PrintWriter(new FileWriter("whereami.out"));  
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int answer = N;

        for (int k = 1; k <= N; k++) {
            HashSet<String> seen = new HashSet<String>();
            boolean valid = true;

            for (int i = 0; i <=N - k; i++) {
                String sub = s.substring(i,i+k);
                if (seen.contains(sub)) {
                    valid = false;
                    break;
                }

                seen.add(sub);

            }

            if (valid) {
                answer = k;
                break;
            }
        }

        
        
        out.println(answer);
        out.close();
        br.close();
    }
}
