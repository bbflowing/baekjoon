package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2842 {
    /*
    public static int N, post;
    public static Coordinate start;
    public static char village[][];
    public static int elevations[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        village = new char[N][N];
        elevations = new int[N][N];
        start = null;
        post = 0;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                village[i][j] = line.charAt(j);
                if (village[i][j] == 'P') {
                    start = new Coordinate(i, j);
                } else if (village[i][j] == 'K') {
                    ++post;
                }
            }
        }

        StringTokenizer st;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                elevations[i][j] = Integer.parseInt(st.nextToken());
                if (!numbers.contains(elevations[i][j])) {
                    numbers.add(elevations[i][j]);
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
            if (max < elevations[start.x][start.y] || elevations[start.x][start.y] < min) {
                ++maxIndex;
                continue;
            }
            if (bfs(min, max)) {
                ++minIndex;
                answer = answer > max-min ? max-min : answer;
            } else {
                ++maxIndex;
            }
        }
        System.out.println(answer);
    }

    public static boolean bfs (int min, int max) {
        int dx[] = {-1, -1, -1, 0, 0, +1, +1, +1};
        int dy[] = {-1, 0, +1, -1, +1, -1, 0, +1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(start.x, start.y));
        boolean visited[][] = new boolean[N][N];
        int count = 0;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (village[c.x][c.y] == 'K') {
                ++count;
            }
            for (int dir=0; dir<8; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (elevations[nx][ny] < min || max < elevations[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny));
            }
        }
        if (count == post) {
            return true;
        } else {
            return false;
        }
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