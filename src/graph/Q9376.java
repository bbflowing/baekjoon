package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q9376 {
    /*
    public static char[][] map;
    public static int R, C;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            map = new char[R+2][C+2];
            String line = "";
            Coordinate first = null;
            Coordinate second = null;
            for (int r=0; r<R+2; ++r) {
                if (r == 0 || r == R+1) {
                    Arrays.fill(map[r], '.');
                    continue;
                }
                line = br.readLine();
                for (int c=0; c<C+2; ++c) {
                    if (c == 0 || c == C+1) {
                        map[r][c] = '.';
                        continue;
                    }
                    map[r][c] = line.charAt(c-1);
                    if (map[r][c] == '$') {
                        if (first == null) first = new Coordinate(r, c, 0, 0);
                        else second = new Coordinate(r, c, 0, 0);
                    }
                }
            }
            int[][] result1 = bfs(first);
            int[][] result2 = bfs(second);
            int[][] result3 = bfs(new Coordinate(0, 0,0, 0));
            int[][] result = new int[R+2][C+2];
            int min = Integer.MAX_VALUE;
            for (int r=0; r<R+2; ++r) {
                for (int c=0; c<C+2; ++c) {
                    if (map[r][c] == '*') continue;
                    int temp = result1[r][c] + result2[r][c] + result3[r][c];
                    if (map[r][c] == '#') result[r][c] = temp-2;
                    else result[r][c] = temp;
                    if (0 <= result[r][c] && result[r][c] < min) min = result[r][c];
                }
            }
            bw.append(String.valueOf(min));
            bw.newLine();
        }
        bw.flush();
    }

    public static int[][] bfs(Coordinate start) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);
        int[][] visited = new int[R+2][C+2];
        for (int r=0; r<R+2; ++r) Arrays.fill(visited[r], -1);
        visited[start.r][start.c] = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R+2<=nr || nc<0 || C+2<=nc) continue;
                if (map[nr][nc] == '*') {
                    continue;
                } else if (map[nr][nc] == '#') {
                    if (visited[nr][nc] == -1 || cur.doors+1 < visited[nr][nc]) {
                        visited[nr][nc] = cur.doors+1;
                        queue.add(new Coordinate(nr, nc, cur.doors+1, cur.distance+1));
                    }
                } else {
                    if (visited[nr][nc] == -1 || cur.doors < visited[nr][nc]) {
                        visited[nr][nc] = cur.doors;
                        queue.add(new Coordinate(nr, nc, cur.doors, cur.distance+1));
                    }
                }
            }
        }
        return visited;
    }
     */
}

/*
class Coordinate {
    int r, c, doors, distance;

    Coordinate (int r, int c, int doors, int distance) {
        this.r = r;
        this.c = c;
        this.doors = doors;
        this.distance = distance;
    }
}
 */