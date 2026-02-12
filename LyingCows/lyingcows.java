//https://usaco.org/index.php?page=viewproblem2&cpid=1228

import java.util.*;
import java.io.*;

public class lyingcows {
    static class Cow implements Comparable<Cow> {
        char statement;
        int pos;
        public Cow(char statement, int pos) {
            this.statement = statement;
            this.pos = pos;
        }
  @Override
    public int compareTo(Cow c) {
        if (pos != c.pos) { return pos - c.pos; }
        return statement - c.statement;
        }
 }
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner sc = new Scanner(new File("lyingcows.in"));

        int N = sc.nextInt();
        sc.nextLine();

        Cow[] cows = new Cow[N];

        for (int i = 0; i < N; i++) {
            String[] groups = sc.nextLine().split(" ");
            String type = groups[0];
            int number = Integer.parseInt(groups[1]);
            cows[i] = new Cow(type.charAt(0), number);
        }

        Arrays.sort(cows);
     
        int[] lyingleft = new int[N];

        for (int i = 1; i < N; i++) {
            lyingleft[i] += lyingleft[i-1];
            if (cows[i-1].statement == 'L') {
            lyingleft[i]++;
            }
        }

        int[] lyingright = new int[N];

        for (int i = N - 2; i >= 0; i--) {
            lyingright[i] += lyingright[i+1];
            if (cows[i+1].statement == 'G') {
                lyingright[i]++;
            }
        }

        int true_minimum = N;

        for (int i = 0; i < N; i++) {
            true_minimum = Math.min(true_minimum,lyingleft[i]+lyingright[i]);
        }

      
        PrintWriter outfile= new PrintWriter("lyingcows.out");
        outfile.println(true_minimum);
        sc.close();
        outfile.close();
    }
}