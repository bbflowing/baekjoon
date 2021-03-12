package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2194 {
    /*
    public static int map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int [N+1][M+1];
        for (int i=0; i<K; ++i) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }
        st = new StringTokenizer(br.readLine());
        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int endX = Integer.parseInt(st.nextToken());
        int endY = Integer.parseInt(st.nextToken());
        bfs(startX, startY, endX, endY, N, M, A, B, A*B);
    }

    public static void bfs (int startX, int startY, int endX, int endY, int N, int M, int A, int B, int size) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(startX, startY, 0));
        boolean visited [][] = new boolean [N+1][M+1];
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == endX && c.y == endY) {
                System.out.println(c.distance);
                return;
            }

            for (int i=0; i<4; ++i) {
                int counter = 0;
                for (int j=0; j<A; ++j) {
                    boolean flag = false;
                    for (int k=0; k<B; ++k) {
                        int nx = c.x + j + dx[i];
                        int ny = c.y + k + dy[i];

                        if (nx < 1 || N + 1 <= nx || ny < 1 || M + 1 <= ny) {
                            flag = true;
                            break;
                        }
                        if (j == 0 && k == 0) {
                            if (visited[nx][ny]) {
                                flag = true;
                                break;
                            } else {
                                visited[nx][ny] = true;
                            }
                        }
                        if (map[nx][ny] == 1) {
                            flag = true;
                            break;
                        }
                        ++counter;
                    }
                    if (flag) {
                        break;
                    }
                }

                if (counter == size) {
                    queue.add(new Coordinate(c.x+dx[i], c.y+dy[i], c.distance+1));
                }
            }
        }
        System.out.println(-1);
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
