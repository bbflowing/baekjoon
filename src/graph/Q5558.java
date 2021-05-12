package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5558 {
    /*
    public static int R, C;
    public static int[][] input;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        input = new int[R][C];
        String line = "";
        Coordinate start = null;

        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                char target = line.charAt(c);
                if (target == 'S') start = new Coordinate(r, c, 1, 0);
                else if (target == 'X') input[r][c] = -1;
                else if ('1' <= target && target <= '9') input[r][c] = target-'0';
            }
        }
        bfs(start, max);
    }

    public static void bfs (Coordinate start, int max) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][][] visited = new boolean[max+1][R][C];
        visited[1][start.r][start.c] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.target == input[cur.r][cur.c]) {
                if (cur.target == max) {
                    System.out.println(cur.distance);
                    return;
                } else {
                    if (!visited[cur.target+1][cur.r][cur.c]) {
                        visited[cur.target+1][cur.r][cur.c] = true;
                        queue.add(new Coordinate(cur.r, cur.c, cur.target+1, cur.distance));
                    }
                    continue;
                }
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[cur.target][nr][nc]) continue;
                if (input[nr][nc] == -1) continue;
                queue.add(new Coordinate(nr, nc,  cur.target, cur.distance+1));
                visited[cur.target][nr][nc] = true;
            }
        }
    }
     */
}

/*
class Coordinate {
    int r, c, target, distance;

    Coordinate (int r, int c, int target, int distance) {
        this.r = r;
        this.c = c;
        this.target = target;
        this.distance = distance;
    }
}
 */