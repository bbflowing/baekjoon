package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q5913 {
    /*
    public static int field [][];
    public static boolean visited [][];
    public static int count;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        field = new int [6][6];
        visited = new boolean [6][6];
        for (int i=0; i<N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            field[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }
        visited[1][1] = true;
        visited[5][5] = true;
        count = 0;
        solve(1, 1, 5, 5, 5*5-N-2);
        System.out.println(count);
    }

    public static void solve (int jx, int jy, int hx, int hy, int apples) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        if (apples == 0) {
            if (jx == hx && jy == hy) {
                ++count;
            }
            return;
        }

        ArrayList<Coordinate> joon = new ArrayList<>();
        ArrayList<Coordinate> hye = new ArrayList<>();
        for (int i=0; i<4; ++i) {
            int njx = jx + dx[i];
            int njy = jy + dy[i];

            if (njx<1 || 5<njx || njy<1 || 5<njy) {
                continue;
            }
            if (visited[njx][njy]) {
                continue;
            }
            if (field[njx][njy] == 1) {
                continue;
            }
            joon.add(new Coordinate(njx,njy));
        }

        for (int i=0; i<4; ++i) {
            int nhx = hx + dx[i];
            int nhy = hy + dy[i];

            if (nhx<1 || 5<nhx || nhy<1 || 5<nhy) {
                continue;
            }
            if (visited[nhx][nhy]) {
                continue;
            }
            if (field[nhx][nhy] == 1) {
                continue;
            }
            hye.add(new Coordinate(nhx,nhy));
        }

        if (joon.size() == 0 || hye.size() == 0) {
            return;
        }

        for (int i=0; i<joon.size(); ++i) {
            for (int a=0; a<hye.size(); ++a) {
                Coordinate j = joon.get(i);
                Coordinate h = hye.get(a);
                visited[j.x][j.y] = true;
                visited[h.x][h.y] = true;
                if (j.x == h.x && j.y == h.y && apples == 1) {
                    //System.out.println(j.x+","+j.y+","+h.x+","+h.y+","+(apples-1));
                    solve(j.x, j.y, h.x, h.y, apples-1);
                } else if ((j.x != h.x || j.y != h.y) && apples > 2) {
                    //System.out.println(j.x+","+j.y+","+h.x+","+h.y+","+(apples-2));
                    solve(j.x, j.y, h.x, h.y, apples-2);
                }
                visited[j.x][j.y] = false;
                visited[h.x][h.y] = false;
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */
