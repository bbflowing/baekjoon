package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14868 {
    /*
        spread the civilization using bfs
        union-find -> until there's only single root


    public static int map [][];
    public static boolean visited [][];
    public static int parent [][];
    public static ArrayList<Coordinate> list;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int [N][N];
        parent = new int [N][N];
        visited = new boolean [N][N];
        for (int i=0; i<K; ++i) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            map[N-x][y-1] = 1;
        }
        int counter = 0;
        ArrayList<ArrayList<Coordinate>> check  = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    list = new ArrayList<>();
                    ++counter;
                    visited[i][j] = true;
                    parent[i][j] = counter;
                    list.add(new Coordinate(i, j));
                    dfs(i, j, N, counter);
                    check.add(list);
                }
            }
        }
    }

    public static void bfs (int N, ArrayList<ArrayList<Coordinate>> check) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<ArrayList<Coordinate>> queue = new LinkedList<>();
        for (int i=0; i<check.size(); ++i) {
            queue.add(check.get(i));
        }

        while (!queue.isEmpty()) {
            ArrayList<Coordinate> current = queue.poll();
            ArrayList<Coordinate> next = new ArrayList<>();
            int temp [][] = new int [N][N];
            for (int i=0; i<N; ++i) {
                temp[i] = map[i].clone();
            }
            for (int i=0; i<current.size(); ++i) {
                Coordinate c = current.get(i);
                next.add(new Coordinate(c.x, c.y));
                for (int j = 0; j < 4; ++j) {
                    int nx = c.x + dx[j];
                    int ny = c.y + dy[j];

                    if (nx<0 || N<=nx || ny<0 || N<=ny) {
                        continue;
                    }
                    if (temp[nx][ny] == temp[c.x][c.y]) {
                        continue;
                    }
                    if (temp[nx][ny] == 0) {
                        map[nx][ny] = temp[c.x][c.y];
                    } else {
                        if (temp[nx][ny] > temp[c.x][c.y]) {
                            parent[nx][ny] = parent[c.x][c.y];
                        }
                    }

                }
            }
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
            parent[nx][ny] = counter;
            map[nx][ny] = counter;
            visited[nx][ny] = true;
            list.add(new Coordinate(nx, ny));
            dfs(nx, ny, N, counter);
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
