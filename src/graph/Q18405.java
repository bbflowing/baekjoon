package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q18405 {
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N+1][M+1];
        boolean check [][] = new boolean [N+1][M+1];
        Queue<Virus> queue = new LinkedList<>();
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (input[i][j] != 0) {
                    queue.add(new Virus(i, j, input[i][j]));
                    check[i][j] = true;
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(st.nextToken());
        bfs(x, y, N, M, time, queue, check);
    }
    public static void bfs(int x, int y, int N, int M, int time, Queue<Virus> queue, boolean [][] check) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int size = queue.size();
            int seconds = 0;
            for (int i=0; i<size; ++i) {
                if (seconds == time) {
                    System.out.println(input[x][y]);
                    System.exit(0);
                }
                Virus virus = queue.poll();
                for (int j=0; j<4; ++j) {
                    int nx = virus.x + dx[j];
                    int ny = virus.y + dy[j];

                    if (nx<0 || N<=nx || ny<0 || M<=ny) {
                        continue;
                    }
                    if (check[nx][ny]) {
                        continue;
                    }
                    if (input[nx][ny] != 0) {
                        continue;
                    }
                    check[nx][ny] = true;
                    input[nx][ny] = input[x][y];
                    queue.add(new Virus(nx, ny, input[x][y]));
                }
            }
            ++seconds;
        }
    }
}

class Virus implements Comparable<Virus>{
    int x;
    int y;
    int type;

    Virus (int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    @Override
    public int compareTo (Virus other) {
        return this.type - other.type;
    }
}
