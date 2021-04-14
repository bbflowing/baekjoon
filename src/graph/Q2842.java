package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2842 {
    /*
    public static int N, targets;
    public static char village [][];
    public static int elevations [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        village = new char [N][N];
        elevations = new int [N][N];
        targets = 0;
        Coordinate post = null;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                village[i][j] = line.charAt(j);
                if (village[i][j] == 'P') {
                    post = new Coordinate(i, j);
                } else if (village[i][j] == 'K') {
                    ++targets;
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
        solve(numbers, post);
    }

    public static void solve (ArrayList<Integer> numbers, Coordinate post) {
        int maxIndex = 0; int minIndex = 0; int answer = 987_654_321;
        while (maxIndex < numbers.size() && minIndex < numbers.size()) {
            int max = numbers.get(maxIndex);
            int min = numbers.get(minIndex);
            if (max < elevations[post.x][post.y] || elevations[post.x][post.y] < min) {
                ++maxIndex;
                continue;
            }
            if (bfs(max, min, post)) {
                answer = max-min<answer ? max-min:answer;
                ++minIndex;
            } else {
                ++maxIndex;
            }
        }
        System.out.println(answer);
    }

    public static boolean bfs (int max, int min, Coordinate post) {
        int dx [] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy [] = {-1, 0, 1, -1, 1, -1, 0, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(post.x, post.y));
        boolean visited [][] = new boolean [N][N];
        visited[post.x][post.y] = true;
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
                if (min <= elevations[nx][ny] && elevations[nx][ny] <= max) {
                    queue.add(new Coordinate(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
        if (count == targets) {
            return true;
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