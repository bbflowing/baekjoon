package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q16930 {
    /*
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        input = new char [N+1][M+1];
        String line;
        for (int i=1; i<=N; ++i) {
            line = br.readLine();
            for (int j=1; j<=M; ++j) {
                input[i][j] = line.charAt(j-1);
            }
        }
        st = new StringTokenizer(br.readLine());
        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());
        int endX = Integer.parseInt(st.nextToken());
        int endY = Integer.parseInt(st.nextToken());

        bfs(startX, startY, endX, endY, N, M, K);
    }
    public static void bfs (int startX, int startY, int endX, int endY, int N, int M, int K) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(startX, startY, 0));
        HashMap<String, Boolean> visited = new HashMap<>();
        visited.put(startX+","+startY, true);



        boolean visited [][] = new boolean [N+1][M+1];
        visited[startX][startY] = true;

        int min = 987_654_321;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean flag = false;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = current.x; int ny = current.y;
                for (int j=1; j<=K; ++j) {
                    nx += dx[i];
                    ny += dy[i];
                    if (nx<1 || N+1<=nx || ny<1 || M+1<=ny) {
                        break;
                    }
                    if (input[nx][ny] == '#') {
                        break;
                    }

                    if (!visited[nx][ny]) {
                        continue;
                    }

                    if (nx == endX && ny == endY) {
                        System.out.println(current.time+1);
                        flag = true;
                        break;
                    }

                    visited[nx][ny] = true;
                    queue.add(new Coordinate(nx, ny, current.time+1));

                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
    */
}
/*
class Coordinate {
    int x;
    int y;
    int time;

    Coordinate(int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}

 */
