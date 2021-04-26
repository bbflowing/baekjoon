package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2638 {
    /*
    public static Queue<Coordinate> air, cheese;
    public static int[][] grid;
    public static int R, C;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        grid = new int[R][C];
        air = new ArrayDeque<>();
        cheese = new ArrayDeque<>();
        int count = 0;
        for (int r = 0; r < R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < C; ++c) {
                grid[r][c] = Integer.parseInt(st.nextToken());
                if (grid[r][c] == 1) {
                    ++count;
                    cheese.add(new Coordinate(r, c));
                }
            }
        }
        int time = 0;
        grid[0][0] = -1;
        air.add(new Coordinate(0, 0));
        dfs(0, 0);
        while (count != 0) {
            ++time;
            count = solve(count);
        }
        System.out.println(time);

    }

    public static int solve(int count) {
        int[][] temp = new int[R][C];
        for (int r = 0; r < R; ++r) {
            temp[r] = grid[r].clone();
        }
        int size = cheese.size();
        for (int i = 0; i < size; ++i) {
            Coordinate c = cheese.poll();
            int counter = 0;
            for (int dir = 0; dir < 4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];
                if (nr < 0 || R <= nr || nc < 0 || C <= nc) {
                    continue;
                }
                if (temp[nr][nc] == -1) ++counter;
                if (counter == 2) {
                    grid[c.r][c.c] = -1;
                    air.add(new Coordinate(c.r, c.c));
                    --count;
                    break;
                }
            }
            if (counter < 2) {
                cheese.add(c);
            }
        }

        while (!air.isEmpty()) {
            Coordinate c = air.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];
                if (nr < 0 || R <= nr || nc < 0 || C <= nc) {
                    continue;
                }
                if (grid[nr][nc] == 0) {
                    grid[nr][nc] = -1;
                    air.add(new Coordinate(nr, nc));
                }
            }
        }
        return count;
    }

    public static void dfs(int r, int c) {
        for (int dir = 0; dir < 4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr < 0 || R <= nr || nc < 0 || C <= nc) {
                continue;
            }
            if (grid[nr][nc] == 0) {
                grid[nr][nc] = -1;
                dfs(nr, nc);
            }
        }
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