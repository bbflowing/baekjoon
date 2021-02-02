package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1937 {
    public static int input [][];
    public static void main (String args[]) throws IOException {
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        input = new int [N][N];
        int subInput [][] = new int [N][N];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
            subInput[i] = input[i].clone();
        }
        int answer = -1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                int temp = bfs(i, j, N, subInput);
                if (temp > answer) {
                    answer = temp;
                }
            }
        }
        System.out.println(answer);
         */
    }
    /*
    public static int bfs(int x, int y, int N, int subInput[][]) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y));
        int answer = -1;
        int temp [][] = new int [N][N];
        int days [][] = new int [N][N];
        for (int i=0; i<N; ++i) {
            Arrays.fill(days[i], 987_654_321);
        }
        for (int i=0; i<N; ++i) {
            temp[i] = subInput[i].clone();
        }
        days[x][y] = 1;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            for (int i=0; i<4; ++i) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];
                if (newX<0 || N<=newX || newY<0 || N <= newY) continue;
                if (days[newX][newY] != 987_654_321) continue;
                if (temp[current.x][current.y] < temp[newX][newY]) {
                    queue.add(new Coordinate(newX, newY));
                    days[newX][newY] = days[current.x][current.y] + 1;
                    if (days[newX][newY] > answer) {
                        answer = days[newX][newY];
                    }
                }
            }
        }
        return answer;
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