package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2980 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        TrafficLight road [] = new TrafficLight [L+1];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            int location = Integer.parseInt(st.nextToken());
            int red = Integer.parseInt(st.nextToken());
            int green = Integer.parseInt(st.nextToken());
            road[location] = new TrafficLight(red, green);
        }
        int time = 0;
        for (int i=1; i<=L; ++i) {
            ++time;
            if (road[i] != null) {
                int sum = road[i].red + road[i].green;
                int remain = time % sum;
                if (0 <= remain && remain <= road[i].red) {
                    time += (road[i].red - remain);
                }
            }
        }
        System.out.println(time);
    }
}
class TrafficLight {
    int red;
    int green;

    TrafficLight (int red, int green) {
        this.red = red;
        this.green = green;
    }
}
