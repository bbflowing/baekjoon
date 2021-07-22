package dijkstra;

// 비밀 모임

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q13424 {
    /*
    public static int N;
    public static ArrayList<ArrayList<Room>> corridors;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            corridors = new ArrayList<>();
            for (int i=0; i<N+1; ++i) corridors.add(new ArrayList<>());
            for (int i=0; i<M; ++i) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int distance = Integer.parseInt(st.nextToken());
                corridors.get(start).add(new Room(end, distance));
                corridors.get(end).add(new Room(start, distance));
            }
            int K = Integer.parseInt(br.readLine());
            int[] rooms = new int[K];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<K; ++i) rooms[i] = Integer.parseInt(st.nextToken());
            bw.append(String.valueOf(dijkstra(rooms)));
            bw.newLine();
        }
        bw.flush();
    }

    public static int dijkstra(int[] rooms) {
        int min = Integer.MAX_VALUE;
        int number = 0;
        for (int start=1; start<N+1; ++start) {
            PriorityQueue<Room> queue = new PriorityQueue<>();
            int[] visited = new int[N + 1];
            Arrays.fill(visited, Integer.MAX_VALUE);
            queue.add(new Room(start, 0));
            visited[start] = 0;

            while (!queue.isEmpty()) {
                Room cur = queue.poll();
                ArrayList<Room> target = corridors.get(cur.number);
                for (int i=0; i<target.size(); ++i) {
                    Room next = target.get(i);
                    if (cur.distance + next.distance < visited[next.number]) {
                        visited[next.number] = cur.distance + next.distance;
                        queue.add(new Room(next.number, visited[next.number]));
                    }
                }
            }
            int temp = 0;
            boolean flag = false;
            for (int i=0; i<rooms.length; ++i) {
                if (visited[rooms[i]] == Integer.MAX_VALUE) {
                    flag = true;
                    break;
                }
                temp += visited[rooms[i]];
            }
            if (!flag) {
                if (temp < min) {
                    min = temp;
                    number = start;
                }
            }
        }
        return number;
    }
     */
}

/*
class Room implements Comparable<Room> {
    int number, distance;

    Room (int number, int distance) {
        this.number = number;
        this.distance = distance;
    }

    @Override
    public int compareTo(Room r) {
        if (this.distance > r.distance) return 1;
        else return -1;
    }
}
 */
