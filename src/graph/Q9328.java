package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q9328 {
    /*
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String answer = "";
        for (int i=0; i<T; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            map = new char [R+2][C+2];
            for (int j=0; j<R+2; ++j) {
                Arrays.fill(map[j], '.');
            }

            for (int j=1; j<=R; ++j) {
                String line = br.readLine();
                for (int k=1; k<=C; ++k) {
                    map[j][k] = line.charAt(k-1);
                }
            }
            String key = br.readLine();
            boolean keys []  = new boolean [26];
            if (!key.equals("0")) {
                for (int j=0; j<key.length(); ++j) {
                    keys[key.charAt(j)-'a'] = true;
                }
            }
            answer += solve(R, C, keys);
            if (i != T - 1) {
                answer += "\n";
            }
        }
        System.out.println(answer);
    }

    public static int solve (int R, int C, boolean [] keys) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        Queue<Coordinate> unavailable = new LinkedList<>();
        queue.add(new Coordinate(0, 0));
        boolean visited [][] = new boolean [R+2][C+2];
        visited[0][0] = true;
        int counter = 0;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || R+2<=nx || ny<0 || C+2<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }

                if (map[nx][ny] == '*') {
                    continue;
                } else if (map[nx][ny] == '$') {
                    ++counter;
                    visited[nx][ny] = true;
                    queue.add(new Coordinate(nx, ny));
                    continue;
                } else if (map[nx][ny] == '.') {
                    visited[nx][ny] = true;
                    queue.add(new Coordinate(nx, ny));
                    continue;
                } else if ('a' <= map[nx][ny] && map[nx][ny] <= 'z') {
                    visited[nx][ny] = true;
                    queue.add(new Coordinate(nx,ny));
                    if (!keys[map[nx][ny]-'a']) {
                        keys[map[nx][ny]-'a'] = true;
                        int size = unavailable.size();
                        for (int j=0; j<size; ++j) {
                            Coordinate check = unavailable.poll();
                            if (map[check.x][check.y]-'A' == map[nx][ny]-'a') {
                                queue.add(new Coordinate(check.x, check.y));
                                visited[check.x][check.y] = true;
                            } else {
                                unavailable.add(check);
                            }
                        }
                    }
                } else if ('A' <= map[nx][ny] && map[nx][ny] <= 'Z') {
                    if (keys[map[nx][ny]-'A']) {
                        visited[nx][ny] = true;
                        queue.add(new Coordinate(nx, ny));
                    } else {
                        unavailable.add(new Coordinate(nx, ny));
                    }
                }
            }
        }
        return counter;
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