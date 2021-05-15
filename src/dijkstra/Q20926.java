package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q20926 {
    /*
    public static int R, C;
    public static int[][] maze;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        maze = new int[R][C];
        int[][] visited = new int[R][C];
        String line = "";
        Coordinate start = null;
        Coordinate end = null;
        for (int r=0; r<R; ++r) {
            Arrays.fill(visited[r], -1);
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                char target = line.charAt(c);
                if (target == 'T') start = new Coordinate(r, c, 0);
                else if (target == 'E') {
                    maze[r][c] = -1;
                    end = new Coordinate(r, c, 0);
                } else if (target == 'R') maze[r][c] = -2;
                else if (target == 'H') maze[r][c] = -3;
                else maze[r][c] = target-'0';
            }
        }
        System.out.println(solve(start, end, visited));
    }

    public static int solve(Coordinate start, Coordinate end, int[][] visited) {
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(start);
        visited[start.r][start.c] = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == end.r && cur.c == end.c) return cur.time;
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r; int nc = cur.c; int ntime = cur.time;
                while (true) {
                    nr += dr[dir]; nc += dc[dir];
                    if (nr<0 || R<=nr || nc<0 || C<=nc) break;
                    if (maze[nr][nc] < 0) {
                        if (maze[nr][nc] == -2 || maze[nr][nc] == -1) {
                            if (maze[nr][nc] == -2) {
                                nr -= dr[dir];
                                nc -= dc[dir];
                            }
                            if (visited[nr][nc] == -1 || ntime < visited[nr][nc]) {
                                visited[nr][nc] = ntime;
                                queue.add(new Coordinate(nr, nc, ntime));
                            }
                        }
                        break;
                    }
                    ntime += maze[nr][nc];
                }
            }
        }
        return -1;
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r, c, time;

    Coordinate (int r, int c, int time) {
        this.r = r;
        this.c = c;
        this.time = time;
    }
    @Override
    public int compareTo(Coordinate c) {
        return this.time - c.time;
    }
}
 */
