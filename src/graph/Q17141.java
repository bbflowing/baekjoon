package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Q17141 {
    /*
    public static int N, M, answer, blanks;
    public static int laboratory[][];
    public static ArrayList<Coordinate> virus;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        laboratory = new int[N][N];
        virus = new ArrayList<>();
        blanks = 0;
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; ++j) {
                laboratory[i][j] = Integer.parseInt(st.nextToken());
                if (laboratory[i][j] == 2) {
                    laboratory[i][j] = 0;
                    virus.add(new Coordinate(i, j));
                } else if (laboratory[i][j] == 0) {
                    ++blanks;
                }
            }
        }
        blanks += virus.size()-M;
        if (blanks == 0) {
            System.out.println(0);
        } else {
            int size = virus.size();
            Coordinate result[] = new Coordinate[M];
            answer = 987_654_321;
            combination(size, M, 0, 0, result);
            if (answer == 987_654_321) {
                System.out.println(-1);
            } else {
                System.out.println(answer);
            }
        }

    }

    public static int bfs(Queue<Coordinate> queue) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        boolean visited[][] = new boolean[N][N];
        int spaces = blanks;
        int time = 0;
        while (!queue.isEmpty()) {
            ++time;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Coordinate c = queue.poll();
                visited[c.x][c.y] = true;
                for (int dir = 0; dir < 4; ++dir) {
                    int nx = c.x + dx[dir];
                    int ny = c.y + dy[dir];

                    if (nx < 0 || N <= nx || ny < 0 || N <= ny) {
                        continue;
                    }
                    if (laboratory[nx][ny] == 1 || laboratory[nx][ny] == 2) {
                        continue;
                    }
                    if (visited[nx][ny]) {
                        continue;
                    }
                    visited[nx][ny] = true;
                    --spaces;
                    queue.add(new Coordinate(nx, ny));
                }
            }

            if (spaces == 0) {
                return time;
            } else if (queue.size() == 0) {
                return -1;
            }
        }
        return -1;
    }

    public static void combination(int N, int R, int start, int index, Coordinate[] result) {
        if (index == R) {
            Queue<Coordinate> queue = new LinkedList<>();
            for (int i = 0; i < R; ++i) {
                Coordinate target = result[i];
                queue.add(new Coordinate(target.x, target.y));
                laboratory[target.x][target.y] = 2;
            }
            int time = bfs(queue);
            if (time < answer && time != -1) {
                answer = time;
            }
            for (int i = 0; i < R; ++i) {
                Coordinate target = result[i];
                laboratory[target.x][target.y] = 0;
            }
            return;
        }

        if (start == N) {
            return;
        }
        result[index] = virus.get(start);
        combination(N, R, start + 1, index + 1, result);
        combination(N, R, start + 1, index, result);
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