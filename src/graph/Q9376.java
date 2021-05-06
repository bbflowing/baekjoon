package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q9376 {
    /*
    public static int R, C;
    public static char[][] prison;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            prison = new char[R + 2][C + 2];
            String line = "";
            Coordinate first = null;
            Coordinate second = null;
            for (int r = 0; r < R + 2; ++r) {
                if (r == 0 || r == R + 1) Arrays.fill(prison[r], '.');
                else {
                    line = br.readLine();
                    for (int c = 0; c < C + 2; ++c) {
                        if (c == 0 || c == C + 1) {
                            prison[r][c] = '.';
                            continue;
                        } else {
                            prison[r][c] = line.charAt(c - 1);
                            if (prison[r][c] == '$') {
                                if (first == null) {
                                    first = new Coordinate(r, c, 0);
                                } else {
                                    second = new Coordinate(r, c, 0);
                                }
                            }
                        }
                    }
                }
            }
            Coordinate outside = new Coordinate(0, 0, 0);
            int[][] count1 = bfs(first);
            int[][] count2 = bfs(second);
            int[][] count3 = bfs(outside);
            int[][] result = new int[R+2][C+2];
            int min = Integer.MAX_VALUE;

            for (int r=0; r<R+2; ++r) {
                for (int c=0; c<C+2; ++c) {
                    if (count1[r][c] == -1 || count2[r][c] == -1 || count3[r][c] == -1) continue;
                    if (prison[r][c] == '#') {
                        result[r][c] = count1[r][c] + count2[r][c] + count3[r][c] - 2;
                    } else {
                        result[r][c] = count1[r][c] + count2[r][c] + count3[r][c];
                    }
                    min = Math.min(min, result[r][c]);
                }
            }
            bw.append(String.valueOf(min));
            bw.newLine();
        }
        bw.flush();
    }

    public static int[][] bfs (Coordinate start) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][] count = new int[R+2][C+2];
        for (int r=0; r<R+2; ++r) Arrays.fill(count[r], -1);
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);
        count[start.r][start.c] = 0;
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R+2<=nr || nc<0 || C+2<=nc) continue;
                if (prison[nr][nc] == '*') {
                    continue;
                } else if (prison[nr][nc] == '.' || prison[nr][nc] == '$') {
                    if (count[nr][nc] == -1 || cur.doors < count[nr][nc]) {
                        count[nr][nc] = cur.doors;
                        queue.add(new Coordinate(nr, nc, cur.doors));
                    }
                } else if (prison[nr][nc] == '#') {
                    if (count[nr][nc] == -1 || cur.doors+1 < count[nr][nc]) {
                        count[nr][nc] = cur.doors+1;
                        queue.add(new Coordinate(nr, nc, cur.doors+1));
                    }
                }
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
    int doors;

    Coordinate (int r, int c, int doors) {
        this.r = r;
        this.c = c;
        this.doors = doors;
    }
}
 */