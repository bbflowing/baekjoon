package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Q16959 {
    /*
    public static int N;
    public static int board [][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int [N][N];
        StringTokenizer st;
        int x = 0; int y = 0;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    x = i; y = j;
                }
            }
        }
        bfs(x, y);
    }

    public static void bfs (int x, int y) {
        Queue<Coordinate> queue = new LinkedList<>();
        int max = (int) Math.pow(N, 2);
        boolean visited [][][][] = new boolean [3][N][N][max+1];
        for (int i=0; i<3; ++i) {
            visited[i][x][y][2] = true;
            queue.add(new Coordinate(i, x, y, 2, 0));
        }
        int knightX [] = {-1, -2, -2, -1, +1, +2, +2, +1};
        int knightY [] = {-2, -1, +1, +2, -2, -1, +1, +2};

        int bishopX [] = {-1, -1, +1, +1};
        int bishopY [] = {-1, +1, -1, +1};

        int rookX [] = {-1, 1, 0, 0};
        int rookY [] = {0, 0, -1, 1};


        while (!queue.isEmpty()) {
           Coordinate c = queue.poll();
           //System.out.println(c.x+","+c.y+","+c.target+","+c.distance);
            if (board[c.x][c.y] == max && c.target == max) {
                System.out.println(c.distance);
                return;
            } else if (board[c.x][c.y] == c.target) {
               visited[c.type][c.x][c.y][c.target+1] = true;
               queue.add(new Coordinate(c.type, c.x, c.y, c.target+1, c.distance));
               continue;
           } else { // not arrived at the target, change the piece
               for (int i=0; i<3; ++i) {
                   if (c.type != i) {
                       if (!visited[i][c.x][c.y][c.target]) {
                           visited[i][c.x][c.y][c.target] = true;
                           queue.add(new Coordinate(i, c.x, c.y, c.target, c.distance+1));
                       }
                   }
               }
           }

           if (c.type == 0) {
               for (int i=0; i<8; ++i) {
                   int nx = c.x + knightX[i];
                   int ny = c.y + knightY[i];

                   if (!check(nx, ny)) {
                       continue;
                   }
                   if (visited[c.type][nx][ny][c.target]) {
                       continue;
                   }
                   visited[c.type][nx][ny][c.target] = true;
                   queue.add(new Coordinate(c.type, nx, ny, c.target, c.distance+1));
               }
           } else if (c.type == 1) {
               for (int i=0; i<4; ++i) {
                   int nx = c.x; int ny = c.y;
                   while (true) {
                       nx += bishopX[i]; ny += bishopY[i];
                       if (!check(nx, ny)) {
                           break;
                       }
                       if (visited[c.type][nx][ny][c.target]) {
                           continue;
                       }
                       visited[c.type][nx][ny][c.target] = true;
                       queue.add(new Coordinate(c.type, nx, ny, c.target, c.distance+1));
                   }
               }
           } else if (c.type == 2) {
               for (int i=0; i<4; ++i) {
                   int nx = c.x; int ny = c.y;
                   while (true) {
                       nx += rookX[i]; ny += rookY[i];
                       if (!check(nx, ny)) {
                           break;
                       }
                       if (visited[c.type][nx][ny][c.target]) {
                           continue;
                       }
                       visited[c.type][nx][ny][c.target] = true;
                       queue.add(new Coordinate(c.type, nx, ny, c.target, c.distance+1));
                   }
               }
           }
        }
    }

    public static boolean check (int x, int y) {
        if (0 <= x && x < N && 0 <= y && y < N) {
            return true;
        }
        return false;
    }
    */
}
/*
class Coordinate {
    int type;
    int x;
    int y;
    int target;
    int distance;

    Coordinate (int type, int x, int y, int target, int distance) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.target = target;
        this.distance = distance;
    }
 */
