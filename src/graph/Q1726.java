package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1726 {
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N+1][M+1];
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Status start = null; Status end = null;
        for (int i=0; i<2; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());
            if (i==0) {
                start = new Status(x, y, direction);
                continue;
            }
            end = new Status(x, y, direction);
        }
        bfs(start, end, N, M);
    }
    public static void bfs(Status start, Status end, int N, int M) {
        Queue<Status> queue = new LinkedList<>();
        boolean visited [][][] = new boolean [N+1][M+1][4+1];
        visited[start.x][start.y][start.direction] = true;
        queue.add(new Status(start.x, start.y, start.direction, 0));

        while (!queue.isEmpty()) {
            Status current = queue.poll();
            if (current.x == end.x && current.y == end.y && current.direction == end.direction) {
                System.out.println(current.count);
                break;
            }
            for (int i=0; i<2; ++i) {
                int ndir = setDirection(current.direction, i);
                if (visited[current.x][current.y][ndir]) {
                    continue;
                }
                visited[current.x][current.y][ndir] = true;
                queue.add(new Status(current.x, current.y, ndir, current.count+1));
                //System.out.println(current.x+","+current.y+","+ndir+","+(current.count+1));
            }

            for (int i=1; i<=3; ++i) {
                Status nlocation = setLocation(current, i);
                if (nlocation.x<1 || N+1<=nlocation.x || nlocation.y<1 || M+1<=nlocation.y) {
                    break;
                }
                if (visited[nlocation.x][nlocation.y][current.direction]) {
                    continue;
                }
                if (input[nlocation.x][nlocation.y] == 1) {
                    break;
                }
                visited[nlocation.x][nlocation.y][current.direction] = true;
                queue.add(new Status(nlocation.x, nlocation.y, current.direction, current.count+1));
                //System.out.println(nlocation.x+","+nlocation.y+","+current.direction+","+(current.count+1));
            }
        }
    }

    public static Status setLocation (Status current, int i) {
        int nx = current.x; int ny = current.y;
        if (current.direction == 1) { //east
            ny += i;
        } else if (current.direction == 2) { //west
            ny -= i;
        } else if (current.direction == 3) { //south
            nx += i;
        } else if (current.direction == 4) { //north
            nx -= i;
        }
        return new Status (nx, ny, 0);
    }
    public static int setDirection (int direction, int i) {
        if (direction == 1) { //east
            if (i==0) { //left
                return 4;// north
            } else if (i==1) { //right
                return 3;// south
            }
        } else if (direction == 2) { //west
            if (i==0) { //left
                return 3;// south
            } else if (i==1) { //right
                return 4;// north
            }

        } else if (direction == 3) { //south
            if (i==0) { //left
                return 1;// east
            } else if (i==1) { //right
                return 2;// west
            }

        } else if (direction == 4) { //north
            if (i==0) { //left
                return 2;// west
            } else if (i==1) { //right
                return 1;// east
            }

        }
        return 0;
    }
}

class Status {
    int x;
    int y;
    int direction;
    int count;

    Status (int x, int y, int direction, int count) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.count = count;
    }
    Status (int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
