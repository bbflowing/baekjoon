package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2842 {
    /*
    public static char map [][];
    public static int weight [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new char [N][N];
        weight = new int [N][N];
        int startX = 0; int startY = 0; int villages = 0;
        ArrayList<Integer> values = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'P') {
                    startX = i; startY = j;
                } else if (map[i][j] == 'K') {
                    ++villages;
                }
            }
        }

        for (int i=0; i<N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                weight[i][j] = Integer.parseInt(st.nextToken());
                int target = weight[i][j];
                if (!values.contains(target)) {
                    values.add(target);
                }
            }
        }
        Collections.sort(values);
        int answer = bfs(values, startX, startY, villages, N);
        System.out.println(answer);
    }

    public static int bfs (ArrayList<Integer> values, int x, int y, int villages, int N) {
        int low = 0; int high = 0;
        int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        int min = 987_654_321;

        while (low < values.size()) {
            Queue<Coordinate> queue = new LinkedList<>();
            boolean visited[][] = new boolean[N][N];
            int value = weight [x][y];
            if (values.get(low) <= value && value <= values.get(high)) {
                queue.add(new Coordinate(x, y));
                visited[x][y] = true;
            }
            int count = 0;

            while (!queue.isEmpty()) {
                Coordinate c = queue.poll();
                if (map [c.x][c.y] == 'K') {
                    ++count;
                }
                for (int i = 0; i < 8; ++i) {
                    int nx = c.x + dx[i];
                    int ny = c.y + dy[i];

                    if (nx < 0 || N <= nx || ny < 0 || N <= ny) {
                        continue;
                    }
                    if (visited[nx][ny]) {
                        continue;
                    }
                    if (values.get(low) <= weight[nx][ny] && weight[nx][ny] <= values.get(high)) {
                        queue.add(new Coordinate(nx, ny));
                        visited[nx][ny] = true;
                    }
                }
            }
            if (villages == count) {
                if (min > values.get(high)-values.get(low)) {
                    min = values.get(high)-values.get(low);
                }
                ++low;
            } else if (high+1 < values.size()) {
                ++high;
            } else {
                break;
            }

        }
        return min;
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
