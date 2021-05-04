package graph;

import java.io.*;
import java.util.*;

public class Q4991 {
    /*
    public static int R, C, answer;
    public static char[][] map;
    public static int[][] distances;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line);
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            map = new char[R][C];
            Coordinate start = null;
            ArrayList<Coordinate> dust = new ArrayList<>();
            for (int r = 0; r < R; ++r) {
                line = br.readLine();
                for (int c = 0; c < C; ++c) {
                    map[r][c] = line.charAt(c);
                    if (map[r][c] == 'o') {
                        start = new Coordinate(r, c);
                    } else if (map[r][c] == '*') {
                        dust.add(new Coordinate(r, c));
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
            int[] result = new int[dust.size()];
            boolean[] visited = new boolean[dust.size()];
            answer = Integer.MAX_VALUE;
            permutation(dust.size(), 0, result, visited);
            if (answer == Integer.MAX_VALUE) {
                answer = -1;
            }
            bw.append(String.valueOf(answer));
            bw.newLine();
        }
        bw.flush();
    }

    public static void permutation(int N, int index, int[] result, boolean[] visited) {
        if (N == index) {
            int[] route = new int[N + 1];
            route[0] = 0;
            for (int i = 1; i < N + 1; ++i) {
                route[i] = result[i - 1];
            }
            int temp = 0;
            for (int i = 0; i < N; ++i) {
                int begin = route[i];
                int end = route[i + 1];
                if (distances[begin][end] == -1) return;
                temp += distances[begin][end];
                if (temp > answer) return;
            }
            answer = temp;
            return;
        }

        for (int i = 0; i < N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i + 1;
                permutation(N, index + 1, result, visited);
                visited[i] = false;
            }
        }
    }

    public static int getDistance(Coordinate begin, Coordinate dst) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][] visited = new boolean[R][C];
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(begin.r, begin.c, 0));
        visited[begin.r][begin.c] = true;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == dst.r && cur.c == dst.c) {
                return cur.distance;
            }
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (visited[nr][nc]) continue;
                if (map[nr][nc] == 'x') continue;
                visited[nr][nc] = true;
                queue.add(new Coordinate(nr, nc, cur.distance + 1));
            }
        }
        return -1;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int distance;

    Coordinate(int r, int c) {
        this.r = r;
        this.c = c;
    }

    Coordinate(int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */