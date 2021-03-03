package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11084 {
    /*
    public static int map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        map = new int [R+1][C+1];
        map[1][1] = 1;
        bfs(R, C);
    }

    public static void bfs (int R, int C) {
        int dx [] = {-1, -2, -2, -1, +1, +2, +2, +1};
        int dy [] = {-2, -1, +1, +2, -2, -1, +1, +2};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(1, 1));
        boolean visited [][] = new boolean [R+1][C+1];
        visited[1][1] = true;
        Pair distance [][] = new Pair [R+1][C+1];
        for (int i=1; i<=R; ++i) {
            for (int j=1; j<=C; ++j) {
                distance[i][j] = new Pair(987_654_321, 0);
            }
        }
        distance[1][1].count = 1;
        distance[1][1].distance = 0;
        double number = 1_000_000_009;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int i=0; i<8; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx < 1 || R+1 <= nx || ny < 1 || C+1 <= ny) {
                    continue;
                }
                if (!visited[nx][ny] || distance[nx][ny].distance == distance[c.x][c.y].distance + 1) {
                    distance[nx][ny].count = (distance[nx][ny].count + distance[c.x][c.y].count) % number;

                    if (!visited[nx][ny]) {
                        distance[nx][ny].distance = distance[c.x][c.y].distance + 1;
                        queue.add(new Coordinate(nx, ny));
                        visited[nx][ny] = true;
                    }
                    //System.out.println(nx+","+ny+","+distance[nx][ny].distance+","+(int)distance[nx][ny].count);
                }

            }

        }
        if (distance[R][C].count == 0) {
            System.out.println("None");
        } else {
            System.out.println(distance[R][C].distance +" "+(int)distance[R][C].count);
        }
    }
     */
}

/*
class Pair {
    int distance;
    double count;

    Pair (int distance, double count) {
        this.distance = distance;
        this.count = count;
    }
}

class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */
