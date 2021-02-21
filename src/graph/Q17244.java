package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17244 {
    public static char input [][];
    public static boolean check [];
    public static Coordinate start, end;
    public static int N, M, answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new char [M][N];
        start = null; end = null;
        answer = 987_654_321;
        ArrayList<Coordinate> list = new ArrayList<>();
        int things = 0;

        for (int i=0; i<M; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == 'S') {
                    start = new Coordinate(i, j);
                } else if (input[i][j] == 'X') {
                    ++things;
                    list.add(new Coordinate(i, j));
                } else if (input[i][j] == 'E') {
                    end = new Coordinate(i, j);
                }
            }
        }
        if (things > 0) {
            check = new boolean[things];
            Coordinate[] result = new Coordinate[things];
            permutation(0, things, list, result);
            System.out.println(answer);
        } else {
            solve();
        }
    }

    public static void solve () {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean visited [][] = new boolean [M][N];
        visited[start.x][start.y] = true;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(start.x, start.y, 0));

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (current.x == end.x && current.y == end.y) {
                System.out.println(current.distance);
                break;
            }
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if (nx<0 || M<=nx || ny<0 || N<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (input[nx][ny] == '#') {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, current.distance+1));
                visited[nx][ny] = true;
            }
        }
    }

    public static void permutation (int index, int things, ArrayList<Coordinate> list, Coordinate [] result) {
        if (index == things) {
            bfs(result);
            return;
        }

        for (int i=0; i<things; ++i) {
            if (!check[i]) {
                result[index] = list.get(i);
                check[i] = true;
                permutation(index+1, things, list, result);
                check[i] = false;
            }
        }
    }

    public static void bfs (Coordinate [] result) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Coordinate begin = null;
        int total = 0;

        for (int i=0; i<=result.length; ++i) {

            Queue<Coordinate> queue = new LinkedList<>();
            boolean visited[][] = new boolean [M][N];

            Coordinate dst = null;

            if (i==0) {
                begin = new Coordinate(start.x, start.y);
                dst = result[i];
                queue.add(begin);
            } else if (i==result.length){
                dst = new Coordinate (end.x, end.y);
                queue.add(new Coordinate(begin.x, begin.y));
            } else {
                dst = result[i];
                queue.add(new Coordinate(begin.x, begin.y));
            }
            visited[begin.x][begin.y] = true;
            /*
            System.out.println("begin: "+begin.x+","+begin.y);
            System.out.println("dst: "+dst.x+","+dst.y);
            System.out.println();
            */

            while (!queue.isEmpty()) {
                Coordinate current = queue.poll();
                if (current.x == dst.x && current.y == dst.y) {
                    total += current.distance;
                    //System.out.println(begin.x+","+begin.y+"->"+dst.x+","+dst.y+" subtotal: "+current.distance);
                    //System.out.println(total);
                    break;
                }
                for (int j=0; j<4; ++j) {
                    int nx = current.x + dx[j];
                    int ny = current.y + dy[j];

                    if (nx<0 || M<=nx || ny<0 || N<=ny) {
                        continue;
                    }
                    if (visited[nx][ny]) {
                        continue;
                    }
                    if (input[nx][ny] == '#') {
                        continue;
                    }
                    visited[nx][ny] = true;
                    queue.add(new Coordinate(nx, ny, current.distance+1));
                }
            }
            begin = new Coordinate(dst.x, dst.y);
        }
        if (answer > total) {
            answer = total;
        }
    }
}

class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
