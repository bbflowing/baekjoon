package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q16768 {
    /*
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N][10];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<10; ++j) {
                input[i][j] = line.charAt(j)-'0';
            }
        }

        boolean pop = true;
        while (pop) {
            pop = false;
            //boolean visited [][] = new boolean [N][10];
            for (int i=0; i<N; ++i) {
                for (int j=0; j<10; ++j) {
                    if (input[i][j] != 0) {
                        ArrayList<Coordinate> result = bfs(i, j, N);
                        //System.out.println(i+","+j);
                        if (result.size() >= M) {
                            for (int k=0; k<result.size(); ++k) {
                                Coordinate target = result.get(k);
                                input[target.x][target.y] = 0;
                            }
                            pop = true;
                        }
                    }
                }
            }
            if (pop) {
                fall(N);
            }
        }

        for (int i=0; i<N; ++i) {
            String line = "";
            for (int j=0; j<10; ++j) {
                line += input[i][j];
            }
            System.out.println(line);
        }
    }

    public static void fall(int N) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<10; ++i) {
            for (int j=0; j<N; ++j) {
                if (input[j][i] != 0) {
                    stack.push(input[j][i]);
                    input[j][i] = 0;
                }
            }
            for (int j=N-1; j>=0; --j) {
                if (stack.isEmpty()) {
                    input[j][i] = 0;
                } else {
                    input[j][i] = stack.pop();
                }
            }
        }
    }

    public static ArrayList<Coordinate> bfs (int x, int y, int N) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        ArrayList<Coordinate> list = new ArrayList<>();
        boolean visited [][] = new boolean [N][10];
        queue.add(new Coordinate(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            list.add(current);
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || 10<=ny) {
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
        return list;
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
