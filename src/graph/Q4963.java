package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4963 {
    public static int dx [] = {-1, 1, 0, 0, -1, 1, -1, 1};
    public static int dy [] = {0, 0, -1, 1, -1, -1, 1, 1};
    public static int input [][];
    public static int Y;
    public static int X;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Y = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            input = new int [X][Y];
            if (X*Y == 0) {
                break;
            } else {
                for (int i=0; i<X; ++i) {
                    st = new StringTokenizer(br.readLine());
                    for (int j=0; j<Y; ++j) {
                        input[i][j] = Integer.parseInt(st.nextToken());
                    }
                }
                int counter = 0;
                for (int i=0; i<X; ++i) {
                    for (int j=0; j<Y; ++j) {
                        if (input[i][j] == 1) {
                            dfs(i, j);
                            ++counter;
                        }
                    }
                }
                System.out.println(counter);
            }


        }
    }

    public static void dfs (int x, int y) {
        input[x][y] = 0;
        for (int i=0; i<8; ++i) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 || X <= newX || newY < 0 || Y <= newY) {
                continue;
            }
            if (input[newX][newY] == 1) {
                dfs(newX, newY);
            }
        }
    }
}
