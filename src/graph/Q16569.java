package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q16569 {
    /*
    public static int R, C, elevation, time;
    public static int[][] island;
    public static boolean[][] covered;
    public static boolean[][] original;
    public static boolean[][] visited;
    public static Queue<Volcano> volcanoes;
    public static PriorityQueue<Person> queue;
    public static PriorityQueue<Person> next;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        island = new int[R + 1][C + 1];
        st = new StringTokenizer(br.readLine());
        int startR = Integer.parseInt(st.nextToken());
        int startC = Integer.parseInt(st.nextToken());
        for (int r = 1; r < R + 1; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 1; c < C + 1; ++c) island[r][c] = Integer.parseInt(st.nextToken());
        }
        volcanoes = new ArrayDeque<>();
        covered = new boolean[R + 1][C + 1];
        original = new boolean[R + 1][C + 1];
        visited = new boolean[R+1][C+1];
        ArrayList<Volcano> list = new ArrayList<>();
        for (int i = 0; i < V; ++i) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            original[r][c] = true;
            if (time == 0) {
                covered[r][c] = true;
                volcanoes.add(new Volcano(r, c, time));
            } else {
                list.add(new Volcano(r, c, time));
            }
        }
        Collections.sort(list);
        queue = new PriorityQueue<>();
        next = new PriorityQueue<>();
        queue.add(new Person(startR, startC, island[startR][startC], 0));
        visited[startR][startC] = true;
        elevation = island[startR][startC];
        time = 0;
        int current = 0;
        int index = 0;

        while (!queue.isEmpty()) {
            ++current;
            if (volcanoes.size() != 0) spread();
            if (index < list.size()) {
                int counter = 0;
                for (int i = index; i < list.size(); ++i) {
                    Volcano cur = list.get(i);
                    if (cur.time == current) {
                        ++counter;
                        volcanoes.add(cur);
                        covered[cur.r][cur.c] = true;
                    } else break;
                }
                index += counter;
            }
            next = new PriorityQueue<>();
            move(current);
        }
        System.out.println(elevation+" "+time);
    }

    public static void spread() {
        int size = volcanoes.size();
        for (int i = 0; i < size; ++i) {
            Volcano cur = volcanoes.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 1 || R < nr || nc < 1 || C < nc) continue;
                if (covered[nr][nc]) continue;
                covered[nr][nc] = true;
                volcanoes.add(new Volcano(nr, nc, cur.time));
            }
        }
    }

    public static void move(int current) {
        while (!queue.isEmpty()) {
            Person cur = queue.poll();
            if (elevation < cur.max) {
                elevation = cur.max;
                time = cur.time;
            }
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 1 || R < nr || nc < 1 || C < nc) continue;
                if (covered[nr][nc] || original[nr][nc] || visited[nr][nc]) continue;
                visited[nr][nc] = true;
                if (cur.max < island[nr][nc]) {
                    next.add(new Person(nr, nc, island[nr][nc], current));
                } else {
                    next.add(new Person(nr, nc, cur.max, cur.time));
                }
            }
        }
        queue = next;
    }
     */
}

/*
class Person implements Comparable<Person> {
    int r, c, max, time;

    Person(int r, int c, int max, int time) {
        this.r = r;
        this.c = c;
        this.max = max;
        this.time = time;
    }

    @Override
    public int compareTo(Person p) {
        if (this.max < p.max) return 1;
        else if (this.max == p.max) {
            if (this.time > p.time) return 1;
            else if (this.time == p.time) return 0;
            else return -1;
        } else return -1;
    }
}

class Volcano implements Comparable<Volcano> {
    int r, c, time;

    Volcano(int r, int c, int time) {
        this.r = r;
        this.c = c;
        this.time = time;
    }

    @Override
    public int compareTo(Volcano v) {
        if (this.time > v.time) return 1;
        else if (this.time == v.time) return 0;
        else return -1;
    }
}
 */