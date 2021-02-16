package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Q17141 {
    public static int input [][];
    public static ArrayList<Coordinate> virus;
    public static ArrayList<Coordinate []> virusCombination;
    public static int counter;
    public static int min;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N][N];
        virus = new ArrayList<>();
        int totalVirus = 0;
        int blanks = 0;

        for (int i=0; i<N; ++i) {
            st =  new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (input[i][j] == 2) {
                    virus.add(new Coordinate(i, j));
                    ++totalVirus;
                } else if (input[i][j] == 0) {
                    ++blanks;
                }
            }
        }
        virusCombination = new ArrayList<>();
        int combinations = calculate(totalVirus, M);
        blanks += (totalVirus-M);
        boolean flag = false;

        for (int i=0; i<combinations; ++i) {
            virusCombination.add(new Coordinate [totalVirus-M]);
        }
        Coordinate [] set = new Coordinate [totalVirus-M];
        counter = 0;
        combination(set, totalVirus, M, totalVirus-M,0, 0);
        min = 987_654_321;
        for (int i=0; i<virusCombination.size(); ++i) {
            int temp [][] = new int [N][N];
            for (int j=0; j<N; ++j) {
                temp[j] = input[j].clone();
            }
            Coordinate target [] = virusCombination.get(i);
            for (int j=0; j<totalVirus-M; ++j) {
               temp[target[j].x][target[j].y] = 0;
            }
            int answer = bfs(temp, N, blanks);
            if (answer != -1) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }

    public static int bfs (int temp[][], int N, int blanks) {
        Queue<Coordinate> virus = new LinkedList<>();
        boolean visited [][] = new boolean [N][N];
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (temp[i][j] == 2) {
                    virus.add(new Coordinate(i, j, 0, blanks));
                    visited[i][j] = true;
                }
            }
        }
        /*
        for (int i=0; i<N; ++i) {
            System.out.println(Arrays.toString(temp[i]));
        }
        System.out.println();

         */
        int time = 0;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!virus.isEmpty()) {
            Coordinate current = virus.poll();

            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                if (temp[nx][ny] == 1 || temp[nx][ny] == 2) {
                    continue;
                }

                temp[nx][ny] = 2;
                visited[nx][ny] = true;
                --blanks;
                virus.add(new Coordinate(nx, ny, current.time+1, blanks));
            }
            ++time;
            if (blanks == 0) {
                if (min > time) {
                    min = time;
                }
                return 0;
            }
        }
        return -1;
    }
    public static int calculate (int totalVirus, int M) {
        int numerator = 1; int denominator = 1;
        for (int i=0; i<M; ++i) {
            numerator *= (totalVirus-i);
            denominator *= (i+1);
        }
        return numerator/denominator;
    }

    public static void combination (Coordinate set [], int totalVirus, int M, int neededVirus, int index, int start) {
        if (neededVirus == 0) {
            for (int i=0; i<totalVirus-M; ++i) {
                virusCombination.get(counter)[i] = set[i];
            }
            ++counter;
        } else if (start == totalVirus) {
            return;
        } else {
            set[index] = virus.get(start);
            combination(set, totalVirus, M, neededVirus-1, index+1, start+1);
            combination(set, totalVirus, M, neededVirus, index, start+1);
        }
    }
}

class Coordinate {
    int x;
    int y;
    int time;
    int blanks;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int time, int blanks) {
        this.x = x;
        this.y = y;
        this.time = time;
        this.blanks = blanks;
    }

}

