package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5427 {
    /*
    public static int R, C;
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; ++t) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            map = new char [R][C];
            int startX = 0; int startY = 0;
            Queue<Coordinate> fire = new LinkedList<>();
            for (int i=0; i<R; ++i) {
                String line = br.readLine();
                for (int j=0; j<C; ++j) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == '@') {
                        startX = i; startY = j;
                        map[i][j] = '.';
                    } else if (map[i][j] == '*') {
                        fire.add(new Coordinate(i, j));
                    }
                }
            }
            if (!bfs(startX, startY, fire)) {
                System.out.println("IMPOSSIBLE");
            }
        }
    }

    public static boolean bfs (int x, int y, Queue<Coordinate> fire) {
        boolean svisited [][] = new boolean [R][C];
        boolean fvisited [][] = new boolean [R][C];
        Queue<Coordinate> queue = new LinkedList<>();
        svisited[x][y] = true;
        queue.add(new Coordinate(x, y, 0));
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int fsize = fire.size();
            for (int i=0; i<fsize; ++i) {
                Coordinate f = fire.poll();
                fvisited[f.x][f.y] = true;
                for (int j=0; j<4; ++j) {
                    int nfx = f.x + dx[j];
                    int nfy = f.y + dy[j];

                    if (nfx<0 || R<=nfx || nfy<0 || C<=nfy) {
                        continue;
                    }
                    if (map[nfx][nfy] == '#' || map[nfx][nfy] == '*') {
                        continue;
                    }
                    if (fvisited[nfx][nfy]) {
                        continue;
                    }
                    fvisited[nfx][nfy] = true;
                    fire.add(new Coordinate(nfx, nfy));
                }
            }
            int ssize = queue.size();
            for (int i=0; i<ssize; ++i) {
                Coordinate s = queue.poll();
                for (int j=0; j<4; ++j) {
                    int nsx = s.x + dx[j];
                    int nsy = s.y + dy[j];

                    if (nsx<0 || R<=nsx || nsy<0 || C<=nsy) {
                        System.out.println(s.times+1);
                        return true;
                    }
                    if (map[nsx][nsy] == '#' || map[nsx][nsy] == '*' || fvisited[nsx][nsy]) {
                        continue;
                    }
                    if (svisited[nsx][nsy]) {
                        continue;
                    }
                    svisited[nsx][nsy] = true;
                    queue.add(new Coordinate(nsx, nsy, s.times+1));
                }
            }
        }
        return false;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int times;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int times) {
        this.x = x;
        this.y = y;
        this.times = times;
    }
}
 */