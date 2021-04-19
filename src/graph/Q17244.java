package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q17244 {
    /*
    public static int R, C, answer;
    public static char house[][];
    public static int distances[][];
    public static Coordinate start, end;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        house = new char[R][C];
        ArrayList<Coordinate> things = new ArrayList<>();
        start = null; end = null;
        int count = 0;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                house[i][j] = line.charAt(j);
                if (house[i][j] == 'X') {
                    things.add(new Coordinate(i, j));
                    ++count;
                } else if (house[i][j] == 'S') {
                    start = new Coordinate(i, j);
                } else if (house[i][j] == 'E') {
                    end = new Coordinate(i, j);
                }
            }
        }
        things.add(0, new Coordinate(start.x, start.y));
        things.add(new Coordinate(end.x, end.y));
        distances = new int[count+2][count+2];
        for (int i=0; i<count+1; ++i) {
            Coordinate begin = things.get(i);
            for (int j=i+1; j<count+2; ++j) {
                Coordinate dst = things.get(j);
                distances[i][j] = getDistance(begin, dst);
                distances[j][i] = distances[i][j];
            }
        }
        answer = 987_654_321;
        int result[] = new int[count];
        boolean visited[] = new boolean[count];
        permutation(count, 0, visited, result);
        System.out.println(answer);
    }

    public static int getDistance (Coordinate begin, Coordinate dst) {
        boolean visited[][] = new boolean[R][C];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(begin.x, begin.y, 0));
        visited[begin.x][begin.y] = true;
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == dst.x && c.y == dst.y) {
                return c.distance;
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (house[nx][ny] == '#') {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.distance+1));
            }
        }
        return -1;
    }

    public static void permutation (int N, int index, boolean[] visited, int[] result) {
        if (index == N) {
            int route[] = new int[N+2];
            route[0] = 0;
            for (int i=1; i<N+1; ++i) {
                route[i] = result[i-1]+1;
            }
            route[N+1] = N+1;
            int temp = 0;
            for (int i=0; i<N+1; ++i) {
                temp += distances[route[i]][route[i+1]];
                if (temp > answer) {
                    return;
                }
            }
            answer = temp;
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i;
                permutation(N, index+1, visited, result);
                visited[i] = false;
            }
        }
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
