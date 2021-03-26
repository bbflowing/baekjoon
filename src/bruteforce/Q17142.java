package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17142 {
    /*
    public static int N, blanks, min;
    public static int laboratory [][];
    public static ArrayList<Coordinate> virus;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        laboratory = new int [N][N];
        virus = new ArrayList<>();
        blanks = 0;
        min = 987_654_321;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                laboratory[i][j] = Integer.parseInt(st.nextToken());
                if (laboratory[i][j] == 2) {
                    virus.add(new Coordinate(i, j));
                } else if (laboratory[i][j] == 0) {
                    ++blanks;
                }
            }
        }
        if (blanks == 0) {
            System.out.println(0);
        } else {
            Coordinate result[] = new Coordinate[M];
            combination(virus.size(), M, 0, 0, result);
            if (min == 987_654_321) {
                System.out.println(-1);
            } else {
                System.out.println(min);
            }
        }
    }

    public static void combination (int N, int R, int index, int start, Coordinate [] result) {
        if (index == R) {
            solve(result);
            return;
        }

        if (start == N) {
            return;
        }

        result[index] = virus.get(start);
        combination(N, R, index+1, start+1, result);
        combination(N, R, index, start+1, result);
    }

    public static boolean solve (Coordinate [] activated) {
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [N][N];
        for (int i=0; i<activated.length; ++i) {
            Coordinate target = activated[i];
            visited[target.x][target.y] = true;
            queue.add(new Coordinate(target.x, target.y, 0));
        }
        int unactivated = blanks;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (laboratory[nx][ny] == 1) {
                    continue;
                } else if (laboratory[nx][ny] == 2) {
                    queue.add(new Coordinate(nx, ny, c.time+1));
                    visited[nx][ny] = true;
                } else {
                    queue.add(new Coordinate(nx, ny, c.time+1));
                    visited[nx][ny] = true;
                    --unactivated;
                    if (unactivated == 0) {
                        if (min > c.time+1) {
                            min = c.time+1;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int time;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}
 */
