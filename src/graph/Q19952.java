package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q19952 {
    public static int map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; ++t) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int O = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            map = new int [H][W];
            ArrayList<Barrier> barriers = new ArrayList<>();

            for (int i=0; i<O; ++i) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int height = Integer.parseInt(st.nextToken());
                map[x][y] = height;
                barriers.add(new Barrier(x, y, height));
            }
            bfs(startX, startY, barriers, endX, endY, F, H, W);
        }
    }

    public static void bfs (int startX, int startY, ArrayList<Barrier> barriers,
                            int endX, int endY, int F, int H, int W) {



        
    }

}

class Barrier {
    int x;
    int y;
    int height;

    Barrier (int x, int y, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }
}
