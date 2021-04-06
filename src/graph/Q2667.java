package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2667 {
    /*
    public static int map [][];
    public static boolean visited [][];
    public static int size;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int [N][N];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                map[i][j] = line.charAt(j)-'0';
            }
        }
        visited = new boolean [N][N];
        int counter = 0;
        ArrayList<Pair> result = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (!visited[i][j] && map[i][j] == 1) {
                    ++counter;
                    size = 1;
                    visited[i][j] = true;
                    map[i][j] = counter;
                    dfs(i, j, N, counter);
                    result.add(new Pair(counter, size));
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int i=0; i<result.size(); ++i) {
            System.out.println(result.get(i).size);
        }
    }

    public static void dfs (int x, int y, int N, int counter) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || N<=nx || ny<0 || N<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (map[nx][ny] == 0) {
                continue;
            }
            map[nx][ny] = counter;
            visited[nx][ny] = true;
            ++size;
            dfs(nx, ny, N, counter);
        }
    }
     */
}

/*
class Pair implements Comparable<Pair>{
    int counter;
    int size;

    Pair (int counter, int size) {
        this.counter = counter;
        this.size = size;
    }

    public int compareTo (Pair p) {
        if (this.size > p.size) {
            return 1;
        } else if (this.size == p.size) {
            return 0;
        } else {
            return -1;
        }
    }
}
 */
