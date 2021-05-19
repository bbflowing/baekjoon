package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q17244 {
    public static int R, C, min;
    public static char[][] house;
    public static ArrayList<Coordinate> belongings;
    public static int[][] distances;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        house = new char[R][C];
        String line = "";
        Coordinate start = null;
        Coordinate end = null;
        belongings = new ArrayList<>();
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                house[r][c] = line.charAt(c);
                if (house[r][c] == 'S') start = new Coordinate(r, c, 0);
                else if (house[r][c] == 'E') end = new Coordinate(r, c);
                else if (house[r][c] == 'X') belongings.add(new Coordinate(r, c));
            }
        }
        belongings.add(0, start);
        belongings.add(end);
        distances = new int[belongings.size()][belongings.size()];
        for (int i=0; i<belongings.size()-1; ++i) {
            Coordinate begin = belongings.get(i);
            for (int j=i+1; j<belongings.size(); ++j) {
                Coordinate dst = belongings.get(j);
                distances[i][j] = getDistance(begin, dst);
                distances[j][i] = distances[i][j];
            }
        }
        belongings.remove(0);
        belongings.remove(belongings.size()-1);
        int[] result = new int[belongings.size()];
        boolean[] visited = new boolean[belongings.size()];
        min = Integer.MAX_VALUE;
        permutation(belongings.size(), 0, visited, result);
        System.out.println(min);
    }

    public static int getDistance(Coordinate begin, Coordinate dst) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[R][C];
        visited[begin.r][begin.c] = true;
        queue.add(begin);
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == dst.r && cur.c == dst.c) {
                return cur.distance;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc]) continue;
                if (house[nr][nc] == '#') continue;
                visited[nr][nc] = true;
                queue.add(new Coordinate(nr, nc, cur.distance+1));
            }
        }
        return -1;
    }

    public static void permutation(int N, int index, boolean[] visited, int[] result) {
        if (index == N) {
            int[] route = new int[N+2];
            route[0] = 0;
            for (int i=0; i<result.length; ++i) route[i+1] = result[i];
            route[N+1] = N+1;
            int total = 0;
            for (int i=0; i<N+1; ++i) {
                total += distances[route[i]][route[i+1]];
                if (min < total) return;
            }
            min = total;
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
}

class Coordinate {
    int r, c, distance;

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