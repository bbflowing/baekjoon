package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q17472 {
    /*
    public static int R, C, counter;
    public static int[][] input;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static Queue<Node> queue;
    public static int[] parents;
    public static PriorityQueue<Node> pq;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        input = new int[R][C];
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    input[r][c] = -1;
                }
            }
        }
        counter = 0;
        queue = new ArrayDeque<>();
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (input[r][c] == -1) {
                    ++counter;
                    grouping(r, c, counter);
                }
            }
        }

        parents = new int[counter+1];
        for (int i=1; i<=counter; ++i) {
            parents[i] = -1;
            //distances[i] = new ArrayList<>();
        }
        pq = new PriorityQueue<>();
        getDistance();
        System.out.println(getMST());
    }

    public static int find (int node) {
        if (parents[node] == -1) {
            return node;
        } else return parents[node] = find(parents[node]);
    }

    public static boolean union (int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            parents[b] = a;
            return true;
        } else {
            return false;
        }
    }

    public static int getMST() {
        int result = 0;
        while (!pq.isEmpty()) {
            Node n = pq.poll();
            if (union(n.start, n.dst)) { // yet not united
                result += n.cost;
            }
        }
        int roots = 0;
        for (int i=1; i<counter+1; ++i) {
            if (parents[i] == -1) {
                ++roots;
            }
        }

        return roots == 1 ? result : -1;
    }

    public static void getDistance() {
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = n.start + dr[dir];
                int nc = n.dst + dc[dir];
                int bridges = 0;

                while (0<=nr && nr<R && 0<=nc && nc<C) {
                    if (input[nr][nc] != 0) {
                        if (n.cost < input[nr][nc] && 2<=bridges) {
                            pq.add(new Node(input[n.start][n.dst], input[nr][nc], bridges));
                        }
                        break;
                    }
                    nr += dr[dir];
                    nc += dc[dir];
                    ++bridges;
                }
            }
        }
    }

    public static void grouping (int r, int c, int counter) {
        input[r][c] = counter;
        queue.add(new Node(r, c, counter));
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (input[nr][nc] == -1) {
                grouping(nr, nc, counter);
            }
        }
    }
     */
}

/*
class Node implements Comparable<Node>{
    int start;
    int dst;
    int cost;

    Node (int start, int dst, int cost) {
        this.start = start;
        this.dst = dst;
        this.cost = cost;
    }

    @Override
    public int compareTo (Node n) {
        return this.cost - n.cost;
    }
}
 */