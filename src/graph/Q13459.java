package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q13459 {
    /*
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        Coordinate hole = null; Coordinate red = null; Coordinate blue = null;

        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == 'O') {
                    hole = new Coordinate(i, j);
                } else if (input[i][j] == 'R') {
                    red = new Coordinate(i, j);
                } else if (input[i][j] == 'B') {
                    blue = new Coordinate(i, j);
                }
            }
        }
        bfs(hole, red, blue, N, M);
    }

    public static void bfs (Coordinate hole, Coordinate red, Coordinate blue, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean visited [][][][] = new boolean [N][M][N][M];
        Queue<Coordinate> redQ = new LinkedList<>();
        Queue<Coordinate> blueQ = new LinkedList<>();
        visited[red.x][red.y][blue.x][blue.y] = true;
        redQ.add(new Coordinate(red.x, red.y, 0));
        blueQ.add(new Coordinate(blue.x, blue.y, 0));

        while (!redQ.isEmpty() || !blueQ.isEmpty()) {
            Coordinate cr = redQ.poll();
            Coordinate cb = blueQ.poll();
            if (cr.times >= 10 || cb.times >= 10) {
                System.out.println(0);
            }

            for (int i=0; i<4; ++i) {
                Coordinate nb = move(cb, i);
                if (nb.x == hole.x && nb.y == hole.y) {
                    continue;
                }
                Coordinate nr = move(cr, i);
                if (nr.x == hole.x && nr.y == hole.y) {
                    System.out.println(1);
                }

                if (nb.x == nr.x && nb.y == nr.y) {
                    if (cb.x < cr.x) {
                        ++nr.x;
                    } else if (cb.x > cr.x) {
                        ++nb.x;
                    } else if (cb.y < cr.y) {

                    }
                }

            }
        }

    }

    public static Coordinate move (Coordinate location, int direction) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        int nx = location.x; int ny = location.y;
        while (true) {
            nx += dx[direction];
            ny += dy[direction];

            if (input[nx][ny] == 'O') {
                return new Coordinate(nx, ny);
            }

            if (input[nx][ny] == '#') {
                nx -= dx[direction];
                ny -= dy[direction];
                return new Coordinate(nx, ny);
            }
        }
    }

     */
}

/*
class Coordinate {
    int x;
    int y;
    int times;

    Coordinate (int x, int y, int times) {
        this.x = x;
        this.y = y;
        this.times = times;
    }

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

 */
