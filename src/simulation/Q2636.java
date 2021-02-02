package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2636 {
    /*
    public static int input [][];
    public static int total;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        total = 0;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (input[i][j] == 1) {
                    ++total;
                }
            }
        }
        int answer = 0;
        int before = 0;
        while(true) {
            if (total == 0) {
                System.out.println(answer);
                System.out.println(before);
                break;
            } else {
                before = total;
                bfs(0, 0, N, M);
                ++answer;
            }
        }
    }

    public static void bfs(int x, int y, int N, int M) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y));
        boolean cheese[][] = new boolean[N][M];
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        int temp[][] = new int[N][M];
        for (int i = 0; i < N; ++i) {
            temp[i] = input[i].clone();
        }

        while (!queue.isEmpty()) {
            Coordinate next = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = next.x + dx[i];
                int ny = next.y + dy[i];

                if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                    continue;
                }
                if (cheese[nx][ny]) {
                    continue;
                }
                if (temp[nx][ny] == 0) {
                    queue.add(new Coordinate(nx, ny));
                    cheese[nx][ny] = true;
                } else if (temp[nx][ny] == 1) {
                    cheese[nx][ny] = true;
                    input[nx][ny] = 0;
                    --total;
                }
            }
        }
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