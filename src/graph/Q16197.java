package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16197 {
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        boolean flag = false;
        Coordinate first = null; Coordinate second = null;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == 'o') {
                    if (!flag) {
                        first = new Coordinate(i, j);
                        flag = true;
                    } else {
                        second = new Coordinate(i, j);
                    }
                }
            }
        }
        bfs(first, second, N, M);
    }

    public static void bfs (Coordinate first, Coordinate second, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> firstQ = new LinkedList<>();
        Queue<Coordinate> secondQ = new LinkedList<>();
        firstQ.add(new Coordinate(first.x, first.y, 0));
        secondQ.add(new Coordinate(second.x, second.y, 0));
        boolean visited [][][][] = new boolean [N][M][N][M];
        visited[first.x][first.y][second.x][second.y] = true;
        boolean flag = false;
        int answer = 0;

        while (!firstQ.isEmpty() || !secondQ.isEmpty()) {
            Coordinate target1 = firstQ.poll();
            Coordinate target2 = secondQ.poll();
            if (target1.times >= 10) {
                break;
            }
            if (target2.times >= 10) {
                break;
            }

            for (int i=0; i<4; ++i) {
                int nx1 = target1.x + dx[i];
                int ny1 = target1.y + dy[i];

                int nx2 = target2.x + dx[i];
                int ny2 = target2.y + dy[i];

                //System.out.println(nx1+","+ny1);
                //System.out.println(nx2+","+ny2);

                if ((nx1 < 0 || N<=nx1 || ny1<0 || M<=ny1) && (0<=nx2 && nx2<N && 0<=ny2 && ny2<M)) {
                    flag = true;
                    answer = target1.times+1;
                    break;
                }

                if ((nx2 < 0 || N<=nx2 || ny2<0 || M<=ny2) && (0<=nx1 && nx1<N && 0<=ny1 && ny1<M)) {
                    flag = true;
                    answer = target2.times+1;
                    break;
                }

                if ((nx1 < 0 || N<=nx1 || ny1<0 || M<=ny1) && (nx2<0 || N<=nx2 || ny2<0 || M<=ny2)) {
                    continue;
                }

                if (visited[nx1][ny1][nx2][ny2]) {
                    continue;
                }

                if (input[nx1][ny1] == '#' && input[nx2][ny2] == '#') {
                    continue;
                }

                if (input[nx1][ny1] == '#') {
                    nx1 = target1.x; ny1 = target1.y;
                }

                if (input[nx2][ny2] == '#') {
                    nx2 = target2.x; ny2 = target2.y;
                }

                visited[nx1][ny1][nx2][ny2] = true;
                firstQ.add(new Coordinate(nx1, ny1, target1.times+1));
                secondQ.add(new Coordinate(nx2, ny2, target2.times+1));
            }
            if (flag) {
                break;
            }
        }
        if (flag) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}

class Coordinate {
    int x;
    int y;
    int times;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int times) {
        this.x = x;
        this.y = y;
        this.times = times;
    }
}
