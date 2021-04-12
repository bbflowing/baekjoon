package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q3055 {
    /*
    public static int R, C;
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        Queue<Coordinate> wQ = new LinkedList<>();
        Queue<Coordinate> hQ = new LinkedList<>();
        boolean wVisited [][] = new boolean [R][C];
        boolean hVisited [][] = new boolean [R][C];
        int endX = 0; int endY = 0;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == '*') {
                    wQ.add(new Coordinate(i, j));
                    wVisited [i][j] = true;
                } else if (map[i][j] == 'S') {
                    hQ.add(new Coordinate(i, j));
                    hVisited[i][j] = true;
                } else if (map[i][j] == 'D') {
                    endX = i; endY = j;
                }
            }
        }
        bfs(wQ, hQ, wVisited, hVisited, endX, endY);
    }

    public static void bfs (Queue<Coordinate> wQ, Queue<Coordinate> hQ,
                            boolean [][] wVisited, boolean [][] hVisited, int endX, int endY) {

        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int time = 0;
        while (!hQ.isEmpty()) {
            ++time;
            int wSize = wQ.size();
            for (int i=0; i<wSize; ++i) {
                Coordinate w = wQ.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nwx = w.x + dx[dir];
                    int nwy = w.y + dy[dir];

                    if (nwx < 0 || R <= nwx || nwy < 0 || C <= nwy) {
                        continue;
                    }
                    if (map[nwx][nwy] == 'X' || map[nwx][nwy] == 'D') {
                        continue;
                    }
                    if (wVisited[nwx][nwy]) {
                        continue;
                    }
                    wQ.add(new Coordinate(nwx, nwy));
                    wVisited[nwx][nwy] = true;
                }
            }

            int hSize = hQ.size();
            for (int i=0; i<hSize; ++i) {
                Coordinate h = hQ.poll();

                for (int dir=0; dir<4; ++dir) {
                    int nhx = h.x + dx[dir];
                    int nhy = h.y + dy[dir];

                    if (nhx<0 || R<=nhx || nhy<0 || C<=nhy) {
                        continue;
                    }
                    if (map[nhx][nhy] == 'X' || wVisited[nhx][nhy]) {
                        continue;
                    }
                    if (hVisited[nhx][nhy]) {
                        continue;
                    }
                    if (nhx == endX && nhy == endY) {
                        System.out.println(time);
                        return;
                    }
                    hQ.add(new Coordinate(nhx, nhy));
                    hVisited[nhx][nhy] = true;
                }
            }
            if (hQ.size() == 0) {
                System.out.println("KAKTUS");
                return;
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