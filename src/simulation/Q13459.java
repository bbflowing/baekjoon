package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q13459 {
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int blueX = 0; int blueY = 0;
        int redX = 0; int redY = 0;
        input = new char [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == 'B') {
                    blueX = i; blueY = j;
                }
                if (input[i][j] == 'R') {
                    redX = i; redY = j;
                }
            }
        }
        bfs(redX, redY, blueX, blueY, N, M);
    }
    public static void bfs (int redX, int redY, int blueX, int blueY, int N, int M) {
        Queue<Status> queue = new LinkedList<>();
        boolean check [][][][] = new boolean [N][M][N][M];
        char status [][] = input.clone();
        int counter = 0;
        queue.add(new Status (redX, redY, blueX, blueY, status, check, counter));
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            Status next = queue.poll();
            check[next.redX][next.redY][next.blueX][next.blueY] = true;
            int nextRX = next.redX; int nextRY = next.redY; int nextBX = next.blueX; int nextBY = next.blueY;
            for (int i=0; i<4; ++i) {
                nextRX += dx[i];
                nextRY += dy[i];

                if (nextRX < 1 || N-1 <= nextRX || nextRY < 1 || M-1 <= nextRY) {
                    continue;
                }

            }
        }
    }
}

class Status {
    int redX;
    int redY;
    int blueX;
    int blueY;
    char status [][];
    boolean check [][][][];
    int counter;

    Status (int redX, int redY, int blueX, int blueY, char status [][], boolean check [][][][], int counter) {
        this.redX = redX;
        this.redY = redY;
        this.blueX = blueX;
        this.blueY = blueY;
        this.status = status;
        this.check = check;
        this.counter = counter;
    }
}
