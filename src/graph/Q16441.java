package graph;

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
        String line = "";
        ArrayList<Coordinate> wolves = new ArrayList<>();
        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'W') wolves.add(new Coordinate(r, c));
            }
        }
        visited = new boolean[R][C];
        for (int i = 0; i < wolves.size(); ++i) {
            Coordinate start = wolves.get(i);
            bfs(start);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int r = 0; r < R; ++r) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < C; ++c) {
                if (!visited[r][c] && map[r][c] == '.') sb.append("P");
                else sb.append(map[r][c]);
            }
            bw.append(sb);
            bw.newLine();
        }
        bw.flush();
    }

    public static void bfs(Coordinate start) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start.r][start.c] = true;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (map[nr][nc] == '#') {
                    continue;
                } else if (map[nr][nc] == '+') {
                    while (true) {
                        nr += dr[dir]; nc += dc[dir];

                        if (nr < 0 || R <= nr || nc < 0 || C <= nc) break;
                        if (map[nr][nc] == '#' || map[nr][nc] == '.') {
                            if (map[nr][nc] == '#') {
                                nr -= dr[dir]; nc -= dc[dir];
                            }
                            if (!visited[nr][nc]) {
                                visited[nr][nc] = true;
                                queue.add(new Coordinate(nr, nc));
                            }
                            break;
                        }
                    }
                }
                if (visited[nr][nc]) continue;
                visited[nr][nc] = true;
                queue.add(new Coordinate(nr, nc));
            }
        }
    }
     */
}

/*
class Coordinate {
    int r, c;

    Coordinate(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */