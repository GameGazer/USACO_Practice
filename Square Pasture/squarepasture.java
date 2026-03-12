import java.io.*;
import java.util.*;

public class squarepasture {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("square.in"));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //First Rectangle

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        //Second Rectangle
        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());

        //Overlapping Square

        int minX = Math.min(x1,x3);
        int maxX = Math.max(x2,x4);
        int minY = Math.min(y1,y3);
        int maxY = Math.max(y2,y4);

        int width = maxX - minX;
        int length = maxY - minY;

        int side = Math.max(width,length);

        int area = side * side;

        PrintWriter out = new PrintWriter(new File("square.out"));
        out.println(area);
        out.close();
        br.close();
    }
}