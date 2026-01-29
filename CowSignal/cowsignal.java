import java.util.*;
import java.io.*;

public class cowsignal {
    public static void main(String[] args) throws FileNotFoundException,IOException {

        Scanner sc = new Scanner(new File("cowsignal.in"));

        int M = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        String[] original = new String[M];
        for (int i = 0; i < M; i++) {
            original[i] = sc.nextLine();
        }
       
        String[] enlarged = new String[M*K];
        int pos1 = 0;

        for (int i = 0; i < M; i++) {

            String[] chars = original[i].split("");

            String[] wide = new String[N*K];
            int pos2 = 0;

            for (String c : chars) {
                for (int j = 0; j < K; j++) {
                    wide[pos2++] = c;
                }
            }

            String wideLine = String.join("", wide);

            for (int j = 0; j < K; j++) {
                enlarged[pos1++] = wideLine;
            }
        }

        File outfile = new File("cowsignal.out");
        FileWriter fw = new FileWriter(outfile); 
        for (String line : enlarged) {
            fw.write(line);
            fw.write("\n");
        }

        sc.close();
        fw.close();
    }
}
