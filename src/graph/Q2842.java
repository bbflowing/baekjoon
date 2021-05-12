package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2842 {
    /*
    public static int N;
    public static char[][] map;
    public static int[][] elevations;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        String line = "";
        Coordinate start = null;
        int count = 0;
        for (int r = 0; r < N; ++r) {
            line = br.readLine();
            for (int c = 0; c < N; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'P') start = new Coordinate(r, c);
                else if (map[r][c] == 'K') ++count;
            }
        }
        elevations = new int[N][N];
        ArrayList<Integer> numbers = new ArrayList<>();
        StringTokenizer st;
        for (int r = 0; r < N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; ++c) {
                elevations[r][c] = Integer.parseInt(st.nextToken());
                if (!numbers.contains(elevations[r][c])) numbers.add(elevations[r][c]);
            }
        }
        Collections.sort(numbers);
        solve(numbers, start, count);
    }

    public static void solve(ArrayList<Integer> numbers, Coordinate start, int count) {
        int minIndex = 0;
        int maxIndex = 0;
        int answer = Integer.MAX_VALUE;
        while (minIndex < numbers.size() && maxIndex < numbers.size()) {
            int min = numbers.get(minIndex);
            int max = numbers.get(maxIndex);
            if (elevations[start.r][start.c] > max || elevations[start.r][start.c] < min) {
                ++maxIndex;
                continue;
            }
            if (bfs(min, max, start, count)) {
                answer = Math.min(answer, max - min);
                ++minIndex;
            } else ++maxIndex;
        }
        System.out.println(answer);
    }


    public static boolean bfs(int min, int max, Coordinate start, int count) {
        boolean[][] visited = new boolean[N][N];
        visited[start.r][start.c] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir=0; dir<8; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (visited[nr][nc]) continue;
                if (min <= elevations[nr][nc] && elevations[nr][nc] <= max) {
                    if (map[nr][nc] == 'K') --count;
                    visited[nr][nc] = true;
                    queue.add(new Coordinate(nr, nc));
                }
            }
        }
        if (count == 0) return true;
        else return false;
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
