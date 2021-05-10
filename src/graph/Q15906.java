package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q15906 {
    /*
    public static int N;
    public static char[][] map;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static int[][][] visited;
    public static Queue<Coordinate> queue;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int endR = Integer.parseInt(st.nextToken());
        int endC = Integer.parseInt(st.nextToken());
        map = new char[N][N];
        String line = "";
        for (int r = 0; r < N; ++r) {
            line = br.readLine();
            for (int c = 0; c < N; ++c) {
                map[r][c] = line.charAt(c);
            }
        }
        bfs(T, endR - 1, endC - 1);
    }

    public static void bfs(int T, int endR, int endC) {
        queue = new ArrayDeque<>();
        queue.add(new Coordinate(0, 0, 0, 0));
        visited = new int[2][N][N];
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < N; ++j) Arrays.fill(visited[i][j], -1);
        }
        visited[0][0][0] = 0;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == endR && cur.c == endC) continue;
            normalMove(cur.r, cur.c, cur.distance);
            if (cur.mode == 0) cur.distance += T;
            specialMove(cur.r, cur.c, cur.distance);
        }
        if (visited[0][endR][endC] == -1 && visited[1][endR][endC] != -1) {
            System.out.println(visited[1][endR][endC]);
        } else if (visited[0][endR][endC] != -1 && visited[1][endR][endC] == -1) {
            System.out.println(visited[0][endR][endC]);
        } else {
            System.out.println(Math.min(visited[0][endR][endC], visited[1][endR][endC]));
        }

    }
    public static void specialMove (int r, int c, int distance) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            while (0<=nr && nr<N && 0<=nc && nc<N && map[nr][nc] != '#') {
                nr += dr[dir]; nc += dc[dir];
            }
            if (0<=nr && nr<N && 0<=nc && nc<N &&
                    (distance+1 < visited[1][nr][nc] || visited[1][nr][nc] == -1)) {
                visited[1][nr][nc] = distance+1;
                queue.add(new Coordinate(1, nr, nc, distance+1));
            }
        }
    }

    public static void normalMove(int r, int c, int distance) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
            if (distance+1 < visited[0][nr][nc] || visited[0][nr][nc] == -1) {
                visited[0][nr][nc] = distance+1;
                queue.add(new Coordinate(0, nr, nc, distance+1));
            }
        }
    }
     */
}

/*
class Coordinate {
    int r, c, mode, distance;

    Coordinate(int mode, int r, int c, int distance) {
        this.mode = mode;
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */
