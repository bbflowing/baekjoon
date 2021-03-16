package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16928 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Coordinate> ladders = new ArrayList<>();
        int start = 0; int end = 0;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            ladders.add(new Coordinate(start, end));
        }
        ArrayList<Coordinate> snakes = new ArrayList<>();
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            snakes.add(new Coordinate(start, end));
        }

        bfs (ladders, snakes);
    }

    public static void bfs (ArrayList<Coordinate> ladders, ArrayList<Coordinate> snakes) {
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [] = new boolean [100+1];
        visited[1] = true;
        queue.add(new Coordinate(1, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == 100) {
                System.out.println(c.y);
                return;
            }
            for (int i=1; i<=6; ++i) {
                int next = c.x + i;
                if (next > 100) {
                    break;
                }
                if (visited[next]) {
                    continue;
                }
                boolean flag = false;
                visited[next] = true;
                for (int j=0; j<ladders.size(); ++j) {
                    if (ladders.get(j).x == next) {
                        if (!visited[ladders.get(j).y]) {
                            visited[ladders.get(j).y] = true;
                            queue.add(new Coordinate(ladders.get(j).y, c.y+1));
                        }
                        flag = true;
                        break;
                    }
                }

                for (int j=0; j<snakes.size(); ++j) {
                    if (snakes.get(j).x == next) {
                        if (!visited[snakes.get(j).y]) {
                            visited[snakes.get(j).y] = true;
                            queue.add(new Coordinate(snakes.get(j).y, c.y+1));
                        }
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    queue.add(new Coordinate(next, c.y+1));
                }
            }
        }
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
