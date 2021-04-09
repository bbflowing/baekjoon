package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1944 {
    /*
    public static char map [][];
    public static int size;
    public static int answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        size = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new char [size][size];
        ArrayList<Coordinate> keys = new ArrayList<>();
        Coordinate start = null;
        for (int i=0; i<size; ++i) {
            String line = br.readLine();
            for (int j=0; j<size; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'S') {
                    start = new Coordinate(i, j);
                } else if (map[i][j] == 'K') {
                    keys.add(new Coordinate(i, j));
                }
            }
        }
        Coordinate [] result = new Coordinate[K];
        boolean visited [] = new boolean [K];
        answer = 987_654_321;
        permutation (keys, start, K, 0, visited, result);
        System.out.println(answer);
    }

    public static void permutation (ArrayList<Coordinate> keys, Coordinate start, int N, int index,
                                    boolean visited [], Coordinate [] result) {
        if (index == N) {
            Coordinate route [] = new Coordinate [N+1];
            route[0] = start;
            for (int i=1; i<=N; ++i) {
                route[i] = result[i-1];
            }
            int distance = 0;

            for (int i=0; i<N; ++i) {
                //System.out.println(i);
                Coordinate begin = new Coordinate(route[i].x, route[i].y);
                Coordinate end = new Coordinate(route[i+1].x, route[i+1].y);
                //System.out.println("begin: "+begin.x+","+begin.y);
                //System.out.println("end: "+end.x+","+end.y);
                int temp = bfs(begin, end);
                //System.out.println(temp);
                if (temp == -1) {
                    return;
                } else {
                    distance += temp;
                }
            }
            if (distance < answer) {
                answer = distance;
            }
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                result [index] = keys.get(i);
                visited[i] = true;
                permutation(keys, start, N, index+1, visited, result);
                visited[i] = false;
            }
        }
    }

    public static int bfs (Coordinate begin, Coordinate end) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [size][size];
        visited[begin.x][begin.y] = true;
        queue.add(new Coordinate(begin.x, begin.y, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == end.x && c.y == end.y) {
                return c.distance;
            }
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || size<=nx || ny<0 || size<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == '1') {
                    continue;
                }
                visited[nx][ny] = true;
                //System.out.println(nx+","+ny);
                queue.add(new Coordinate(nx, ny, c.distance+1));
            }
        }
        return -1;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
 */
