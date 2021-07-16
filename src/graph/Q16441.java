package graph;

// 아기돼지와 늑대

import java.io.*;
import java.util.*;

public class Q16441 {
    /*
    public static int R, C;
    public static char[][] map;
    public static boolean[][] visited;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        Queue<Location> wolves = new ArrayDeque<>();
        visited = new boolean[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'W') {
                    wolves.add(new Location(r, c, 0));
                    visited[r][c] = true;
                }
            }
        }
        bfs(wolves);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (map[r][c] == '.' && !visited[r][c]) bw.append("P");
                else bw.append(map[r][c]);
            }
            bw.newLine();
        }
        bw.flush();
    }

    public static void bfs(Queue<Location> wolves) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!wolves.isEmpty()) {
            Location cur = wolves.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (!check(nr, nc)) continue;
                if (visited[nr][nc]) continue;
                if (map[nr][nc] == '#') continue;
                else if (map[nr][nc] == '+') {
                    while (true) {
                        nr += dr[dir];
                        nc += dc[dir];
                        if (!check(nr, nc)) break;
                        if (map[nr][nc] == '.') {
                            if (!visited[nr][nc]) {
                                visited[nr][nc] = true;
                                wolves.add(new Location(nr, nc, cur.distance + 1));
                            }
                            break;
                        } else if (map[nr][nc] == '#') {
                            nr -= dr[dir];
                            nc -= dc[dir];
                            if (!visited[nr][nc]) {
                                visited[nr][nc] = true;
                                wolves.add(new Location(nr, nc, cur.distance + 1));
                            }
                            break;
                        }
                    }
                } else {
                    visited[nr][nc] = true;
                    wolves.add(new Location(nr, nc, cur.distance+1));
                }
            }
        }

    }

    public static boolean check(int r, int c) {
        if (r<0 || R<=r || c<0 || C<=c) return false;
        return true;
    }
     */
}

/*
class Location {
    int r, c, distance;

    Location(int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */