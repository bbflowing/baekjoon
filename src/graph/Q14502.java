package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14502 {
    /*
    public static int laboratory [][];
    public static ArrayList<Coordinate> blanks;
    public static int N, M, answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        laboratory = new int [N][M];
        blanks = new ArrayList<>();
        int safe = 0;
        Queue<Coordinate> virus = new LinkedList<>();
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                laboratory[i][j] = Integer.parseInt(st.nextToken());
                if (laboratory[i][j] == 0) {
                    blanks.add(new Coordinate(i, j));
                    ++safe;
                } else if (laboratory[i][j] == 2) {
                    virus.add(new Coordinate(i, j));
                }
            }
        }
        answer = -1;
        for (int i=0; i<blanks.size()-2; ++i) {
            Coordinate first = blanks.get(i);
            for (int j=i+1; j<blanks.size()-1; ++j) {
                Coordinate second = blanks.get(j);
                for (int k=j+1; k<blanks.size(); ++k) {
                    Coordinate third = blanks.get(k);
                    Queue<Coordinate> temp = new LinkedList<>(virus);
                    laboratory[first.x][first.y] = 1;
                    laboratory[second.x][second.y] = 1;
                    laboratory[third.x][third.y] = 1;
                    bfs(temp, safe-3);
                    laboratory[first.x][first.y] = 0;
                    laboratory[second.x][second.y] = 0;
                    laboratory[third.x][third.y] = 0;
                }
            }
        }
        System.out.println(answer);

    }

    public static void bfs (Queue<Coordinate> virus, int safe) {
        boolean [][] visited = new boolean [N][M];
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!virus.isEmpty()) {
            Coordinate c = virus.poll();
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (laboratory[nx][ny] == 2 || laboratory[nx][ny] == 1) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                virus.add(new Coordinate(nx, ny));
                --safe;
            }
        }
        if (answer < safe) {
            answer = safe;
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