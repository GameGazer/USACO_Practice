import java.io.*;
import java.util.*;

public class MoreOddPhotos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int even = 0;
        int odd = 0;

        for (int i = 0; i < N; i++) { 
            int x = Integer.parseInt(st.nextToken());
            if ( x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int groups = 0;
        boolean nexteven = true;

        while (true) { 
            if (nexteven) { 
                if (even > 0) {
                    even--;
                    groups++;
                } else if (odd >=2) {
                    odd -= 2;
                    groups++;
                } else {
                    break;
                }
            } else {
                if (odd > 0) {
                    odd--;
                    groups++;
                } else {
                    break;
                }
            }
            nexteven = !nexteven;
        }

        if (nexteven && odd > 0) {
            groups--;
        }

        System.out.println(groups);
    }
}