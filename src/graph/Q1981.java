package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1981 {
    /*
    public static int N;
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        input = new int [N+1][N+1];
        StringTokenizer st;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=N; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (!numbers.contains(input[i][j])) {
                    numbers.add(input[i][j]);
                }
            }
        }
        Collections.sort(numbers);
        solve(numbers);
    }

    public static void solve (ArrayList<Integer> numbers) {
        int maxIndex = 0;
        int minIndex = 0;
        int answer = 987_654_321;
        while (maxIndex < numbers.size() && minIndex < numbers.size()) {
            int max = numbers.get(maxIndex);
            int min = numbers.get(minIndex);
            if (bfs (max, min)) {
                answer = max-min<answer ? max-min : answer;
                ++minIndex;
            } else {
                ++maxIndex;
            }
        }
        System.out.println(answer);
    }

    public static boolean bfs (int max, int min) {
        if (max < input[1][1] || input[1][1] < min) {
            return false;
        }

        boolean visited [][] = new boolean [N+1][N+1];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(1, 1));
        visited[1][1] = true;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == N && c.y == N) {
                return true;
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<1 || N<nx || ny<1 || N<ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (min <= input[nx][ny] && input[nx][ny] <= max) {
                    queue.add(new Coordinate(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
        return false;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */