import java.io.*;
import java.util.*;

public class lostcow {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("lostcow.in"));

        int x = sc.nextInt();
        int y = sc.nextInt();

        int currentpos = x;
        int total = 0;
        int move = 1;

        while (true) {
            int nextmove = x + move;
            
            if (Math.min(currentpos, nextmove) <= y && y <= Math.max(currentpos,nextmove)) {

                total += Math.abs(y-currentpos);
                break;
            }

            total += Math.abs(nextmove - currentpos);
            currentpos = nextmove;

            move = move * -2;

        }

        PrintWriter out = new PrintWriter(new File("lostcow.out"));
        out.println(total);
        out.close();
        sc.close();
        
    }
}