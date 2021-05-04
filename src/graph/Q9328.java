package graph;

import java.io.*;
import java.util.*;

public class Q9328 {
    /*
    public static int R, C;
    public static char[][] plan;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            plan = new char[R + 2][C + 2];
            String line = "";
            for (int r = 0; r < R + 2; ++r) {
                if (r==0 || r==R+1) {
                    Arrays.fill(plan[r], '.');
                    continue;
                } else {
                    line = br.readLine();
                    plan[r][0] = '.';
                    plan[r][C+1] = '.';
                    for (int c=1; c<=C; ++c) {
                        plan[r][c] = line.charAt(c-1);
                    }
                }
            }
            boolean[] keys = new boolean[26];
            String key = br.readLine();
            if (!key.equals("0")) {
                for (int i = 0; i < key.length(); ++i) {
                    keys[key.charAt(i) - 'a'] = true;
                }
            }
            bw.append(String.valueOf(bfs(keys)));
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs (boolean[] keys) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        Queue<Coordinate> yet = new ArrayDeque<>();
        queue.add(new Coordinate(0, 0));
        boolean[][] visited = new boolean[R+2][C+2];
        visited[0][0] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int count = 0;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R+2<=nr || nc<0 || C+2<=nc) continue;
                if (visited[nr][nc]) continue;
                if (plan[nr][nc] == '*') {
                    continue;
                } else if (plan[nr][nc] == '$') {
                    ++count;
                } else if ('a' <= plan[nr][nc] && plan[nr][nc] <= 'z') {
                    if (!keys[plan[nr][nc]-'a']) {
                        keys[plan[nr][nc]-'a'] = true;
                        int size = yet.size();
                        for (int i=0; i<size; ++i) {
                            Coordinate test = yet.poll();
                            if (plan[test.r][test.c]-'A' == plan[nr][nc]-'a') {
                                visited[test.r][test.c] = true;
                                queue.add(new Coordinate(test.r, test.c));
                            } else {
                                yet.add(new Coordinate(test.r, test.c));
                            }
                        }
                    }
                } else if ('A' <= plan[nr][nc] && plan[nr][nc] <= 'Z') {
                    if (!keys[plan[nr][nc]-'A']) {
                        yet.add(new Coordinate(nr, nc));
                        continue;
                    }
                }
                visited[nr][nc] = true;
                queue.add(new Coordinate(nr, nc));
            }
        }
        return count;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c =c;
    }
}

 */