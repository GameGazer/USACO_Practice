import java.util.*;

public class Kayaking {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] w = new int[2*n];

        for (int i = 0; i < 2 * n; i++) {
            w[i] = sc.nextInt();
        }

        Arrays.sort(w);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 2*n; i++) {
            for (int j = i + 1; j < 2 * n ; j++) {
                List<Integer> list = new ArrayList<>();

                for (int k = 0 ; k < 2*n; k++) {
                    if (k != i && k != j) {
                        list.add(w[k]);
                    }
                }

                int total = 0;

                for (int k = 0; k < list.size(); k+=2) {
                    total += list.get(k+1) - list.get(k);
                }

                ans = Math.min(ans,total);
            }

        }

        System.out.println(ans);
        sc.close();
    }    
}
