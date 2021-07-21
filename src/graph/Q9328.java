package graph;

// 열쇠

import java.io.*;
import java.util.*;

public class Q9328 {
    /*
    public static int R, C;
    public static char[][] building;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        String line = "";
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            building = new char[R+2][C+2];
            for (int r=0; r<R+2; ++r) {
                if (r == 0 || r == R+1) {
                    Arrays.fill(building[r], '.');
                    continue;
                } else {
                    line = br.readLine();
                    for (int c = 0; c < C + 2; ++c) {
                        if (c == 0 || c == C+1) {
                            building[r][c] = '.';
                            continue;
                        } else {
                            building[r][c] = line.charAt(c-1);
                        }
                    }
                }
            }
            line = br.readLine();
            boolean[] keys = new boolean[26];
            if (!line.equals("0")) {
                for (int i=0; i<line.length(); ++i) keys[line.charAt(i)-'a'] = true;
            }
            int result = solve(keys);
            bw.append(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();
    }

    public static int solve(boolean[] keys) {
        Queue<Location> queue = new ArrayDeque<>();
        Queue<Location> locked = new ArrayDeque<>();
        boolean[][] visited = new boolean[R + 2][C + 2];
        queue.add(new Location(0, 0));
        visited[0][0] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int count = 0;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 0 || R + 2 <= nr || nc < 0 || C + 2 <= nc) continue;
                if (visited[nr][nc]) continue;
                if (building[nr][nc] == '$') {
                    ++count;
                    visited[nr][nc] = true;
                    queue.add(new Location(nr, nc));
                } else if (building[nr][nc] == '*') {
                    continue;
                } else if ('a' <= building[nr][nc] && building[nr][nc] <= 'z') {
                    visited[nr][nc] = true;
                    queue.add(new Location(nr, nc));
                    if (!keys[building[nr][nc] - 'a']) {
                        keys[building[nr][nc] - 'a'] = true;
                        int size = locked.size();
                        for (int i = 0; i < size; ++i) {
                            Location l = locked.poll();
                            if (building[l.r][l.c] - 'A' == building[nr][nc] - 'a') {
                                visited[l.r][l.c] = true;
                                queue.add(new Location(l.r, l.c));
                            } else {
                                locked.add(l);
                            }
                        }
                    }
                } else if ('A' <= building[nr][nc] && building[nr][nc] <= 'Z') {
                    if (!keys[building[nr][nc] - 'A']) {
                        locked.add(new Location(nr, nc));
                    } else {
                        visited[nr][nc] = true;
                        queue.add(new Location(nr, nc));
                    }
                } else if (building[nr][nc] == '.') {
                    visited[nr][nc] = true;
                    queue.add(new Location(nr, nc));
                }
            }
        }
        return count;
    }
     */
}

/*
class Location {
    int r, c;

    Location (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */