package graph;

import java.io.*;
import java.util.StringTokenizer;

public class Q11404 {
    /*
    public static int N;
    public static int distance[][];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        distance = new int[N + 1][N + 1];
        for (int i = 1; i <=N; ++i) {
            for (int j=1; j<=N; ++j) {
                if (i==j) {
                    continue;
                } else {
                    distance[i][j] = 987_654_321;
                }
            }
        }
        StringTokenizer st;
        for (int bus = 0; bus < M; ++bus) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            if (distance[x][y] > cost) distance[x][y] = cost;
        }
        floyd();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=1; i<=N; ++i) {
            String line = "";
            for (int j=1; j<=N; ++j) {
                if (distance[i][j] == 987_654_321) {
                    line += 0 + " ";
                } else {
                    line += distance[i][j] + " ";
                }
            }
            bw.append(line);
            bw.newLine();
        }
        bw.flush();
    }

    public static void floyd() {
        for (int transfer = 1; transfer <= N; ++transfer) {
            for (int start = 1; start <= N; ++start) {
                if (start != transfer) {
                    for (int arrive = 1; arrive <= N; ++arrive) {
                        if (transfer != arrive) {
                            if (distance[start][arrive] > distance[start][transfer] + distance[transfer][arrive]) {
                                distance[start][arrive] = distance[start][transfer] + distance[transfer][arrive];
                            }
                        }
                    }
                }
            }
        }
    }
     */
}
