package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2573 {
    public static int input [][];
    public static boolean visited [][];
    public static int ice;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        Queue<Pair> queue = new LinkedList<>();
        ice = 0;

        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (input[i][j] != 0) {
                    queue.add(new Pair(i, j, input[i][j]));
                    ++ice;
                }
            }
        }
        int time = 0;

        while (ice > 0) {
            queue = melt(queue, N, M);
            ++time;
            visited = new boolean [N][M];
            int counter = 0;
            for (int i=0; i<N; ++i) {
                for (int j=0; j<M; ++j) {
                    if (input[i][j] != 0 && !visited[i][j]) {
                        visited[i][j] = true;
                        ++counter;
                        dfs(i, j, N, M);
                        if (counter >= 2) {
                            System.out.println(time);
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println(0);


    }

    public static void dfs (int x, int y, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || N<=nx || ny<0 || M<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (input[nx][ny] == 0) {
                continue;
            }
            visited[nx][ny] = true;
            dfs(nx, ny, N, M);
        }
    }

    public static Queue<Pair> melt (Queue<Pair> queue, int N, int M) {
        int temp [][] = new int [N][M];
        for (int i=0; i<N; ++i) {
            temp[i] = input[i].clone();
        }

        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int size = queue.size();

        for (int i=0; i<size; ++i) {
            Pair current = queue.poll();
            int water = 0;
            for (int j=0; j<4; ++j) {
                int nx = current.x + dx[j];
                int ny = current.y + dy[j];

                if (0>nx || N<=nx || 0>ny || M<=ny) {
                    continue;
                }

                if (temp[nx][ny] == 0) {
                    ++water;
                }
            }
            if (current.height - water > 0) {
                input[current.x][current.y] = current.height - water;
                queue.add(new Pair(current.x, current.y, current.height-water));
            } else {
                input[current.x][current.y] = 0;
                --ice;
            }
        }
        return queue;
    }
}

class Pair {
    int x;
    int y;
    int height;

    Pair (int x, int y, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }
}
