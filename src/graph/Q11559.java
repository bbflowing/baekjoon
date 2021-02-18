package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q11559 {
    /*
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = new char [12][6];
        for (int i=0; i<12; ++i) {
            String line = br.readLine();
            for (int j=0; j<6; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        boolean pop = true;
        int answer = 0;
        while (pop) {
            pop = false;
            for (int i=0; i<12; ++i) {
                for (int j=0; j<6; ++j) {
                    if (input[i][j] != '.') {
                        ArrayList<Coordinate> result = bfs(i, j);
                        if (result.size() >= 4) {
                            pop = true;
                            for (int k=0; k<result.size(); ++k) {
                                Coordinate target = result.get(k);
                                input[target.x][target.y] = '.';
                            }
                        }
                    }
                }
            }
            if (pop) {
                fall();
                ++answer;
            }
        }
        System.out.println(answer);
    }

    public static void fall() {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<6; ++i) {
            for (int j=0; j<12; ++j) {
                if (input[j][i] != '.') {
                    stack.push(input[j][i]);
                    input[j][i] = '.';
                }
            }
            for (int j=11; j>=0; --j) {
                if (stack.isEmpty()) {
                    input[j][i] = '.';
                } else {
                    input[j][i] = stack.pop();
                }
            }
        }
    }

    public static ArrayList<Coordinate> bfs (int x, int y) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        ArrayList<Coordinate> puyos = new ArrayList<>();
        queue.add(new Coordinate(x, y));
        boolean visited [][] = new boolean [12][6];
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            puyos.add(new Coordinate(current.x, current.y));
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || 12<=nx || ny<0 || 6<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (input[nx][ny] != input[x][y]) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny));
            }
        }
        return puyos;
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
