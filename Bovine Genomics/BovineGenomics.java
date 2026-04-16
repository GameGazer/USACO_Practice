import java.util.*;
import java.io.*;

public class BovineGenomics {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("cownomics.in"));

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] spotty = new String[N];
        String[] plain = new String[N];

        for (int i = 0; i < N; i++) {
            spotty[i] = sc.next();
        }

        for (int i = 0; i < N; i++) {
            plain[i] = sc.next();
        }

        int count = 0;

        for (int col = 0; col < M; col++) {
            boolean[] s = new boolean[4];
            boolean[] p = new boolean[4];

            for (int i = 0; i < N; i++) {
                char c = spotty[i].charAt(col);

                if (c == 'A') {
                    s[0] = true;
                } else if (c == 'C') {
                    s[1] = true;
                } else if (c == 'G') {
                    s[2] = true;
                } else {
                    s[3] = true;
                }
            }

            for (int i = 0; i < N; i++) {
                char c = plain[i].charAt(col);
                
                if (c == 'A') {
                    p[0] = true;
                } else if (c == 'C') {
                    p[1] = true;
                } else if (c == 'G') {
                    p[2] = true;
                } else {
                    p[  3] = true;
                }

            }

            boolean overlap = false;

            for (int i = 0; i < 4 ; i++) {
                if (s[i] && p[i]) {
                    overlap = true;
                    break;
                }
            }

            if (!overlap) {
                count++;
            }
        }
        PrintWriter out = new PrintWriter(new File("cownomics.out"));

        out.println(count);
        sc.close();
        out.close();
    }

}



