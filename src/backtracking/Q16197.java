package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16197 {
    /*
    public static char map [][];
    public static int R, C;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        boolean flag = false;
        Coordinate coin1 = null; Coordinate coin2 = null;

        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'o') {
                    if (!flag) {
                        coin1 = new Coordinate(i, j);
                        flag = true;
                    } else {
                        coin2 = new Coordinate(i, j);
                    }
                }
            }
        }
        bfs(coin1, coin2);
    }

    public static void bfs (Coordinate coin1, Coordinate coin2) {
        boolean visited [][][][] = new boolean [R][C][R][C];
        Queue<Coordinate> queue1 = new LinkedList<>();
        Queue<Coordinate> queue2 = new LinkedList<>();
        queue1.add(new Coordinate(coin1.x, coin1.y, 0));
        queue2.add(new Coordinate(coin2.x, coin2.y, 0));
        visited[coin1.x][coin1.y][coin2.x][coin2.y] = true;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            Coordinate c1 = queue1.poll();
            Coordinate c2 = queue2.poll();

            if (10 <= c1.times || 10 <= c2.times) {
                System.out.println(-1);
                return;
            }

            for (int i=0; i<4; ++i) {
                int c1x = c1.x + dx[i];
                int c1y = c1.y + dy[i];

                int c2x = c2.x + dx[i];
                int c2y = c2.y + dy[i];

                if ((c1x<0 || R<=c1x || c1y<0 || C<=c1y) &&
                        (0<=c2x && c2x<R && 0<=c2y && c2y<C)) {
                    System.out.println(c1.times+1);
                    return;
                } else if ((c2x<0 || R<=c2x || c2y<0 || C<=c2y) &&
                        (0<=c1x && c1x<R && 0<=c1y && c1y<C)) {
                    System.out.println(c2.times+1);
                    return;
                } else if ((c1x<0 || R<=c1x || c1y<0 || C<=c1y) &&
                        (c2x<0 || R<=c2x || c2y<0 || C<=c2y)) {
                    continue;
                }

                if (visited[c1x][c1y][c2x][c2y]) {
                    continue;
                }

                if (map[c1x][c1y] == '#' && map[c2x][c2y] == '#') {
                    continue;
                } else if (map[c1x][c1y] == '#' && map[c2x][c2y] != '#') {
                    c1x -= dx[i]; c1y -= dy[i];
                } else if (map[c1x][c1y] != '#' && map[c2x][c2y] == '#') {
                    c2x -= dx[i]; c2y -= dy[i];
                }

                visited[c1x][c1y][c2x][c2y] = true;
                queue1.add(new Coordinate(c1x, c1y, c1.times+1));
                queue2.add(new Coordinate(c2x, c2y, c2.times+1));
            }
        }
        System.out.println(-1);
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

    Coordinate(int x, int y, int times) {
        this.x = x;
        this.y = y;
        this.times = times;
    }
}
 */
