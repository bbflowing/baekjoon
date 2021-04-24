package graph;

import java.io.*;
import java.util.*;

public class Q4991 {
    /*
    public static int R, C, answer;
    public static char[][] room;
    public static int[][] distances;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line);
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            room = new char[R][C];
            ArrayList<Coordinate> dust = new ArrayList<>();
            Coordinate start = null;
            for (int r = 0; r < R; ++r) {
                line = br.readLine();
                for (int c = 0; c < C; ++c) {
                    room[r][c] = line.charAt(c);
                    if (room[r][c] == '*') {
                        dust.add(new Coordinate(r, c));
                    } else if (room[r][c] == 'o') {
                        start = new Coordinate(r, c);
                    }
                }
            }
            dust.add(0, start);
            distances = new int[dust.size()][dust.size()];
            for (int i = 0; i < dust.size() - 1; ++i) {
                Coordinate begin = dust.get(i);
                for (int j = i + 1; j < dust.size(); ++j) {
                    Coordinate dst = dust.get(j);
                    distances[i][j] = getDistance(begin, dst);
                    distances[j][i] = distances[i][j];
                }
            }
            dust.remove(0);
            boolean[] visited = new boolean[dust.size()];
            int[] result = new int[dust.size()];
            answer = Integer.MAX_VALUE;
            permutation(dust.size(), 0, visited, result);
            if (answer == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(answer);
            }
        }
    }

    public static void permutation (int N, int index, boolean[] visited, int[] result) {
        if (index == N) {
            int[] route = new int[N+1];
            route[0] = 0;
            for (int i=1; i<N+1; ++i) {
                route[i] = result[i-1];
            }
            int temp = 0;
            for (int i=0; i<route.length-1; ++i) {
                int begin = route[i];
                int end = route[i+1];

                if (distances[begin][end] == 0) {
                    return;
                }
                temp += distances[begin][end];
                if (temp > answer) {
                    return;
                }
            }
            answer = Math.min(answer, temp);
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i+1;
                permutation(N, index+1, visited, result);
                visited[i] = false;
            }
        }

    }

    public static int getDistance (Coordinate begin, Coordinate dst) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][] visited = new boolean[R][C];
        Queue<Coordinate> queue = new ArrayDeque<>();
        visited[begin.r][begin.c] = true;
        queue.add(new Coordinate(begin.r, begin.c, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == dst.r && c.c == dst.c) {
                return c.distance;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                if (room[nr][nc] == 'x') {
                    continue;
                }
                visited[nr][nc] = true;
                queue.add(new Coordinate(nr, nc, c.distance+1));
            }
        }
        return 0;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int distance;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }

    Coordinate (int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */