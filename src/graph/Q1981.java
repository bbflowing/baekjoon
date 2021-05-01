package graph;

import java.io.*;
import java.util.*;

public class Q1981 {
    /*
    public static int N;
    public static int[][] array;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Integer> numbers = new ArrayList<>();
        array = new int[N][N];
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                array[r][c] = Integer.parseInt(st.nextToken());
                if (!numbers.contains(array[r][c])) {
                    numbers.add(array[r][c]);
                }
            }
        }
        Collections.sort(numbers);
        solve(numbers);
    }

    public static void solve (ArrayList<Integer> numbers) throws IOException {
        int minIndex = 0; int maxIndex = 0;
        int answer = Integer.MAX_VALUE;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (minIndex < numbers.size() && maxIndex < numbers.size()) {
            int min = numbers.get(minIndex);
            int max = numbers.get(maxIndex);
            if (array[0][0] < min || max < array[0][0]) {
                ++maxIndex;
                continue;
            }
            if (bfs(min, max)) {
                ++minIndex;
                answer = Math.min(max-min, answer);
            } else {
                ++maxIndex;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        bw.append(sb);
        bw.flush();
    }

    public static boolean bfs (int min, int max) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][] visited = new boolean[N][N];
        visited[0][0] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(0, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == N-1 && c.c == N-1) {
                return true;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                if (min <= array[nr][nc] && array[nr][nc] <= max) {
                    visited[nr][nc] = true;
                    queue.add(new Coordinate(nr, nc));
                }
            }
        }
        return false;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
