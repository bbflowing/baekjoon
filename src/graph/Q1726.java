package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1726 {
    /*
    public static int map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int [N+1][M+1];
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=M; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        Status start = new Status(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        Status end = new Status(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        bfs(start, end, N, M);
    }

    public static void bfs (Status start, Status end, int N, int M) {
        Queue<Status> queue = new LinkedList<>();
        boolean visited [][][] = new boolean [N+1][M+1][4+1];
        queue.add(new Status(start.x, start.y, start.direction, 0));
        visited[start.x][start.y][start.direction] = true;

        while (!queue.isEmpty()) {
            Status s = queue.poll();
            if (s.x == end.x && s.y == end.y && s.direction == end.direction) {
                System.out.println(s.orders);
                return;
            }
            int ndirection = s.direction; int norders = s.orders+1;
            for (int i=1; i<=3; ++i) {
                int nx = s.x; int ny = s.y;
                if (ndirection == 1 || ndirection == 2) { // east
                    if (ndirection == 1) {
                        ny += i;
                    } else if (ndirection == 2) {
                        ny -= i;
                    }
                    if (ny < 1 || M+1 <= ny) {
                        break;
                    }
                    if (visited[nx][ny][ndirection]) {
                        continue;
                    }
                    if (map[nx][ny] == 1) {
                        break;
                    }
                    visited[nx][ny][ndirection] = true;
                    queue.add(new Status(nx, ny, ndirection, norders));
                } else if (ndirection == 3 || ndirection == 4) { // south
                    if (ndirection == 3) {
                        nx += i;
                    } else if (ndirection == 4) {
                        nx -= i;
                    }
                    if (nx < 1 || N+1 <= nx) {
                        break;
                    }
                    if (visited[nx][ny][ndirection]) {
                        continue;
                    }
                    if (map[nx][ny] == 1) {
                        break;
                    }
                    visited[nx][ny][ndirection] = true;
                    queue.add(new Status(nx, ny, ndirection, norders));
                }
            }
            Directions turns = getDirection(ndirection);
            int nx = s.x; int ny = s.y;
            if (!visited[nx][ny][turns.left]) {
                visited[nx][ny][turns.left] = true;
                queue.add(new Status(nx, ny, turns.left, norders));
            }
            if (!visited[nx][ny][turns.right]) {
                visited[nx][ny][turns.right] = true;
                queue.add(new Status(nx, ny, turns.right, norders));
            }
        }
    }

    public static Directions getDirection (int direction) {
        if (direction == 1) { // east
            return new Directions (4, 3);
        } else if (direction == 2) { // west
            return new Directions (3, 4);
        } else if (direction == 3) { // south
            return new Directions (1, 2);
        } else { // north
            return new Directions (2, 1);
        }
    }
     */
}

/*
class Directions {
    int left;
    int right;

    Directions (int left, int right) {
        this.left = left;
        this.right = right;
    }
}
class Status {
    int x;
    int y;
    int direction; // 1: east, 2: west, 3: south, 4: north
    int orders;

    Status (int x, int y, int direction, int orders) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.orders = orders;
    }

    Status (int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
 */
