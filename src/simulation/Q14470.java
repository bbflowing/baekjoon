package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14470 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int time = 0;
        int status = 0; // -1: frozen, 0: 0 degrees, 1: unfrozen
        if (A < 0) {
            status = -1;
        } else if (A >= 0) {
            status = 1;
        }

        while (A != B) {
            if (status == -1) {
                time += C;
                A += 1;
                if (A > 0) {
                    status = 1;
                } else if (A == 0) {
                    status = 0;
                }
            } else if (status == 0) {
                time += D;
                status = 1;
            } else if (status == 1) {
                time += E;
                A += 1;
            }
        }
        System.out.println(time);
    }
}
