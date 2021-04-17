package graph;

import java.io.*;
import java.util.*;

public class Q9328 {
    /*
    public static int R, C;
    public static char building[][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            building = new char[R+2][C+2];
            for (int i=0; i<R+2; ++i) {
                Arrays.fill(building[i], '.');
            }
            for (int i=1; i<=R; ++i) {
                String line = br.readLine();
                for (int j=1; j<=C; ++j) {
                    building[i][j] = line.charAt(j-1);
                }
            }
            boolean keys[] = new boolean[26];
            String key = br.readLine();
            if (!key.equals("0")) {
                for (int i = 0; i < key.length(); ++i) {
                    keys[key.charAt(i) - 'a'] = true;
                }
            }
            bw.append(String.valueOf(solve(keys)));
            bw.newLine();
        }
        bw.flush();
    }

    public static int solve (boolean[] keys) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        Queue<Coordinate> unsolved = new LinkedList<>();
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited[][] = new boolean[R+2][C+2];
        queue.add(new Coordinate(0, 0));
        visited[0][0] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R+2<=nx || ny<0 || C+2<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (building[nx][ny] == '*') {
                    continue;
                } else if (building[nx][ny] == '.') {
                    queue.add(new Coordinate(nx, ny));
                    visited[nx][ny] = true;
                } else if ('A' <= building[nx][ny] && building[nx][ny] <= 'Z') {
                    if (keys[building[nx][ny]-'A']) {
                        queue.add(new Coordinate(nx, ny));
                        visited[nx][ny] = true;
                    } else {
                        unsolved.add(new Coordinate(nx, ny));
                    }
                } else if ('a' <= building[nx][ny] && building[nx][ny] <= 'z') {
                    queue.add(new Coordinate(nx, ny));
                    visited[nx][ny] = true;
                    if (!keys[building[nx][ny]-'a']) {
                        keys[building[nx][ny]-'a'] = true;
                        int size = unsolved.size();
                        for (int i=0; i<size; ++i) {
                            Coordinate check = unsolved.poll();
                            if (building[check.x][check.y]-'A' == building[nx][ny]-'a') {
                                queue.add(new Coordinate(check.x, check.y));
                                visited[check.x][check.y] = true;
                            } else {
                                unsolved.add(new Coordinate(check.x, check.y));
                            }
                        }
                    }
                } else if (building[nx][ny] == '$') {
                    queue.add(new Coordinate(nx, ny));
                    visited[nx][ny] = true;
                    ++count;
                }
            }
        }
        return count;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */