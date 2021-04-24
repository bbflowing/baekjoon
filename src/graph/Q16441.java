package graph;

import java.io.*;
import java.util.*;

public class Q16441 {
    /*
    public static int R, C;
    public static char[][] map;
    public static boolean[][] visited;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visited = new boolean[R][C];
        ArrayList<Coordinate> wolves = new ArrayList<>();
        String line;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'W') {
                    wolves.add(new Coordinate(r, c));
                    visited[r][c] = true;
                }
            }
        }

        for (int i=0; i<wolves.size(); ++i) {
            Coordinate wolf = wolves.get(i);
            bfs(wolf);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int r=0; r<R; ++r) {
            StringBuilder sb = new StringBuilder();
            for (int c=0; c<C; ++c) {
                if (map[r][c] == '.' && !visited[r][c]) {
                    sb.append("P");
                } else {
                    sb.append(map[r][c]);
                }
            }
            bw.append(sb);
            bw.newLine();
        }
        bw.flush();
    }

    public static void bfs (Coordinate wolf) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(wolf);

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                if (map[nr][nc] == '#') {
                    continue;
                } else if (map[nr][nc] == '+') {
                    while (true) {
                        nr += dr[dir];
                        nc += dc[dir];

                        if (nr<0 || R<=nr || nc<0 || C<=nc) {
                            break;
                        }
                        if (map[nr][nc] == '#') {
                            nr -= dr[dir];
                            nc -= dc[dir];
                            break;
                        } else if (map[nr][nc] == '.') {
                            break;
                        }
                    }
                    if (!visited[nr][nc]) {
                        visited[nr][nc] = true;
                        queue.add(new Coordinate(nr, nc));
                    }
                } else {
                    visited[nr][nc] = true;
                    queue.add(new Coordinate(nr, nc));
                }
            }
        }
    }
     */
}

/*
class Coordinate {
    int r;
    int c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */