import java.io.*;

public class CowTipping{
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("cowtip.in"));
    
        int N = Integer.parseInt(br.readLine());
        int[][] cows = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                cows[i][j] = line.charAt(j) - '0';
            }
        }

        int flips = 0;

        for (int i = N - 1; i >=0; i--) {
            for (int j = N - 1; j >=0; j--) {
                if (cows[i][j] == 1) {
                    flips++;

                    for (int r = 0; r <= i; r++) {
                        for (int c = 0; c <= j; c++) {
                            cows[r][c] = 1 - cows[r][c];
                        }

                    }
                }
            }
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowtip.out")));
        out.println(flips);
        out.close();
        br.close();



    }
}