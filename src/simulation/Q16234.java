package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16234 {
    /*
    public static int input [][];
    public static int check [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static Queue<Pair> queue;
    public static int value;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        input = new int [N][N];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        while (true) {
            boolean flag = false;
            check = new int [N][N];
            int counter = 1;
            for (int i=0; i<N; ++i) {
                for (int j=0; j<N; ++j) {
                    if (check[i][j] == 0) {
                        queue = new LinkedList<>();
                        dfs(i, j, L, R, N, counter);
                        int size = queue.size();
                        int value = 0;
                        int temp = 0;
                        if (size > 1) {
                            while (temp != size) {
                                Pair next = queue.poll();
                                value += input[next.x][next.y];
                                queue.add(next);
                                ++temp;
                            }
                            while (!queue.isEmpty()) {
                                Pair next = queue.poll();
                                input[next.x][next.y] = value/size;
                            }
                            flag = true;
                        }
                        ++counter;
                    }
                }
            }
            if (!flag) {
                break;
            } else {
                ++answer;
            }
        }
        System.out.println(answer);

    }

    public static void dfs(int x, int y, int L, int R, int N, int counter) {
        check[x][y] = counter;
        queue.add(new Pair (x, y, input[x][y]));
        for (int i=0; i<4; ++i) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 || N <= newX || newY < 0 || N <= newY) {
                continue;
            }

            int temp = Math.abs(input[x][y]-input[newX][newY]);
            if (L <= temp && temp <= R && check[newX][newY] == 0) {
                dfs(newX, newY, L, R, N, counter);
            }
        }
    }
    */
}

/*
class Pair {
    int x;
    int y;
    int value;

    Pair (int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }
}
 */
