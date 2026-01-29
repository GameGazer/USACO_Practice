//https://usaco.org/index.php?page=viewproblem2&cpid=615

import java.util.*;


public class milk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int M = sc.nextInt();

        int best = 0;

        for (int a = 0; a*X <= M; a++) {
            for (int b = 0; b*Y <= M; b++) {

                int total = a * X + b * Y;

                if (total <= M) {
                    best = Math.max(best,total);
                }
            }
        }
        
        System.out.println(best);
        sc.close();
        
        }
    }

