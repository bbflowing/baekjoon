package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q10711 {
    /*
    public static int R, C;
    public static int[][] castle;
    public static Queue<Coordinate> queue;
    public static boolean[][] visited;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        castle = new int[R][C];
        String line = "";
        queue = new ArrayDeque<>();
        visited = new boolean[R][C];
        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                char target = line.charAt(c);
                if (target != '.') {
                    castle[r][c] = target - '0';
                } else {
                    queue.add(new Coordinate(r, c));
                    visited[r][c] = true;
                }
            }
        }
        int time = 0;
        while (true) {
            ++time;
            solve();
            if (queue.size() == 0) break;
        }
        System.out.println(time - 1);
    }

    public static void solve() {
        int size = queue.size();
        for (int i = 0; i < size; ++i) {
            Coordinate cur = queue.poll();
            ArrayList<Coordinate> list = setEmpty(cur.r, cur.c);
            if (!list.isEmpty()) {
                for (Coordinate c : list) {
                    queue.add(c);
                }
            }
        }
    }

    public static ArrayList<Coordinate> setEmpty(int r, int c) {
        int[] dr = {-1, -1, -1, 0, 0, +1, +1, +1};
        int[] dc = {-1, 0, +1, -1, +1, -1, 0, +1};
        ArrayList<Coordinate> next = new ArrayList<>();

        for (int dir = 0; dir < 8; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
            if (castle[nr][nc] > 0) --castle[nr][nc];
            if (castle[nr][nc] == 0 && !visited[nr][nc]) {
                visited[nr][nc] = true;
                next.add(new Coordinate(nr, nc));
            }
        }
        return next;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;

    Coordinate(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
