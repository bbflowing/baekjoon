package graph;

import java.io.*;
import java.util.*;

public class Q4991 {
    /*
    public static int C, R, startX, startY, answer;
    public static char map [][];
    public static int distances [][];
    public static ArrayList<Coordinate> dust;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean flag = false;
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            if (flag) {
                bw.newLine();
            }
            flag = true;
            StringTokenizer st = new StringTokenizer(line);
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            map = new char [R][C];
            dust = new ArrayList<>();
            startX = 0; startY = 0;
            answer = 987_654_321;
            int count = 1;
            for (int i=0; i<R; ++i) {
                line = br.readLine();
                for (int j=0; j<C; ++j) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == 'o') {
                        startX = i; startY = j;
                        map[i][j] = '.';
                    } else if (map[i][j] == '*') {
                        dust.add(new Coordinate(i, j));
                        ++count;
                    }
                }
            }
            dust.add(0, new Coordinate(startX, startY));
            distances = new int [count][count];
            for (int i=0; i<dust.size()-1; ++i) {
                for (int j=i+1; j<dust.size(); ++j) {
                    Coordinate start = dust.get(i);
                    Coordinate end = dust.get(j);
                    int distance = getDistance(start, end);
                    distances [i][j] = distance;
                    distances [j][i] = distance;
                }
            }

            dust.remove(0);
            --count;
            boolean visited [] = new boolean [count];
            int result [] = new int [count];
            permutation (count, visited, 0, result);
            if (answer != 987_654_321) {
                bw.append(String.valueOf(answer));
            } else {
                bw.append(String.valueOf(-1));
            }
        }
        bw.flush();
    }

    public static void permutation (int N, boolean [] visited, int index, int [] result) {
        if (index == N) {
            int order [] = new int [N+1];
            order[0] = 0;
            for (int i=1; i<N+1; ++i) {
                order[i] = result[i-1];
            }
            int total = 0;
            for (int i=0; i<N; ++i) {
                int start = order[i];
                int end = order[i+1];
                int distance = distances[start][end];
                if (distance == -1) {
                    return;
                }
                total += distance;
            }
            if (answer > total) {
                answer = total;
            }
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i+1;
                permutation(N, visited, index+1, result);
                visited[i] = false;
            }
        }
    }

    public static int getDistance (Coordinate start, Coordinate end) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [R][C];
        visited[start.x][start.y] = true;
        queue.add(new Coordinate(start.x, start.y, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == end.x && c.y == end.y) {
                return c.distance;
            }
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == 'x') {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.distance+1));
            }
        }
        return -1;
    }
    */
}
/*
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
 */