package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q18404 {
    public static boolean input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //input = new boolean[N+1][N+1];
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        Queue<Coordinate> queue = new LinkedList<>();
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            queue.add(new Coordinate(x, y));
        }
        int map [][] = bfs(X, Y, N);
        String answer = "";
        for (int i=0; i<M; ++i) {
            Coordinate dst = queue.poll();
            answer += map[dst.x][dst.y]+" ";
        }
        System.out.println(answer);
    }

    public static int [][] bfs (int X, int Y, int N) {
        int dx [] = {-2, -2, -1, -1, 1, 1, 2, 2};
        int dy [] = {-1, 1, -2, 2, -2, 2, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        int map [][] = new int [N+1][N+1];
        for (int i=0; i<=N; ++i) {
            Arrays.fill(map[i], 987_654_321);
        }
        queue.add(new Coordinate(X, Y, 0));
        boolean check [][] = new boolean [N+1][N+1];
        check[X][Y] = true;
        map[X][Y] = 0;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            int ndistance = current.distance;
            for (int i=0; i<8; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if (nx<=0 || N+1<=nx || ny<=0 || N+1<=ny) {
                    continue;
                }
                if (check[nx][ny]) {
                    continue;
                }
                check[nx][ny] = true;
                map[nx][ny] = ndistance + 1;
                queue.add(new Coordinate(nx, ny, ndistance+1));
            }
        }
        return map;
    }
}

class Coordinate {
    int x;
    int y;
    int distance;
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
