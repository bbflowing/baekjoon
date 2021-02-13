package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16948 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Coordinate start = new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
        Coordinate end = new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
        bfs(start, end, N);
    }
    public static void bfs (Coordinate start, Coordinate end, int N) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(start);
        boolean check [][] = new boolean [N][N];
        int dx [] = {-2, -2, 0, 0, 2, 2};
        int dy [] = {-1, 1, -2, 2, -1, 1};
        check[start.x][start.y] = true;
        int min = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (current.x == end.x && current.y == end.y) {
                min = current.distance;
                break;
            }
            for (int i=0; i<6; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    continue;
                }
                if (check[nx][ny]) {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, current.distance + 1));
                check[nx][ny] = true;
            }
        }

        if (min == 987_654_321) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
 */
