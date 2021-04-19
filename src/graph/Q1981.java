package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1981 {
    /*
    public static int N;
    public static int array[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N][N];
        StringTokenizer st;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                array[i][j] = Integer.parseInt(st.nextToken());
                if (!numbers.contains(array[i][j])) {
                    numbers.add(array[i][j]);
                }
            }
        }
        Collections.sort(numbers);
        solve(numbers);
    }

    public static void solve (ArrayList<Integer> numbers) {
        int minIndex = 0; int maxIndex = 0;
        int answer = 987_654_321;
        while (minIndex < numbers.size() && maxIndex < numbers.size()) {
            int min = numbers.get(minIndex);
            int max = numbers.get(maxIndex);
            if (array[0][0] < min || max < array[0][0]) {
                ++maxIndex;
                continue;
            }
            if (bfs(min, max)) {
                ++minIndex;
                answer = answer > (max-min) ? max-min : answer;
            } else {
                ++maxIndex;
            }
        }
        System.out.println(answer);
    }

    public static boolean bfs (int min, int max) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited[][] = new boolean[N][N];
        visited[0][0] = true;
        queue.add(new Coordinate(0, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == N-1 && c.y == N-1) {
                return true;
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (array[nx][ny] < min || max < array[nx][ny]) {
                    continue;
                }
                queue.add(new Coordinate(nx, ny));
                visited[nx][ny] = true;
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

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */