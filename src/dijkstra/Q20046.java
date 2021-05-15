package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//Road Reconstruction

public class Q20046 {
    /*
    public static int R, C;
    public static int[][] road;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        road = new int[R][C];
        int[][] visited = new int[R][C];
        for (int r = 0; r < R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < C; ++c) {
                road[r][c] = Integer.parseInt(st.nextToken());
                visited[r][c] = -1;
            }
        }
        if (road[0][0] == -1) System.out.println(-1);
        else solve(visited);
    }

    public static void solve(int[][] visited) {
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(0, 0, road[0][0]));
        visited[0][0] = road[0][0];
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == R-1 && cur.c == C-1) {
                System.out.println(cur.cost);
                return;
            }
                for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (road[nr][nc] >= 0) {
                    if (visited[nr][nc] == -1 || cur.cost + road[nr][nc] < visited[nr][nc]) {
                        visited[nr][nc] = cur.cost + road[nr][nc];
                        queue.add(new Coordinate(nr, nc, visited[nr][nc]));
                    }
                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r, c, cost;

    Coordinate(int r, int c, int cost) {
        this.r = r;
        this.c = c;
        this.cost = cost;
    }

    @Override
    public int compareTo(Coordinate c) {
        return this.cost - c.cost;
    }
}
 */
