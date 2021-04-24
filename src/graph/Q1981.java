package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1981 {
    /*
    public static int N;
    public static int[][] array;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N+1][N+1];
        StringTokenizer st;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int r=1; r<=N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=1; c<=N; ++c) {
                array[r][c] = Integer.parseInt(st.nextToken());
                if (!numbers.contains(array[r][c])) {
                    numbers.add(array[r][c]);
                }
            }
        }
        Collections.sort(numbers);
        solve(numbers);
    }

    public static void solve(ArrayList<Integer> numbers) {
        int minIndex = 0; int maxIndex = 0;
        int answer = Integer.MAX_VALUE;

        while (minIndex < numbers.size() && maxIndex < numbers.size()) {
            int min = numbers.get(minIndex);
            int max = numbers.get(maxIndex);
            if (array[1][1] < min || max < array[1][1]) {
                ++maxIndex;
                continue;
            }
            if (bfs(min, max)) {
                answer = answer > max-min ? max-min : answer;
                ++minIndex;
            } else {
                ++maxIndex;
            }
        }
        System.out.println(answer);
    }

    public static boolean bfs (int min, int max) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][] visited = new boolean[N+1][N+1];
        visited[1][1] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(1, 1));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == N && c.c == N) {
                return true;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<1 || N<nr || nc<1 || N<nc) {
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

    Coordinate(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */