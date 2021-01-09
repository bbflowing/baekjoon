package graph;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576 {

    public static Queue<Coordinate> queue;
    public static int input [][];
    public static boolean check [][];
    public static int rank [][];
    public static void main (String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        queue = new LinkedList<>();
        check = new boolean [N][M];
        rank = new int[N][M];
        input = new int [N][M];
        int counter = 0;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (input[i][j] == 1) {
                    queue.add (new Coordinate(i, j));
                    check[i][j] = true;
                    rank[i][j] = 1;
                    counter++;
                }
            }
        }
        if (counter == N*M) {
            System.out.println(0);
        } else {
            bfs(N, M);
        }

    }
    public static void bfs(int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int counter = 0;

        while (!queue.isEmpty()) {
            Coordinate visited = queue.poll();

            for (int i=0; i<4; ++i) {
                int targetX = visited.x + dx[i];
                int targetY = visited.y + dy[i];
                if (0 <= targetX && targetX < N && 0 <= targetY && targetY < M) {
                    if (input[targetX][targetY] != -1 && !check[targetX][targetY]) {
                        rank[targetX][targetY] = rank[visited.x][visited.y] + 1;
                        check[targetX][targetY] = true;
                        queue.add(new Coordinate(targetX, targetY));
                    }
                }
            }
        }

        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (rank[i][j] == 0 && input[i][j] != -1) {
                    System.out.println(-1);
                    System.exit(0);
                } else {
                    if (rank[i][j] > counter) {
                        counter = rank[i][j];
                    }
                }
            }
        }
        System.out.println(counter-1);
    }
}


class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y =y;
    }
}

 */
