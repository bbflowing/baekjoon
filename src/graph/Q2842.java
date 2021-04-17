package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2842 {
    /*
    public static int N, count;
    public static char map[][];
    public static int elevations[][];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        elevations = new int[N][N];
        ArrayList<Integer> numbers = new ArrayList<>();
        int startX = 0;
        int startY = 0;
        count = 0;
        for (int i = 0; i < N; ++i) {
            String line = br.readLine();
            for (int j = 0; j < N; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'P') {
                    startX = i;
                    startY = j;
                } else if (map[i][j] == 'K') {
                    ++count;
                }
            }
        }
        StringTokenizer st;
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; ++j) {
                elevations[i][j] = Integer.parseInt(st.nextToken());
                if (!numbers.contains(elevations[i][j])) {
                    numbers.add(elevations[i][j]);
                }
            }
        }
        Collections.sort(numbers);
        solve(startX, startY, numbers);
    }

    public static void solve(int x, int y, ArrayList<Integer> numbers) {
        int maxIndex = 0;
        int minIndex = 0;
        int answer = Integer.MAX_VALUE;
        while (maxIndex < numbers.size() && minIndex < numbers.size()) {
            int max = numbers.get(maxIndex);
            int min = numbers.get(minIndex);
            if (min > elevations[x][y] || elevations[x][y] > max) {
                ++maxIndex;
                continue;
            }
            boolean result = bfs(max, min, x, y);
            if (result) {
                answer = answer > max - min ? max - min : answer;
                ++minIndex;
            } else {
                ++maxIndex;
            }
        }
        System.out.println(answer);
    }

    public static boolean bfs(int max, int min, int x, int y) {
        int dx[] = {-1, -1, -1, 0, 0, +1, +1, +1};
        int dy[] = {-1, 0, +1, -1, +1, -1, 0, +1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited[][] = new boolean[N][N];
        visited[x][y] = true;
        queue.add(new Coordinate(x, y));
        int counter = 0;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir = 0; dir < 8; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx < 0 || N <= nx || ny < 0 || N <= ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (min <= elevations[nx][ny] && elevations[nx][ny] <= max) {
                    queue.add(new Coordinate(nx, ny));
                    visited[nx][ny] = true;
                    if (map[nx][ny] == 'K') {
                        ++counter;
                    }
                }
            }
        }
        if (counter == count) {
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

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */