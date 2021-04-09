package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q17244 {
    /*
    public static int C, R, answer;
    public static char [][] house;
    public static int distances [][];
    public static ArrayList<Coordinate> list;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        house = new char [R][C];
        int startX = 0; int startY = 0;
        int endX = 0; int endY = 0;
        list = new ArrayList<>();
        int count = 2;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                house[i][j] = line.charAt(j);
                if (house[i][j] == 'S') {
                    startX = i; startY = j;
                } else if (house[i][j] == 'E') {
                    endX = i; endY = j;
                } else if (house[i][j] == 'X') {
                    list.add(new Coordinate(i, j));
                    ++count;
                }
            }
        }
        list.add(0, new Coordinate(startX, startY));
        list.add(new Coordinate(endX, endY));
        distances = new int [count][count];
        for (int i=0; i<list.size()-1; ++i) {
            for (int j=i+1; j<list.size(); ++j) {
                Coordinate start = list.get(i);
                Coordinate end = list.get(j);
                int distance = getDistance(start, end);
                distances[i][j] = distance;
                distances[j][i] = distance;
            }
        }

        count -= 2;
        list.remove(list.size()-1);
        list.remove(0);
        boolean visited [] = new boolean [count];
        int result [] = new int [count];
        answer = 987_654_321;
        permutation(count, 0, visited, result);
        System.out.println(answer);
    }

    public static void permutation (int N, int index, boolean [] visited, int [] result) {
        if (index == N) {
            int order [] = new int [N+2];
            order[0] = 0;
            for (int i=1; i<N+1; ++i) {
                order[i] = result[i-1];
            }
            order[N+1] = N+1;
            //System.out.println(Arrays.toString(order));
            int total = 0;
            for (int i=0; i<N+1; ++i) {
                int start = order[i];
                int end = order[i+1];
                int distance = distances[start][end];
                if (distance == -1) {
                    return;
                }
                total += distance;
            }
            if (answer > total) {
                answer = total;
            }
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i+1;
                permutation(N, index+1, visited, result);
                visited[i] = false;
            }
        }
    }

    public static int getDistance(Coordinate start, Coordinate end) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean visited [][] = new boolean [R][C];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(start.x, start.y, 0));
        visited[start.x][start.y] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == end.x && c.y == end.y) {
                return c.distance;
            }
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

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