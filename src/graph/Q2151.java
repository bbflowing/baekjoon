package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q2151 {
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new char [N][N];
        int startX = 0; int startY = 0;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == '#') {
                    startX = i; startY = j;
                }
            }
        }
        bfs(startX, startY, N);
    }

    public static void bfs (int startX, int startY, int N) {
        PriorityQueue<Mirror> queue = new PriorityQueue<>();
        queue.add(new Mirror(startX, startY, 0));
        boolean visited [][] = new boolean [N][N];
        visited [startX][startY] = true;
        int dx [] = {-1, -1, 1, 1};
        int dy [] = {-1, 1, -1, 1};
        int min = 2500;

        while (!queue.isEmpty()) {
            Mirror current = queue.poll();
            int ncount = current.count;

            for (int i=0; i<4; ++i) {
                int nx = current.x;
                int ny = current.y;
                while (true) {
                    nx += dx[i]; ny += dy[i];
                    if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                        break;
                    }
                    if (input[nx][ny] == '#' && !visited[nx][ny]) {
                        //System.out.println(current.x+","+current.y);
                        if (min > current.count) {
                            min = current.count;
                            //break;
                        }
                    }

                    if (input[nx][ny] == '!' && !visited[nx][ny]) {
                        queue.add(new Mirror(nx, ny, ncount+1));
                        //System.out.println(nx+", "+ny+", "+(ncount+1));
                        visited [nx][ny] = true;
                    }
                }
            }
        }
        System.out.println(min);
    }
}
class Mirror implements Comparable<Mirror>{
    int x;
    int y;
    int count;

    Mirror (int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }

    @Override
    public int compareTo (Mirror m) {
        return this.count - m.count;
    }
}

