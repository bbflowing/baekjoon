package graph;

import java.io.*;
import java.util.*;

public class Q9328 {
    /*
    public static int R, C;
    public static char[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; ++t) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            map = new char[R + 2][C + 2];
            String line = "";
            for (int r = 0; r < R + 2; ++r) {
                if (r == 0 || r == R + 1) {
                    Arrays.fill(map[r], '.');
                    continue;
                }
                line = br.readLine();
                for (int c = 0; c < C + 2; ++c) {
                    if (c == 0 || c == C + 1) map[r][c] = '.';
                    else map[r][c] = line.charAt(c - 1);
                }
            }
            line = br.readLine();
            boolean[] keys = new boolean[26];
            if (!line.equals("0")) {
                for (int i = 0; i < line.length(); ++i) keys[line.charAt(i) - 'a'] = true;
            }
            bw.append(String.valueOf(bfs(keys)));
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs(boolean[] keys) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        Queue<Coordinate> locked = new ArrayDeque<>();
        boolean[][] visited = new boolean[R + 2][C + 2];
        visited[0][0] = true;
        queue.add(new Coordinate(0, 0));
        int max = 0;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr < 0 || R + 2 <= nr || nc < 0 || C + 2 <= nc) continue;
                if (visited[nr][nc]) continue;
                if (map[nr][nc] == '*') {
                    continue;
                } else if (map[nr][nc] == '$') {
                    ++max;
                    visited[nr][nc] = true;
                    queue.add(new Coordinate(nr, nc));
                } else if ('A' <= map[nr][nc] && map[nr][nc] <= 'Z') {
                    if (keys[map[nr][nc] - 'A']) {
                        visited[nr][nc] = true;
                        queue.add(new Coordinate(nr, nc));
                    } else {
                        locked.add(new Coordinate(nr, nc));
                    }
                } else if ('a' <= map[nr][nc] && map[nr][nc] <= 'z') {
                    if (!keys[map[nr][nc]-'a']) {
                        keys[map[nr][nc] - 'a'] = true;
                        visited[nr][nc] = true;
                        queue.add(new Coordinate(nr, nc));
                        int size = locked.size();
                        for (int i = 0; i < size; ++i) {
                            Coordinate c = locked.poll();
                            if (map[c.r][c.c]-'A' == map[nr][nc]-'a') {
                                visited[c.r][c.c] = true;
                                queue.add(new Coordinate(c.r, c.c));
                            } else {
                                locked.add(new Coordinate(c.r, c.c));
                            }
                        }
                    }
                } else if (map[nr][nc] == '.') {
                    visited[nr][nc] = true;
                    queue.add(new Coordinate(nr, nc));
                }
            }
        }
        return max;
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